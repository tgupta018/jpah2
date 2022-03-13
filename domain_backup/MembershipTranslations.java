package com.demo.spring.service.domain;

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

@Entity
@NamedQueries({ @NamedQuery(name = "MembershipTranslations.findAll",
                            query = "select o from MembershipTranslations o") })
@Table(name = "MEMBERSHIP_TRANSLATIONS")
public class MembershipTranslations implements Serializable {
    private static final long serialVersionUID = 3971682321889131810L;
    @Column(name = "CREATED_BY", nullable = false, length = 60)
    private String createdBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "CREATION_DATE", nullable = false)
    private Date creationDate;
    @Column(length = 2000)
    private String description;
    @Column(nullable = false, length = 30)
    private String language;
    @Column(name = "LAST_UPDATED_BY", nullable = false, length = 60)
    private String lastUpdatedBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "LAST_UPDATE_DATE", nullable = false)
    private Date lastUpdateDate;
    @Column(name = "MEMBERSHIP_NAME", nullable = false, length = 120)
    private String membershipName;
    @Id
    @Column(name = "MEMBERSHIP_TRANSLATIONS_ID", nullable = false)
    private Long membershipTranslationsId;
    @Column(name = "OBJECT_VERSION_ID", nullable = false)
    private Long objectVersionId;
    @Column(name = "SOURCE_LANGUAGE", nullable = false, length = 15)
    private String sourceLanguage;
    @ManyToOne
    @JoinColumn(name = "MEMBERSHIP_ID")
    private MembershipsBase membershipsBase1;

    public MembershipTranslations() {
    }

    public MembershipTranslations(String createdBy, Date creationDate, String description, String language,
                                  Date lastUpdateDate, String lastUpdatedBy, MembershipsBase membershipsBase1, String membershipName,
                                  Long membershipTranslationsId, Long objectVersionId, String sourceLanguage) {
        this.createdBy = createdBy;
        this.creationDate = creationDate;
        this.description = description;
        this.language = language;
        this.lastUpdateDate = lastUpdateDate;
        this.lastUpdatedBy = lastUpdatedBy;
        this.membershipsBase1 = membershipsBase1;
        this.membershipName = membershipName;
        this.membershipTranslationsId = membershipTranslationsId;
        this.objectVersionId = objectVersionId;
        this.sourceLanguage = sourceLanguage;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
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


    public String getMembershipName() {
        return membershipName;
    }

    public void setMembershipName(String membershipName) {
        this.membershipName = membershipName;
    }

    public Long getMembershipTranslationsId() {
        return membershipTranslationsId;
    }

    public void setMembershipTranslationsId(Long membershipTranslationsId) {
        this.membershipTranslationsId = membershipTranslationsId;
    }

    public Long getObjectVersionId() {
        return objectVersionId;
    }

    public void setObjectVersionId(Long objectVersionId) {
        this.objectVersionId = objectVersionId;
    }

    public String getSourceLanguage() {
        return sourceLanguage;
    }

    public void setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
    }

    public MembershipsBase getMembershipsBase1() {
        return membershipsBase1;
    }

    public void setMembershipsBase1(MembershipsBase membershipsBase1) {
        this.membershipsBase1 = membershipsBase1;
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
        buffer.append("description=");
        buffer.append(getDescription());
        buffer.append(',');
        buffer.append("language=");
        buffer.append(getLanguage());
        buffer.append(',');
        buffer.append("lastUpdateDate=");
        buffer.append(getLastUpdateDate());
        buffer.append(',');
        buffer.append("lastUpdatedBy=");
        buffer.append(getLastUpdatedBy());
        buffer.append(',');
        buffer.append("membershipName=");
        buffer.append(getMembershipName());
        buffer.append(',');
        buffer.append("membershipTranslationsId=");
        buffer.append(getMembershipTranslationsId());
        buffer.append(',');
        buffer.append("objectVersionId=");
        buffer.append(getObjectVersionId());
        buffer.append(',');
        buffer.append("sourceLanguage=");
        buffer.append(getSourceLanguage());
        buffer.append(']');
        return buffer.toString();
    }
}
