package com.demo.spring.jpa.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;

import java.util.Date;

import java.util.List;

import javax.persistence.*;

@DynamicInsert
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name = "ORDERS")
@Data
@AllArgsConstructor
@Builder
@EntityListeners(AuditingEntityListener.class)
//@NamedQueries({ @NamedQuery(name = "Orders.findAll", query = "select o from Orders o") })
public class Orders extends AuditColumns implements Serializable {
    private static final long serialVersionUID = -4013017391812186689L;
    //    @Column(name = "CREATED_BY", nullable = false, length = 60)
//    private String createdBy;
//    @Temporal(TemporalType.DATE)
//    @Column(name = "CREATION_DATE", nullable = false)
//    private Date creationDate;
    @Column(name = "CUSTOMER_COLLECT_FLAG", nullable = false, length = 1)
    private String customerCollectFlag;
    @Column(name = "FREE_SHIPPING_FLAG", nullable = false, length = 1)
    private String freeShippingFlag;
    @Column(name = "GIFTWRAP_FLAG", nullable = false, length = 1)
    private String giftwrapFlag;
    @Column(name = "GIFTWRAP_MESSAGE", length = 2000)
    private String giftwrapMessage;
    //    @Column(name = "LAST_UPDATED_BY", nullable = false, length = 60)
//    private String lastUpdatedBy;
//    @Temporal(TemporalType.DATE)
//    @Column(name = "LAST_UPDATE_DATE", nullable = false)
//    private Date lastUpdateDate;
    @Column(name = "OBJECT_VERSION_ID", nullable = false)
    private Long objectVersionId;
    @Temporal(TemporalType.DATE)
    @Column(name = "ORDER_DATE", nullable = false)
    private Date orderDate;
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "order_sequence")
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
    //    @ManyToOne
//    @JoinColumn(name = "SHIPPING_OPTION_ID")
//    private ShippingOptionsBase shippingOptionsBase;
//    @ManyToOne
//    @JoinColumn(name = "COUPON_ID")
//    private DiscountsBase discountsBase1;
//    @OneToMany(mappedBy = "orders", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
//    private List<CouponUsages> couponUsagesList;
//    @ManyToOne
//    @JoinColumn(name = "COLLECTION_WAREHOUSE_ID")
//    private Warehouses warehouses;
//    @ManyToOne
//    @JoinColumn(name = "CUSTOMER_ID")
//    private Persons persons3;
    @JsonManagedReference
    @OneToMany(mappedBy = "orders1", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<OrderItems> orderItemsList1;
//    @ManyToOne
//    @JoinColumn(name = "PAYMENT_OPTION_ID")
//    private PaymentOptions paymentOptions;
//    @ManyToOne
//    @JoinColumn(name = "DISCOUNT_ID")
//    private DiscountsBase discountsBase3;
//    @ManyToOne
//    @JoinColumn(name = "SHIP_TO_ADDRESS_ID")
//    private Addresses addresses3;

    public Orders() {
    }

    public Orders(
            // Warehouses warehouses, DiscountsBase discountsBase1,
            String createdBy, Date creationDate,
            String customerCollectFlag,
            //Persons persons3, DiscountsBase discountsBase3,
            String freeShippingFlag,
            String giftwrapFlag, String giftwrapMessage, Date lastUpdateDate, String lastUpdatedBy,
            Long objectVersionId, Date orderDate, Long orderId, Date orderShippedDate, String orderStatusCode,
            Integer orderTotal,
            //PaymentOptions paymentOptions, Addresses addresses3,
            String shipToName,
            String shipToPhoneNumber
            //, ShippingOptionsBase shippingOptionsBase
    ) {
//        this.warehouses = warehouses;
//        this.discountsBase1 = discountsBase1;
//        this.createdBy = createdBy;
//        this.creationDate = creationDate;
        this.customerCollectFlag = customerCollectFlag;
//        this.persons3 = persons3;
//        this.discountsBase3 = discountsBase3;
        this.freeShippingFlag = freeShippingFlag;
        this.giftwrapFlag = giftwrapFlag;
        this.giftwrapMessage = giftwrapMessage;
//        this.lastUpdateDate = lastUpdateDate;
//        this.lastUpdatedBy = lastUpdatedBy;
        this.objectVersionId = objectVersionId;
        this.orderDate = orderDate;
        this.orderId = orderId;
        this.orderShippedDate = orderShippedDate;
        this.orderStatusCode = orderStatusCode;
        this.orderTotal = orderTotal;
//        this.paymentOptions = paymentOptions;
//        this.addresses3 = addresses3;
        this.shipToName = shipToName;
        this.shipToPhoneNumber = shipToPhoneNumber;
//        this.shippingOptionsBase = shippingOptionsBase;
    }


//    public String getCreatedBy() {
//        return createdBy;
//    }
//
//    public void setCreatedBy(String createdBy) {
//        this.createdBy = createdBy;
//    }
//
//    public Date getCreationDate() {
//        return creationDate;
//    }
//
//    public void setCreationDate(Date creationDate) {
//        this.creationDate = creationDate;
//    }
//
//    public String getCustomerCollectFlag() {
//        return customerCollectFlag;
//    }
//
//    public void setCustomerCollectFlag(String customerCollectFlag) {
//        this.customerCollectFlag = customerCollectFlag;
//    }
//
//
//    public String getFreeShippingFlag() {
//        return freeShippingFlag;
//    }
//
//    public void setFreeShippingFlag(String freeShippingFlag) {
//        this.freeShippingFlag = freeShippingFlag;
//    }
//
//    public String getGiftwrapFlag() {
//        return giftwrapFlag;
//    }
//
//    public void setGiftwrapFlag(String giftwrapFlag) {
//        this.giftwrapFlag = giftwrapFlag;
//    }
//
//    public String getGiftwrapMessage() {
//        return giftwrapMessage;
//    }
//
//    public void setGiftwrapMessage(String giftwrapMessage) {
//        this.giftwrapMessage = giftwrapMessage;
//    }
//
//    public String getLastUpdatedBy() {
//        return lastUpdatedBy;
//    }
//
//    public void setLastUpdatedBy(String lastUpdatedBy) {
//        this.lastUpdatedBy = lastUpdatedBy;
//    }
//
//    public Date getLastUpdateDate() {
//        return lastUpdateDate;
//    }
//
//    public void setLastUpdateDate(Date lastUpdateDate) {
//        this.lastUpdateDate = lastUpdateDate;
//    }
//
//    public Long getObjectVersionId() {
//        return objectVersionId;
//    }
//
//    public void setObjectVersionId(Long objectVersionId) {
//        this.objectVersionId = objectVersionId;
//    }
//
//    public Date getOrderDate() {
//        return orderDate;
//    }
//
//    public void setOrderDate(Date orderDate) {
//        this.orderDate = orderDate;
//    }
//
//    public Long getOrderId() {
//        return orderId;
//    }
//
//    public void setOrderId(Long orderId) {
//        this.orderId = orderId;
//    }
//
//    public Date getOrderShippedDate() {
//        return orderShippedDate;
//    }
//
//    public void setOrderShippedDate(Date orderShippedDate) {
//        this.orderShippedDate = orderShippedDate;
//    }
//
//    public String getOrderStatusCode() {
//        return orderStatusCode;
//    }
//
//    public void setOrderStatusCode(String orderStatusCode) {
//        this.orderStatusCode = orderStatusCode;
//    }
//
//    public Integer getOrderTotal() {
//        return orderTotal;
//    }
//
//    public void setOrderTotal(Integer orderTotal) {
//        this.orderTotal = orderTotal;
//    }
//
//
//    public String getShipToName() {
//        return shipToName;
//    }
//
//    public void setShipToName(String shipToName) {
//        this.shipToName = shipToName;
//    }
//
//    public String getShipToPhoneNumber() {
//        return shipToPhoneNumber;
//    }
//
//    public void setShipToPhoneNumber(String shipToPhoneNumber) {
//        this.shipToPhoneNumber = shipToPhoneNumber;
//    }
//
//    public ShippingOptionsBase getShippingOptionsBase() {
//        return shippingOptionsBase;
//    }
//
//    public void setShippingOptionsBase(ShippingOptionsBase shippingOptionsBase) {
//        this.shippingOptionsBase = shippingOptionsBase;
//    }
//
//    public DiscountsBase getDiscountsBase1() {
//        return discountsBase1;
//    }
//
//    public void setDiscountsBase1(DiscountsBase discountsBase1) {
//        this.discountsBase1 = discountsBase1;
//    }
//
//    public List<CouponUsages> getCouponUsagesList() {
//        return couponUsagesList;
//    }
//
//    public void setCouponUsagesList(List<CouponUsages> couponUsagesList) {
//        this.couponUsagesList = couponUsagesList;
//    }
//
//    public CouponUsages addCouponUsages(CouponUsages couponUsages) {
//        getCouponUsagesList().add(couponUsages);
//        couponUsages.setOrders(this);
//        return couponUsages;
//    }
//
//    public CouponUsages removeCouponUsages(CouponUsages couponUsages) {
//        getCouponUsagesList().remove(couponUsages);
//        couponUsages.setOrders(null);
//        return couponUsages;
//    }
//
//    public Warehouses getWarehouses() {
//        return warehouses;
//    }
//
//    public void setWarehouses(Warehouses warehouses) {
//        this.warehouses = warehouses;
//    }
//
//    public Persons getPersons3() {
//        return persons3;
//    }
//
//    public void setPersons3(Persons persons3) {
//        this.persons3 = persons3;
//    }
//
//    public List<OrderItems> getOrderItemsList1() {
//        return orderItemsList1;
//    }
//
//    public void setOrderItemsList1(List<OrderItems> orderItemsList1) {
//        this.orderItemsList1 = orderItemsList1;
//    }
//
//    public OrderItems addOrderItems(OrderItems orderItems) {
//        getOrderItemsList1().add(orderItems);
//        orderItems.setOrders1(this);
//        return orderItems;
//    }
//
//    public OrderItems removeOrderItems(OrderItems orderItems) {
//        getOrderItemsList1().remove(orderItems);
//        orderItems.setOrders1(null);
//        return orderItems;
//    }
//
//    public PaymentOptions getPaymentOptions() {
//        return paymentOptions;
//    }
//
//    public void setPaymentOptions(PaymentOptions paymentOptions) {
//        this.paymentOptions = paymentOptions;
//    }
//
//    public DiscountsBase getDiscountsBase3() {
//        return discountsBase3;
//    }
//
//    public void setDiscountsBase3(DiscountsBase discountsBase3) {
//        this.discountsBase3 = discountsBase3;
//    }
//
//    public Addresses getAddresses3() {
//        return addresses3;
//    }
//
//    public void setAddresses3(Addresses addresses3) {
//        this.addresses3 = addresses3;
//    }

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
