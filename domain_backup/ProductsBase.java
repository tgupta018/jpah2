package com.demo.spring.service.domain;

import java.io.Serializable;

import java.util.Date;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQueries({ @NamedQuery(name = "ProductsBase.findAll", query = "select o from ProductsBase o") })
@Table(name = "PRODUCTS_BASE")
public class ProductsBase implements Serializable {
    private static final long serialVersionUID = -9064305545280365303L;
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
    @Column(name = "COST_PRICE")
    private Integer costPrice;
    @Column(name = "CREATED_BY", nullable = false, length = 60)
    private String createdBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "CREATION_DATE", nullable = false)
    private Date creationDate;
    @Column(name = "EXTERNAL_URL", length = 200)
    private String externalUrl;
    @Column(name = "LAST_UPDATED_BY", nullable = false, length = 60)
    private String lastUpdatedBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "LAST_UPDATE_DATE", nullable = false)
    private Date lastUpdateDate;
    @Column(name = "LIST_PRICE", nullable = false)
    private Integer listPrice;
    @Column(name = "MIN_PRICE", nullable = false)
    private Integer minPrice;
    @Column(name = "OBJECT_VERSION_ID", nullable = false)
    private Long objectVersionId;
    @Column(name = "PARENT_CATEGORY_ID")
    private Long parentCategoryId;
    @Id
    @Column(name = "PRODUCT_ID", nullable = false)
    private Long productId;
    @Column(name = "PRODUCT_NAME", nullable = false, length = 50)
    private String productName;
    @Column(name = "PRODUCT_STATUS", nullable = false, length = 30)
    private String productStatus;
    @Column(name = "SHIPPING_CLASS_CODE", nullable = false, length = 30)
    private String shippingClassCode;
    @Column(name = "WARRANTY_PERIOD_MONTHS")
    private Integer warrantyPeriodMonths;
    @OneToMany(mappedBy = "productsBase", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<OrderItems> orderItemsList;
    @OneToMany(mappedBy = "productsBase1", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<ProductTranslations> productTranslationsList;
    @OneToMany(mappedBy = "productsBase2", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<ProductImages> productImagesList;
    @ManyToOne
    @JoinColumn(name = "CATEGORY_ID")
    private ProductCategoriesBase productCategoriesBase;
    @OneToMany(mappedBy = "productsBase3", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<ProductCategoriesBase> productCategoriesBaseList;
    @ManyToOne
    @JoinColumn(name = "SUPPLIER_ID")
    private Suppliers suppliers1;
    @OneToMany(mappedBy = "productsBase4", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<WarehouseStockLevels> warehouseStockLevelsList1;

    public ProductsBase() {
    }

    public ProductsBase(String attribute1, String attribute10, String attribute11, String attribute12,
                        String attribute13, String attribute14, String attribute15, String attribute2,
                        String attribute3, String attribute4, String attribute5, String attribute6, String attribute7,
                        String attribute8, String attribute9, String attributeCategory,
                        ProductCategoriesBase productCategoriesBase,
                        Integer costPrice, String createdBy, Date creationDate, String externalUrl, Date lastUpdateDate,
                        String lastUpdatedBy, Integer listPrice, Integer minPrice, Long objectVersionId,
                        Long parentCategoryId, Long productId, String productName, String productStatus,
                        String shippingClassCode,
                        Suppliers suppliers1, Integer warrantyPeriodMonths) {
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
        this.productCategoriesBase = productCategoriesBase;
        this.costPrice = costPrice;
        this.createdBy = createdBy;
        this.creationDate = creationDate;
        this.externalUrl = externalUrl;
        this.lastUpdateDate = lastUpdateDate;
        this.lastUpdatedBy = lastUpdatedBy;
        this.listPrice = listPrice;
        this.minPrice = minPrice;
        this.objectVersionId = objectVersionId;
        this.parentCategoryId = parentCategoryId;
        this.productId = productId;
        this.productName = productName;
        this.productStatus = productStatus;
        this.shippingClassCode = shippingClassCode;
        this.suppliers1 = suppliers1;
        this.warrantyPeriodMonths = warrantyPeriodMonths;
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


    public Integer getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Integer costPrice) {
        this.costPrice = costPrice;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getExternalUrl() {
        return externalUrl;
    }

    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
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

    public Long getObjectVersionId() {
        return objectVersionId;
    }

    public void setObjectVersionId(Long objectVersionId) {
        this.objectVersionId = objectVersionId;
    }

    public Long getParentCategoryId() {
        return parentCategoryId;
    }

    public void setParentCategoryId(Long parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
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

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public String getShippingClassCode() {
        return shippingClassCode;
    }

    public void setShippingClassCode(String shippingClassCode) {
        this.shippingClassCode = shippingClassCode;
    }


    public Integer getWarrantyPeriodMonths() {
        return warrantyPeriodMonths;
    }

    public void setWarrantyPeriodMonths(Integer warrantyPeriodMonths) {
        this.warrantyPeriodMonths = warrantyPeriodMonths;
    }

    public List<OrderItems> getOrderItemsList() {
        return orderItemsList;
    }

    public void setOrderItemsList(List<OrderItems> orderItemsList) {
        this.orderItemsList = orderItemsList;
    }

    public OrderItems addOrderItems(OrderItems orderItems) {
        getOrderItemsList().add(orderItems);
        orderItems.setProductsBase(this);
        return orderItems;
    }

    public OrderItems removeOrderItems(OrderItems orderItems) {
        getOrderItemsList().remove(orderItems);
        orderItems.setProductsBase(null);
        return orderItems;
    }

    public List<ProductTranslations> getProductTranslationsList() {
        return productTranslationsList;
    }

    public void setProductTranslationsList(List<ProductTranslations> productTranslationsList) {
        this.productTranslationsList = productTranslationsList;
    }

    public ProductTranslations addProductTranslations(ProductTranslations productTranslations) {
        getProductTranslationsList().add(productTranslations);
        productTranslations.setProductsBase1(this);
        return productTranslations;
    }

    public ProductTranslations removeProductTranslations(ProductTranslations productTranslations) {
        getProductTranslationsList().remove(productTranslations);
        productTranslations.setProductsBase1(null);
        return productTranslations;
    }

    public List<ProductImages> getProductImagesList() {
        return productImagesList;
    }

    public void setProductImagesList(List<ProductImages> productImagesList) {
        this.productImagesList = productImagesList;
    }

    public ProductImages addProductImages(ProductImages productImages) {
        getProductImagesList().add(productImages);
        productImages.setProductsBase2(this);
        return productImages;
    }

    public ProductImages removeProductImages(ProductImages productImages) {
        getProductImagesList().remove(productImages);
        productImages.setProductsBase2(null);
        return productImages;
    }

    public ProductCategoriesBase getProductCategoriesBase() {
        return productCategoriesBase;
    }

    public void setProductCategoriesBase(ProductCategoriesBase productCategoriesBase) {
        this.productCategoriesBase = productCategoriesBase;
    }

    public List<ProductCategoriesBase> getProductCategoriesBaseList() {
        return productCategoriesBaseList;
    }

    public void setProductCategoriesBaseList(List<ProductCategoriesBase> productCategoriesBaseList) {
        this.productCategoriesBaseList = productCategoriesBaseList;
    }

    public ProductCategoriesBase addProductCategoriesBase(ProductCategoriesBase productCategoriesBase) {
        getProductCategoriesBaseList().add(productCategoriesBase);
        productCategoriesBase.setProductsBase3(this);
        return productCategoriesBase;
    }

    public ProductCategoriesBase removeProductCategoriesBase(ProductCategoriesBase productCategoriesBase) {
        getProductCategoriesBaseList().remove(productCategoriesBase);
        productCategoriesBase.setProductsBase3(null);
        return productCategoriesBase;
    }

    public Suppliers getSuppliers1() {
        return suppliers1;
    }

    public void setSuppliers1(Suppliers suppliers1) {
        this.suppliers1 = suppliers1;
    }

    public List<WarehouseStockLevels> getWarehouseStockLevelsList1() {
        return warehouseStockLevelsList1;
    }

    public void setWarehouseStockLevelsList1(List<WarehouseStockLevels> warehouseStockLevelsList1) {
        this.warehouseStockLevelsList1 = warehouseStockLevelsList1;
    }

    public WarehouseStockLevels addWarehouseStockLevels(WarehouseStockLevels warehouseStockLevels) {
        getWarehouseStockLevelsList1().add(warehouseStockLevels);
        warehouseStockLevels.setProductsBase4(this);
        return warehouseStockLevels;
    }

    public WarehouseStockLevels removeWarehouseStockLevels(WarehouseStockLevels warehouseStockLevels) {
        getWarehouseStockLevelsList1().remove(warehouseStockLevels);
        warehouseStockLevels.setProductsBase4(null);
        return warehouseStockLevels;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName() + "@" + Integer.toHexString(hashCode()));
        buffer.append('[');
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
        buffer.append("costPrice=");
        buffer.append(getCostPrice());
        buffer.append(',');
        buffer.append("createdBy=");
        buffer.append(getCreatedBy());
        buffer.append(',');
        buffer.append("creationDate=");
        buffer.append(getCreationDate());
        buffer.append(',');
        buffer.append("externalUrl=");
        buffer.append(getExternalUrl());
        buffer.append(',');
        buffer.append("lastUpdateDate=");
        buffer.append(getLastUpdateDate());
        buffer.append(',');
        buffer.append("lastUpdatedBy=");
        buffer.append(getLastUpdatedBy());
        buffer.append(',');
        buffer.append("listPrice=");
        buffer.append(getListPrice());
        buffer.append(',');
        buffer.append("minPrice=");
        buffer.append(getMinPrice());
        buffer.append(',');
        buffer.append("objectVersionId=");
        buffer.append(getObjectVersionId());
        buffer.append(',');
        buffer.append("parentCategoryId=");
        buffer.append(getParentCategoryId());
        buffer.append(',');
        buffer.append("productId=");
        buffer.append(getProductId());
        buffer.append(',');
        buffer.append("productName=");
        buffer.append(getProductName());
        buffer.append(',');
        buffer.append("productStatus=");
        buffer.append(getProductStatus());
        buffer.append(',');
        buffer.append("shippingClassCode=");
        buffer.append(getShippingClassCode());
        buffer.append(',');
        buffer.append("warrantyPeriodMonths=");
        buffer.append(getWarrantyPeriodMonths());
        buffer.append(']');
        return buffer.toString();
    }
}
