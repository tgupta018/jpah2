package com.demo.spring.service.supplier.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

import java.util.Date;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.xml.bind.annotation.XmlTransient;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@NamedQueries({ @NamedQuery(name = "Suppliers.findAll", query = "select o from Suppliers o") })
public class SuppliersEntity implements Serializable {
    private static final long serialVersionUID = 4414412044479567312L;
    @Column(name = "CREATED_BY", nullable = false, length = 60)
    private String createdBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "CREATION_DATE", nullable = false)
    private Date creationDate;
    private String email;
    @Column(name = "LAST_UPDATED_BY", nullable = false, length = 60)
    private String lastUpdatedBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "LAST_UPDATE_DATE", nullable = false)
    private Date lastUpdateDate;
    @Column(name = "OBJECT_VERSION_ID", nullable = false)
    private Long objectVersionId;
    @Column(name = "PHONE_NUMBER", length = 20)
    private String phoneNumber;
    @Id
    @Column(name = "SUPPLIER_ID", nullable = false)
    private Long supplierId;
    @Column(name = "SUPPLIER_NAME", nullable = false, length = 120)
    private String supplierName;
    @Column(name = "SUPPLIER_STATUS", nullable = false, length = 30)
    private String supplierStatus;
    @Column(name = "UI_SKIN", length = 60)
    private String uiSkin;
//    @OneToMany(mappedBy = "suppliers", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
//    private List<Persons> personsList;
//    @OneToMany(mappedBy = "suppliers1", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
//    private List<ProductsBase> productsBaseList1;
//
//    public Suppliers() {
//    }
//
//    public Suppliers(String createdBy, Date creationDate, String email, Date lastUpdateDate, String lastUpdatedBy,
//                     Long objectVersionId, String phoneNumber, Long supplierId, String supplierName,
//                     String supplierStatus, String uiSkin) {
//        this.createdBy = createdBy;
//        this.creationDate = creationDate;
//        this.email = email;
//        this.lastUpdateDate = lastUpdateDate;
//        this.lastUpdatedBy = lastUpdatedBy;
//        this.objectVersionId = objectVersionId;
//        this.phoneNumber = phoneNumber;
//        this.supplierId = supplierId;
//        this.supplierName = supplierName;
//        this.supplierStatus = supplierStatus;
//        this.uiSkin = uiSkin;
//    }


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
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
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
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    public Long getSupplierId() {
//        return supplierId;
//    }
//
//    public void setSupplierId(Long supplierId) {
//        this.supplierId = supplierId;
//    }
//
//    public String getSupplierName() {
//        return supplierName;
//    }
//
//    public void setSupplierName(String supplierName) {
//        this.supplierName = supplierName;
//    }
//
//    public String getSupplierStatus() {
//        return supplierStatus;
//    }
//
//    public void setSupplierStatus(String supplierStatus) {
//        this.supplierStatus = supplierStatus;
//    }
//
//    public String getUiSkin() {
//        return uiSkin;
//    }
//
//    public void setUiSkin(String uiSkin) {
//        this.uiSkin = uiSkin;
//    }

//    @XmlTransient
//    public List<Persons> getPersonsList() {
//        return personsList;
//    }
//
//    public void setPersonsList(List<Persons> personsList) {
//        this.personsList = personsList;
//    }
//
//    public Persons addPersons(Persons persons) {
//        getPersonsList().add(persons);
//        persons.setSuppliers(this);
//        return persons;
//    }
//
//    public Persons removePersons(Persons persons) {
//        getPersonsList().remove(persons);
//        persons.setSuppliers(null);
//        return persons;
//    }
//
//    @XmlTransient
//    public List<ProductsBase> getProductsBaseList1() {
//        return productsBaseList1;
//    }
//
//    public void setProductsBaseList1(List<ProductsBase> productsBaseList1) {
//        this.productsBaseList1 = productsBaseList1;
//    }
//
//    public ProductsBase addProductsBase(ProductsBase productsBase) {
//        getProductsBaseList1().add(productsBase);
//        productsBase.setSuppliers1(this);
//        return productsBase;
//    }
//
//    public ProductsBase removeProductsBase(ProductsBase productsBase) {
//        getProductsBaseList1().remove(productsBase);
//        productsBase.setSuppliers1(null);
//        return productsBase;
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
        buffer.append("email=");
        buffer.append(getEmail());
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
        buffer.append("phoneNumber=");
        buffer.append(getPhoneNumber());
        buffer.append(',');
        buffer.append("supplierId=");
        buffer.append(getSupplierId());
        buffer.append(',');
        buffer.append("supplierName=");
        buffer.append(getSupplierName());
        buffer.append(',');
        buffer.append("supplierStatus=");
        buffer.append(getSupplierStatus());
        buffer.append(',');
        buffer.append("uiSkin=");
        buffer.append(getUiSkin());
        buffer.append(']');
        return buffer.toString();
    }
}
