package com.demo.spring.service.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({ @NamedQuery(name = "DemoOptions.findAll", query = "select o from DemoOptions o") })
@Table(name = "DEMO_OPTIONS")
public class DemoOptions implements Serializable {
    private static final long serialVersionUID = 2292983344486679235L;
    @Column(nullable = false, length = 4000)
    private String description;
    @Column(name = "JAVA_DATA_TYPE", nullable = false, length = 120)
    private String javaDataType;
    @Id
    @Column(nullable = false, length = 40)
    private String key;
    @Column(length = 120)
    private String value;

    public DemoOptions() {
    }

    public DemoOptions(String description, String javaDataType, String key, String value) {
        this.description = description;
        this.javaDataType = javaDataType;
        this.key = key;
        this.value = value;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getJavaDataType() {
        return javaDataType;
    }

    public void setJavaDataType(String javaDataType) {
        this.javaDataType = javaDataType;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName() + "@" + Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("description=");
        buffer.append(getDescription());
        buffer.append(',');
        buffer.append("javaDataType=");
        buffer.append(getJavaDataType());
        buffer.append(',');
        buffer.append("key=");
        buffer.append(getKey());
        buffer.append(',');
        buffer.append("value=");
        buffer.append(getValue());
        buffer.append(']');
        return buffer.toString();
    }
}
