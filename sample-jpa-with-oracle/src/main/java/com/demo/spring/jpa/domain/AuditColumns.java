package com.demo.spring.jpa.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@DynamicInsert
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AuditColumns implements Serializable {
    @CreatedDate
    @Column(name = "CREATION_DATE", updatable = false, nullable = false)
//  @Temporal(TemporalType.TIMESTAMP)
    @Temporal(TemporalType.DATE)
    private Date creationDate;

    @LastModifiedDate
    @Column(name = "LAST_UPDATE_DATE", nullable = false)
//  @Temporal(TemporalType.TIMESTAMP)
    @Temporal(TemporalType.DATE)
    private Date lastUpdateDate;

    @Column(name = "CREATED_BY", columnDefinition = "varchar2(60) default 'spring-boot'", updatable = false, nullable = false, length = 60)
//    @SizeConstraint(minSize=1, maxSize=60)
    @CreatedBy
    private String createdBy;

    @Column(name = "LAST_UPDATED_BY",columnDefinition = "varchar2(60) default 'spring-boot'", nullable = false, length = 60)
    @LastModifiedBy
    private String lastUpdatedBy;

}
