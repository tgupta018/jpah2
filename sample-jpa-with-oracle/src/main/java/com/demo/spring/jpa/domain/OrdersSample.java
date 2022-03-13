package com.demo.spring.jpa.domain;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@DynamicInsert
@DynamicUpdate
//@MappedSuperclass
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name = "ORDERS")
@Data
@EntityListeners(AuditingEntityListener.class)
public class OrdersSample implements Serializable {

    private static final long serialVersionUID = -4013017391812186689L;

    @Column(name = "CREATED_BY", columnDefinition = "varchar2(60) default 'spring-boot'", updatable = false, nullable = false)
    @CreatedBy
    private String createdBy;

    @CreatedDate
    @Temporal(TemporalType.DATE)
    @Column(name = "CREATION_DATE", nullable = false)
    private Date creationDate;

    @Column(name = "LAST_UPDATED_BY",columnDefinition = "varchar2(60) default 'spring-boot'", nullable = false)
    @LastModifiedBy
    private String lastUpdatedBy;

    @LastModifiedDate
    @Column(name = "LAST_UPDATE_DATE", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date lastUpdateDate;


    @Column(name = "CUSTOMER_COLLECT_FLAG", nullable = false, length = 1)
    private String customerCollectFlag;
    @Column(name = "FREE_SHIPPING_FLAG", nullable = false, length = 1)
    private String freeShippingFlag;
    @Column(name = "GIFTWRAP_FLAG", nullable = false, length = 1)
    private String giftwrapFlag;
    @Column(name = "GIFTWRAP_MESSAGE", length = 2000)
    private String giftwrapMessage;

    @Column(name = "OBJECT_VERSION_ID", nullable = false)
    @Version
    private Long objectVersionId;
    @Temporal(TemporalType.DATE)
    @Column(name = "ORDER_DATE", nullable = false)
    private Date orderDate;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_sequence")
    @SequenceGenerator(sequenceName = "ORDER_SEQ", name = "order_sequence", allocationSize = 1)
    @Column(name = "ORDER_ID", nullable = false)
    private Long orderId;
    @Temporal(TemporalType.DATE)
    @Column(name = "ORDER_SHIPPED_DATE")
    private Date orderShippedDate;
    @Column(name = "ORDER_STATUS_CODE", nullable = false, length = 30)
    private String orderStatusCode;
    @Column(name = "ORDER_TOTAL", nullable = false)
    private Integer orderTotal;
    @Column(name = "SHIP_TO_NAME", length = 120)
    private String shipToName;
    @Column(name = "SHIP_TO_PHONE_NUMBER", length = 20)
    private String shipToPhoneNumber;

    public OrdersSample() {
    }

    public OrdersSample(
            String customerCollectFlag,
            String freeShippingFlag,
            String giftwrapFlag, String giftwrapMessage,
            Long objectVersionId, Date orderDate, Date orderShippedDate, String orderStatusCode,
            Integer orderTotal,
            String shipToName,
            String shipToPhoneNumber
    ) {
        this.customerCollectFlag = customerCollectFlag;
        this.freeShippingFlag = freeShippingFlag;
        this.giftwrapFlag = giftwrapFlag;
        this.giftwrapMessage = giftwrapMessage;
        this.objectVersionId = objectVersionId;
        this.orderDate = orderDate;
        this.orderShippedDate = orderShippedDate;
        this.orderStatusCode = orderStatusCode;
        this.orderTotal = orderTotal;
        this.shipToName = shipToName;
        this.shipToPhoneNumber = shipToPhoneNumber;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName() + "@" + Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("createdBy=");
        buffer.append(getCreatedBy());
        buffer.append(',');
        buffer.append("creationDate=");
        buffer.append(getCreationDate());
        buffer.append(',');
        buffer.append("customerCollectFlag=");
        buffer.append(getCustomerCollectFlag());
        buffer.append(',');
        buffer.append("freeShippingFlag=");
        buffer.append(getFreeShippingFlag());
        buffer.append(',');
        buffer.append("giftwrapFlag=");
        buffer.append(getGiftwrapFlag());
        buffer.append(',');
        buffer.append("giftwrapMessage=");
        buffer.append(getGiftwrapMessage());
        buffer.append(',');
        buffer.append("lastUpdateDate=");
        buffer.append(getLastUpdateDate());
        buffer.append(',');
        buffer.append("lastUpdatedBy=");
        buffer.append(getLastUpdatedBy());
        buffer.append(',');
        buffer.append("objectVersionId=");
        buffer.append(getObjectVersionId());
        buffer.append(',');
        buffer.append("orderDate=");
        buffer.append(getOrderDate());
        buffer.append(',');
        buffer.append("orderId=");
        buffer.append(getOrderId());
        buffer.append(',');
        buffer.append("orderShippedDate=");
        buffer.append(getOrderShippedDate());
        buffer.append(',');
        buffer.append("orderStatusCode=");
        buffer.append(getOrderStatusCode());
        buffer.append(',');
        buffer.append("orderTotal=");
        buffer.append(getOrderTotal());
        buffer.append(',');
        buffer.append("shipToName=");
        buffer.append(getShipToName());
        buffer.append(',');
        buffer.append("shipToPhoneNumber=");
        buffer.append(getShipToPhoneNumber());
        buffer.append(',');
        buffer.append(']');
        return buffer.toString();
    }

}
