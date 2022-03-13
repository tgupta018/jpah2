package com.demo.spring.service.domain;

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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQueries({ @NamedQuery(name = "MembershipsBase.findAll", query = "select o from MembershipsBase o") })
@Table(name = "MEMBERSHIPS_BASE")
public class MembershipsBase implements Serializable {
    private static final long serialVersionUID = -9101656739674535014L;
    @Column(name = "CONTACT_ID", nullable = false)
    private Long contactId;
    @Column(name = "CREATED_BY", nullable = false, length = 60)
    private String createdBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "CREATION_DATE", nullable = false)
    private Date creationDate;
    @Column(name = "LAST_UPDATED_BY", nullable = false, length = 60)
    private String lastUpdatedBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "LAST_UPDATE_DATE", nullable = false)
    private Date lastUpdateDate;
    @Id
    @Column(name = "MEMBERSHIP_ID", nullable = false)
    private Long membershipId;
    @Column(name = "MEMBERSHIP_TYPE_CODE", nullable = false, length = 30)
    private String membershipTypeCode;
    @Column(name = "OBJECT_VERSION_ID", nullable = false)
    private Long objectVersionId;
    @OneToMany(mappedBy = "membershipsBase", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<EligibleDiscounts> eligibleDiscountsList;
    @OneToMany(mappedBy = "membershipsBase1", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<MembershipTranslations> membershipTranslationsList;
    @OneToMany(mappedBy = "membershipsBase2", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<Persons> personsList1;

    public MembershipsBase() {
    }

    public MembershipsBase(Long contactId, String createdBy, Date creationDate, Date lastUpdateDate,
                           String lastUpdatedBy, Long membershipId, String membershipTypeCode, Long objectVersionId) {
        this.contactId = contactId;
        this.createdBy = createdBy;
        this.creationDate = creationDate;
        this.lastUpdateDate = lastUpdateDate;
        this.lastUpdatedBy = lastUpdatedBy;
        this.membershipId = membershipId;
        this.membershipTypeCode = membershipTypeCode;
        this.objectVersionId = objectVersionId;
    }


    public Long getContactId() {
        return contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
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

    public Long getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(Long membershipId) {
        this.membershipId = membershipId;
    }

    public String getMembershipTypeCode() {
        return membershipTypeCode;
    }

    public void setMembershipTypeCode(String membershipTypeCode) {
        this.membershipTypeCode = membershipTypeCode;
    }

    public Long getObjectVersionId() {
        return objectVersionId;
    }

    public void setObjectVersionId(Long objectVersionId) {
        this.objectVersionId = objectVersionId;
    }

    public List<EligibleDiscounts> getEligibleDiscountsList() {
        return eligibleDiscountsList;
    }

    public void setEligibleDiscountsList(List<EligibleDiscounts> eligibleDiscountsList) {
        this.eligibleDiscountsList = eligibleDiscountsList;
    }

    public EligibleDiscounts addEligibleDiscounts(EligibleDiscounts eligibleDiscounts) {
        getEligibleDiscountsList().add(eligibleDiscounts);
        eligibleDiscounts.setMembershipsBase(this);
        return eligibleDiscounts;
    }

    public EligibleDiscounts removeEligibleDiscounts(EligibleDiscounts eligibleDiscounts) {
        getEligibleDiscountsList().remove(eligibleDiscounts);
        eligibleDiscounts.setMembershipsBase(null);
        return eligibleDiscounts;
    }

    public List<MembershipTranslations> getMembershipTranslationsList() {
        return membershipTranslationsList;
    }

    public void setMembershipTranslationsList(List<MembershipTranslations> membershipTranslationsList) {
        this.membershipTranslationsList = membershipTranslationsList;
    }

    public MembershipTranslations addMembershipTranslations(MembershipTranslations membershipTranslations) {
        getMembershipTranslationsList().add(membershipTranslations);
        membershipTranslations.setMembershipsBase1(this);
        return membershipTranslations;
    }

    public MembershipTranslations removeMembershipTranslations(MembershipTranslations membershipTranslations) {
        getMembershipTranslationsList().remove(membershipTranslations);
        membershipTranslations.setMembershipsBase1(null);
        return membershipTranslations;
    }

    public List<Persons> getPersonsList1() {
        return personsList1;
    }

    public void setPersonsList1(List<Persons> personsList1) {
        this.personsList1 = personsList1;
    }

    public Persons addPersons(Persons persons) {
        getPersonsList1().add(persons);
        persons.setMembershipsBase2(this);
        return persons;
    }

    public Persons removePersons(Persons persons) {
        getPersonsList1().remove(persons);
        persons.setMembershipsBase2(null);
        return persons;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName() + "@" + Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("contactId=");
        buffer.append(getContactId());
        buffer.append(',');
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
        buffer.append("membershipId=");
        buffer.append(getMembershipId());
        buffer.append(',');
        buffer.append("membershipTypeCode=");
        buffer.append(getMembershipTypeCode());
        buffer.append(',');
        buffer.append("objectVersionId=");
        buffer.append(getObjectVersionId());
        buffer.append(',');
        buffer.append(']');
        return buffer.toString();
    }
}
