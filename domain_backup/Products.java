package com.demo.spring.service.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = "Products.findAll", query = "select o from Products o") })
public class Products implements Serializable {
    private static final long serialVersionUID = -1693397781011622562L;
    @Column(name = "ADDITIONAL_INFO", length = 4000)
    private String additionalInfo;
    @Column(length = 150)
    private String attribute1;
    @Column(length = 150)
    private String attribute10;
    @Column(length = 150)
    private String attribute11;
    @Column(length = 150)
    private String attribute12;
    @Column(length = 150)
    private String attribute13;
    @Column(length = 150)
    private String attribute14;
    @Column(length = 150)
    private String attribute15;
    @Column(length = 150)
    private String attribute2;
    @Column(length = 150)
    private String attribute3;
    @Column(length = 150)
    private String attribute4;
    @Column(length = 150)
    private String attribute5;
    @Column(length = 150)
    private String attribute6;
    @Column(length = 150)
    private String attribute7;
    @Column(length = 150)
    private String attribute8;
    @Column(length = 150)
    private String attribute9;
    @Column(name = "ATTRIBUTE_CATEGORY", length = 30)
    private String attributeCategory;
    @Column(name = "CATEGORY_ID")
    private Long categoryId;
    @Column(name = "COST_PRICE")
    private Integer costPrice;
    @Column(nullable = false, length = 4000)
    private String description;
    @Column(name = "EXTERNAL_URL", length = 200)
    private String externalUrl;
    @Column(name = "LIST_PRICE", nullable = false)
    private Integer listPrice;
    @Column(name = "MIN_PRICE", nullable = false)
    private Integer minPrice;
    @Column(name = "PRODUCT_ID", nullable = false)
    private Long productId;
    @Column(name = "PRODUCT_NAME", nullable = false, length = 50)
    private String productName;
    @Column(name = "SHIPPING_CLASS_CODE", nullable = false, length = 30)
    private String shippingClassCode;
    @Column(name = "SUPPLIER_ID", nullable = false)
    private Long supplierId;
    @Column(name = "WARRANTY_PERIOD_MONTHS")
    private Integer warrantyPeriodMonths;

    public Products() {
    }

    public Products(String additionalInfo, String attribute1, String attribute10, String attribute11,
                    String attribute12, String attribute13, String attribute14, String attribute15, String attribute2,
                    String attribute3, String attribute4, String attribute5, String attribute6, String attribute7,
                    String attribute8, String attribute9, String attributeCategory, Long categoryId, Integer costPrice,
                    String description, String externalUrl, Integer listPrice, Integer minPrice, Long productId,
                    String productName, String shippingClassCode, Long supplierId, Integer warrantyPeriodMonths) {
        this.additionalInfo = additionalInfo;
        this.attribute1 = attribute1;
        this.attribute10 = attribute10;
        this.attribute11 = attribute11;
        this.attribute12 = attribute12;
        this.attribute13 = attribute13;
        this.attribute14 = attribute14;
        this.attribute15 = attribute15;
        this.attribute2 = attribute2;
        this.attribute3 = attribute3;
        this.attribute4 = attribute4;
        this.attribute5 = attribute5;
        this.attribute6 = attribute6;
        this.attribute7 = attribute7;
        this.attribute8 = attribute8;
        this.attribute9 = attribute9;
        this.attributeCategory = attributeCategory;
        this.categoryId = categoryId;
        this.costPrice = costPrice;
        this.description = description;
        this.externalUrl = externalUrl;
        this.listPrice = listPrice;
        this.minPrice = minPrice;
        this.productId = productId;
        this.productName = productName;
        this.shippingClassCode = shippingClassCode;
        this.supplierId = supplierId;
        this.warrantyPeriodMonths = warrantyPeriodMonths;
    }


    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public String getAttribute10() {
        return attribute10;
    }

    public void setAttribute10(String attribute10) {
        this.attribute10 = attribute10;
    }

    public String getAttribute11() {
        return attribute11;
    }

    public void setAttribute11(String attribute11) {
        this.attribute11 = attribute11;
    }

    public String getAttribute12() {
        return attribute12;
    }

    public void setAttribute12(String attribute12) {
        this.attribute12 = attribute12;
    }

    public String getAttribute13() {
        return attribute13;
    }

    public void setAttribute13(String attribute13) {
        this.attribute13 = attribute13;
    }

    public String getAttribute14() {
        return attribute14;
    }

    public void setAttribute14(String attribute14) {
        this.attribute14 = attribute14;
    }

    public String getAttribute15() {
        return attribute15;
    }

    public void setAttribute15(String attribute15) {
        this.attribute15 = attribute15;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    public String getAttribute4() {
        return attribute4;
    }

    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4;
    }

    public String getAttribute5() {
        return attribute5;
    }

    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5;
    }

    public String getAttribute6() {
        return attribute6;
    }

    public void setAttribute6(String attribute6) {
        this.attribute6 = attribute6;
    }

    public String getAttribute7() {
        return attribute7;
    }

    public void setAttribute7(String attribute7) {
        this.attribute7 = attribute7;
    }

    public String getAttribute8() {
        return attribute8;
    }

    public void setAttribute8(String attribute8) {
        this.attribute8 = attribute8;
    }

    public String getAttribute9() {
        return attribute9;
    }

    public void setAttribute9(String attribute9) {
        this.attribute9 = attribute9;
    }

    public String getAttributeCategory() {
        return attributeCategory;
    }

    public void setAttributeCategory(String attributeCategory) {
        this.attributeCategory = attributeCategory;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Integer costPrice) {
        this.costPrice = costPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExternalUrl() {
        return externalUrl;
    }

    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }

    public Integer getListPrice() {
        return listPrice;
    }

    public void setListPrice(Integer listPrice) {
        this.listPrice = listPrice;
    }

    public Integer getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Integer minPrice) {
        this.minPrice = minPrice;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getShippingClassCode() {
        return shippingClassCode;
    }

    public void setShippingClassCode(String shippingClassCode) {
        this.shippingClassCode = shippingClassCode;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public Integer getWarrantyPeriodMonths() {
        return warrantyPeriodMonths;
    }

    public void setWarrantyPeriodMonths(Integer warrantyPeriodMonths) {
        this.warrantyPeriodMonths = warrantyPeriodMonths;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName() + "@" + Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("additionalInfo=");
        buffer.append(getAdditionalInfo());
        buffer.append(',');
        buffer.append("attribute1=");
        buffer.append(getAttribute1());
        buffer.append(',');
        buffer.append("attribute10=");
        buffer.append(getAttribute10());
        buffer.append(',');
        buffer.append("attribute11=");
        buffer.append(getAttribute11());
        buffer.append(',');
        buffer.append("attribute12=");
        buffer.append(getAttribute12());
        buffer.append(',');
        buffer.append("attribute13=");
        buffer.append(getAttribute13());
        buffer.append(',');
        buffer.append("attribute14=");
        buffer.append(getAttribute14());
        buffer.append(',');
        buffer.append("attribute15=");
        buffer.append(getAttribute15());
        buffer.append(',');
        buffer.append("attribute2=");
        buffer.append(getAttribute2());
        buffer.append(',');
        buffer.append("attribute3=");
        buffer.append(getAttribute3());
        buffer.append(',');
        buffer.append("attribute4=");
        buffer.append(getAttribute4());
        buffer.append(',');
        buffer.append("attribute5=");
        buffer.append(getAttribute5());
        buffer.append(',');
        buffer.append("attribute6=");
        buffer.append(getAttribute6());
        buffer.append(',');
        buffer.append("attribute7=");
        buffer.append(getAttribute7());
        buffer.append(',');
        buffer.append("attribute8=");
        buffer.append(getAttribute8());
        buffer.append(',');
        buffer.append("attribute9=");
        buffer.append(getAttribute9());
        buffer.append(',');
        buffer.append("attributeCategory=");
        buffer.append(getAttributeCategory());
        buffer.append(',');
        buffer.append("categoryId=");
        buffer.append(getCategoryId());
        buffer.append(',');
        buffer.append("costPrice=");
        buffer.append(getCostPrice());
        buffer.append(',');
        buffer.append("description=");
        buffer.append(getDescription());
        buffer.append(',');
        buffer.append("externalUrl=");
        buffer.append(getExternalUrl());
        buffer.append(',');
        buffer.append("listPrice=");
        buffer.append(getListPrice());
        buffer.append(',');
        buffer.append("minPrice=");
        buffer.append(getMinPrice());
        buffer.append(',');
        buffer.append("productId=");
        buffer.append(getProductId());
        buffer.append(',');
        buffer.append("productName=");
        buffer.append(getProductName());
        buffer.append(',');
        buffer.append("shippingClassCode=");
        buffer.append(getShippingClassCode());
        buffer.append(',');
        buffer.append("supplierId=");
        buffer.append(getSupplierId());
        buffer.append(',');
        buffer.append("warrantyPeriodMonths=");
        buffer.append(getWarrantyPeriodMonths());
        buffer.append(']');
        return buffer.toString();
    }
}
