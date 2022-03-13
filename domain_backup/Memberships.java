package com.demo.spring.service.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = "Memberships.findAll", query = "select o from Memberships o") })
public class Memberships implements Serializable {
    private static final long serialVersionUID = 960145066147206044L;
    @Column(name = "CONTACT_ID", nullable = false)
    private Long contactId;
    @Column(length = 2000)
    private String description;
    @Column(name = "MEMBERSHIP_ID", nullable = false)
    private Long membershipId;
    @Column(name = "MEMBERSHIP_NAME", nullable = false, length = 120)
    private String membershipName;
    @Column(name = "MEMBERSHIP_TYPE_CODE", nullable = false, length = 30)
    private String membershipTypeCode;

    public Memberships() {
    }

    public Memberships(Long contactId, String description, Long membershipId, String membershipName,
                       String membershipTypeCode) {
        this.contactId = contactId;
        this.description = description;
        this.membershipId = membershipId;
        this.membershipName = membershipName;
        this.membershipTypeCode = membershipTypeCode;
    }


    public Long getContactId() {
        return contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(Long membershipId) {
        this.membershipId = membershipId;
    }

    public String getMembershipName() {
        return membershipName;
    }

    public void setMembershipName(String membershipName) {
        this.membershipName = membershipName;
    }

    public String getMembershipTypeCode() {
        return membershipTypeCode;
    }

    public void setMembershipTypeCode(String membershipTypeCode) {
        this.membershipTypeCode = membershipTypeCode;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName() + "@" + Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("contactId=");
        buffer.append(getContactId());
        buffer.append(',');
        buffer.append("description=");
        buffer.append(getDescription());
        buffer.append(',');
        buffer.append("membershipId=");
        buffer.append(getMembershipId());
        buffer.append(',');
        buffer.append("membershipName=");
        buffer.append(getMembershipName());
        buffer.append(',');
        buffer.append("membershipTypeCode=");
        buffer.append(getMembershipTypeCode());
        buffer.append(']');
        return buffer.toString();
    }
}
