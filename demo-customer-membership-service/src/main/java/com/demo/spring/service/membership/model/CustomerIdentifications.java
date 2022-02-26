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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.xml.bind.annotation.XmlTransient;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@NamedQueries({ @NamedQuery(name = "CustomerIdentifications.findAll",
//                            query = "select o from CustomerIdentifications o") })
@Table(name = "CUSTOMER_IDENTIFICATIONS")
public class CustomerIdentifications implements Serializable {
    private static final long serialVersionUID = -2379186332679367175L;
    @Column(name = "ADDITIONAL_INFORMATION", length = 1000)
    private String additionalInformation;
    @Column(name = "CREATED_BY", nullable = false, length = 60)
    private String createdBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "CREATION_DATE", nullable = false)
    private Date creationDate;

    @Id
    @Column(name = "CUSTOMER_ID", nullable = false)
    private Long customerId;

    @Column(name = "ID_DETAIL", nullable = false, length = 20)
    private String idDetail;
    @Column(name = "ID_TYPE_CODE", nullable = false, length = 30)
    private String idTypeCode;
    @Column(name = "LAST_UPDATED_BY", nullable = false, length = 60)
    private String lastUpdatedBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "LAST_UPDATE_DATE", nullable = false)
    private Date lastUpdateDate;
    @Column(name = "OBJECT_VERSION_ID", nullable = false)
    private Long objectVersionId;
    @Column(name = "VERIFICATION_METHOD_CODE", length = 30)
    private String verificationMethodCode;
    @Temporal(TemporalType.DATE)
    @Column(name = "VERIFIED_DATE")
    private Date verifiedDate;
    @Column(name = "VERIFIED_FLAG", nullable = false, length = 1)
    private String verifiedFlag;

//    @ManyToOne
//    @JoinColumn(name = "VERIFIED_BY")
//    private Persons persons4;
//    @OneToOne
//    @JoinColumn(name = "CUSTOMER_ID", insertable = false, updatable = false)
//    private Persons persons5;

//    public CustomerIdentifications() {
//    }

//    public CustomerIdentifications(String additionalInformation, String createdBy, Date creationDate, Long customerId,
//                                   String idDetail, String idTypeCode, Date lastUpdateDate, String lastUpdatedBy,
//                                   Long objectVersionId, String verificationMethodCode, Persons persons4,
//                                   Date verifiedDate, String verifiedFlag) {
//        this.additionalInformation = additionalInformation;
//        this.createdBy = createdBy;
//        this.creationDate = creationDate;
//        this.customerId = customerId;
//        this.idDetail = idDetail;
//        this.idTypeCode = idTypeCode;
//        this.lastUpdateDate = lastUpdateDate;
//        this.lastUpdatedBy = lastUpdatedBy;
//        this.objectVersionId = objectVersionId;
//        this.verificationMethodCode = verificationMethodCode;
//        this.persons4 = persons4;
//        this.verifiedDate = verifiedDate;
//        this.verifiedFlag = verifiedFlag;
//    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName() + "@" + Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("additionalInformation=");
        buffer.append(getAdditionalInformation());
        buffer.append(',');
        buffer.append("createdBy=");
        buffer.append(getCreatedBy());
        buffer.append(',');
        buffer.append("creationDate=");
        buffer.append(getCreationDate());
        buffer.append(',');
        buffer.append("idDetail=");
        buffer.append(getIdDetail());
        buffer.append(',');
        buffer.append("idTypeCode=");
        buffer.append(getIdTypeCode());
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
        buffer.append("verificationMethodCode=");
        buffer.append(getVerificationMethodCode());
        buffer.append(',');
        buffer.append("verifiedDate=");
        buffer.append(getVerifiedDate());
        buffer.append(',');
        buffer.append("verifiedFlag=");
        buffer.append(getVerifiedFlag());
        buffer.append(']');
        return buffer.toString();
    }
}
