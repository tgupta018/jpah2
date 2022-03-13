package com.demo.spring.jpa.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;

//import java.util.Date;

import javax.persistence.*;

@DynamicInsert
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Entity
//@NamedQueries({ @NamedQuery(name = "OrderItems.findAll", query = "select o from OrderItems o") })
@Table(name = "ORDER_ITEMS")
@IdClass(OrderItemsPK.class)
@EntityListeners(AuditingEntityListener.class)
public class OrderItems extends AuditColumns implements Serializable {
    private static final long serialVersionUID = -7374790863260679993L;
    //    @Column(name = "CREATED_BY", nullable = false, length = 60)
//    private String createdBy;
//    @Temporal(TemporalType.DATE)
//    @Column(name = "CREATION_DATE", nullable = false)
//    private Date creationDate;
//    @Column(name = "LAST_UPDATED_BY", nullable = false, length = 60)
//    private String lastUpdatedBy;
//    @Temporal(TemporalType.DATE)
//    @Column(name = "LAST_UPDATE_DATE", nullable = false)
//    private Date lastUpdateDate;
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "order_items_sequence")
    @SequenceGenerator(name = "order_items_sequence", sequenceName = "ORDER_ITEMS_SEQ", allocationSize = 1)
    @Column(name = "LINE_ITEM_ID", nullable = false)
    private Long lineItemId;
    @Column(name = "OBJECT_VERSION_ID", nullable = false)
    private Long objectVersionId;
    @Column(nullable = false)
    private Integer quantity;
    @Column(name = "UNIT_PRICE", nullable = false)
    private Integer unitPrice;
    //    @ManyToOne
//    @JoinColumn(name = "PRODUCT_ID")
//    private ProductsBase productsBase;
    @JsonBackReference
//    @ManyToOne(optional = false)
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @Id
    @JoinColumn(name = "ORDER_ID")
    private Orders orders1;

    public OrderItems() {
    }

    public OrderItems(
            // String createdBy, Date creationDate, Date lastUpdateDate, String lastUpdatedBy,
            Long lineItemId,
            Long objectVersionId, Orders orders1, Integer quantity, Integer unitPrice) {
//        this.createdBy = createdBy;
//        this.creationDate = creationDate;
//        this.lastUpdateDate = lastUpdateDate;
//        this.lastUpdatedBy = lastUpdatedBy;
        this.lineItemId = lineItemId;
        this.objectVersionId = objectVersionId;
        this.orders1 = orders1;
//        this.productsBase = productsBase;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
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
//    public Long getLineItemId() {
//        return lineItemId;
//    }
//
//    public void setLineItemId(Long lineItemId) {
//        this.lineItemId = lineItemId;
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
//
//    public Integer getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(Integer quantity) {
//        this.quantity = quantity;
//    }
//
//    public Integer getUnitPrice() {
//        return unitPrice;
//    }
//
//    public void setUnitPrice(Integer unitPrice) {
//        this.unitPrice = unitPrice;
//    }
//
//    public ProductsBase getProductsBase() {
//        return productsBase;
//    }
//
//    public void setProductsBase(ProductsBase productsBase) {
//        this.productsBase = productsBase;
//    }
//
//    public Orders getOrders1() {
//        return orders1;
//    }
//
//    public void setOrders1(Orders orders1) {
//        this.orders1 = orders1;
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
        buffer.append("lastUpdateDate=");
        buffer.append(getLastUpdateDate());
        buffer.append(',');
        buffer.append("lastUpdatedBy=");
        buffer.append(getLastUpdatedBy());
        buffer.append(',');
        buffer.append("lineItemId=");
        buffer.append(getLineItemId());
        buffer.append(',');
        buffer.append("objectVersionId=");
        buffer.append(getObjectVersionId());
        buffer.append(',');
        buffer.append("quantity=");
        buffer.append(getQuantity());
        buffer.append(',');
        buffer.append("unitPrice=");
        buffer.append(getUnitPrice());
        buffer.append(']');
        return buffer.toString();
    }
}
