package com.demo.spring.jpa.config;


import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;


@Configuration
@Slf4j
@Data
@EnableConfigurationProperties
@ConditionalOnProperty(value = "db.enabled", havingValue = "true", matchIfMissing = true)
@Profile("!unit-test")
public class DatabaseConfig {

    @Value("${sample.db.jdbc.url}")
    private String url;
    @Value("${sample.db.jdbc.username}")
    private String username;
    @Value("${sample.db.jdbc.password}")
    private String password;
    @Value("${sample.db.jdbc.max-pool-size}")
    private int maxPoolSize;

    @Bean
    @Primary
    public DataSource dataSource(){
        HikariConfig hikariConfig = getHikariConfig();
        hikariConfig.setJdbcUrl(url);
        hikariConfig.setUsername(username);
        hikariConfig.setPassword(password);
        hikariConfig.setMaximumPoolSize(maxPoolSize);
        hikariConfig.setConnectionTimeout(16000);
        hikariConfig.setMaxLifetime(180000);
        return getHikariDataSource(hikariConfig);

    }

    protected HikariConfig getHikariConfig(){
        return new HikariConfig();
    }

    protected HikariDataSource getHikariDataSource(HikariConfig hikariConfig){
        return new HikariDataSource(hikariConfig);
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter(){
        HibernateJpaVendorAdapter hibernateJpaVendorAdapter = new HibernateJpaVendorAdapter();
        hibernateJpaVendorAdapter.setShowSql(true);
        return hibernateJpaVendorAdapter;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(final DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }

    @Bean
    public NamedParameterJdbcTemplate namedParameterJdbcTemplate(final DataSource dataSource){
        return new NamedParameterJdbcTemplate(dataSource);
    }

}
