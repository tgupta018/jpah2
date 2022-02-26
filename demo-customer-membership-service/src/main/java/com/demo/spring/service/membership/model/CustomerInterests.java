package com.demo.spring.service.membership.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.xml.bind.annotation.XmlTransient;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@NamedQueries({ @NamedQuery(name = "CustomerInterests.findAll", query = "select o from CustomerInterests o") })
@Table(name = "CUSTOMER_INTERESTS")
public class CustomerInterests implements Serializable {
    private static final long serialVersionUID = 4276360525085088224L;
    @Column(name = "CREATED_BY", nullable = false, length = 60)
    private String createdBy;

    @Temporal(TemporalType.DATE)
    @Column(name = "CREATION_DATE", nullable = false)
    private Date creationDate;

    @Id
    @Column(name = "CUSTOMER_INTERESTS_ID", nullable = false)
    private Long customerInterestsId;

    @Column(name = "LAST_UPDATED_BY", nullable = false, length = 60)
    private String lastUpdatedBy;

    @Temporal(TemporalType.DATE)
    @Column(name = "LAST_UPDATE_DATE", nullable = false)
    private Date lastUpdateDate;

    @Column(name = "OBJECT_VERSION_ID", nullable = false)
    private Long objectVersionId;
//    @ManyToOne
//    @JoinColumn(name = "CUSTOMER_ID")
//    private Persons persons;
//    @ManyToOne
//    @JoinColumn(name = "CATEGORY_ID")
//    private ProductCategoriesBase productCategoriesBase1;

//    public CustomerInterests() {
//    }

//    public CustomerInterests(ProductCategoriesBase productCategoriesBase1, String createdBy, Date creationDate, Persons persons,
//                             Long customerInterestsId, Date lastUpdateDate, String lastUpdatedBy,
//                             Long objectVersionId) {
//        this.productCategoriesBase1 = productCategoriesBase1;
//        this.createdBy = createdBy;
//        this.creationDate = creationDate;
//        this.persons = persons;
//        this.customerInterestsId = customerInterestsId;
//        this.lastUpdateDate = lastUpdateDate;
//        this.lastUpdatedBy = lastUpdatedBy;
//        this.objectVersionId = objectVersionId;
//    }

//    @XmlTransient
//    public Persons getPersons() {
//        return persons;
//    }
//
//    public void setPersons(Persons persons) {
//        this.persons = persons;
//    }
//
//    @XmlTransient
//    public ProductCategoriesBase getProductCategoriesBase1() {
//        return productCategoriesBase1;
//    }
//
//    public void setProductCategoriesBase1(ProductCategoriesBase productCategoriesBase1) {
//        this.productCategoriesBase1 = productCategoriesBase1;
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
        buffer.append("customerInterestsId=");
        buffer.append(getCustomerInterestsId());
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
        buffer.append(']');
        return buffer.toString();
    }
}
