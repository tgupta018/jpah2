package com.demo.spring.service.domain;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQueries({ @NamedQuery(name = "PersonInformation.findAll", query = "select o from PersonInformation o") })
@Table(name = "PERSON_INFORMATION")
public class PersonInformation implements Serializable {
    private static final long serialVersionUID = 5436007231959761241L;
    @Column(nullable = false, length = 40)
    private String address1;
    @Column(length = 40)
    private String address2;
    @Column(name = "APPROXIMATE_INCOME")
    private Long approximateIncome;
    @Column(name = "CHILDREN_UNDER_18")
    private Integer childrenUnder18;
    @Column(nullable = false, length = 40)
    private String city;
    @Column(name = "CONFIRMED_EMAIL", length = 25)
    private String confirmedEmail;
    @Column(name = "CONTACTABLE_FLAG", nullable = false, length = 1)
    private String contactableFlag;
    @Column(name = "CONTACT_BY_AFFILLIATES_FLAG", nullable = false, length = 1)
    private String contactByAffilliatesFlag;
    @Column(name = "CONTACT_METHOD_CODE", length = 30)
    private String contactMethodCode;
    @Column(name = "COUNTRY_ID", nullable = false)
    private String countryId;
    @Column(name = "CREDIT_LIMIT")
    private Integer creditLimit;
    @Column(name = "CUSTOMER_ID", nullable = false)
    private Long customerId;
    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_OF_BIRTH")
    private Date dateOfBirth;
    @Column(name = "FIRST_NAME", length = 30)
    private String firstName;
    @Column(nullable = false, length = 1)
    private String gender;
    @Column(name = "LAST_NAME", length = 30)
    private String lastName;
    private BigDecimal latitude;
    private BigDecimal longitude;
    @Column(name = "MARITAL_STATUS_CODE", nullable = false, length = 30)
    private String maritalStatusCode;
    @Column(name = "MEMBERSHIP_ID")
    private Long membershipId;
    @Column(name = "MOBILE_PHONE_NUMBER", length = 20)
    private String mobilePhoneNumber;
    @Column(name = "PHONE_NUMBER", length = 20)
    private String phoneNumber;
    @Column(name = "POSTAL_CODE", length = 12)
    private String postalCode;
    @Column(name = "PRINCIPAL_NAME", nullable = false, length = 60)
    private String principalName;
    @Temporal(TemporalType.DATE)
    @Column(name = "REGISTERED_DATE")
    private Date registeredDate;
    @Column(name = "STATE_PROVINCE", nullable = false, length = 40)
    private String stateProvince;
    @Column(length = 12)
    private String title;

    public PersonInformation() {
    }

    public PersonInformation(String address1, String address2, Long approximateIncome, Integer childrenUnder18,
                             String city, String confirmedEmail, String contactByAffilliatesFlag,
                             String contactMethodCode, String contactableFlag, String countryId, Integer creditLimit,
                             Long customerId, Date dateOfBirth, String firstName, String gender, String lastName,
                             BigDecimal latitude, BigDecimal longitude, String maritalStatusCode, Long membershipId,
                             String mobilePhoneNumber, String phoneNumber, String postalCode, String principalName,
                             Date registeredDate, String stateProvince, String title) {
        this.address1 = address1;
        this.address2 = address2;
        this.approximateIncome = approximateIncome;
        this.childrenUnder18 = childrenUnder18;
        this.city = city;
        this.confirmedEmail = confirmedEmail;
        this.contactByAffilliatesFlag = contactByAffilliatesFlag;
        this.contactMethodCode = contactMethodCode;
        this.contactableFlag = contactableFlag;
        this.countryId = countryId;
        this.creditLimit = creditLimit;
        this.customerId = customerId;
        this.dateOfBirth = dateOfBirth;
        this.firstName = firstName;
        this.gender = gender;
        this.lastName = lastName;
        this.latitude = latitude;
        this.longitude = longitude;
        this.maritalStatusCode = maritalStatusCode;
        this.membershipId = membershipId;
        this.mobilePhoneNumber = mobilePhoneNumber;
        this.phoneNumber = phoneNumber;
        this.postalCode = postalCode;
        this.principalName = principalName;
        this.registeredDate = registeredDate;
        this.stateProvince = stateProvince;
        this.title = title;
    }


    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public Long getApproximateIncome() {
        return approximateIncome;
    }

    public void setApproximateIncome(Long approximateIncome) {
        this.approximateIncome = approximateIncome;
    }

    public Integer getChildrenUnder18() {
        return childrenUnder18;
    }

    public void setChildrenUnder18(Integer childrenUnder18) {
        this.childrenUnder18 = childrenUnder18;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getConfirmedEmail() {
        return confirmedEmail;
    }

    public void setConfirmedEmail(String confirmedEmail) {
        this.confirmedEmail = confirmedEmail;
    }

    public String getContactableFlag() {
        return contactableFlag;
    }

    public void setContactableFlag(String contactableFlag) {
        this.contactableFlag = contactableFlag;
    }

    public String getContactByAffilliatesFlag() {
        return contactByAffilliatesFlag;
    }

    public void setContactByAffilliatesFlag(String contactByAffilliatesFlag) {
        this.contactByAffilliatesFlag = contactByAffilliatesFlag;
    }

    public String getContactMethodCode() {
        return contactMethodCode;
    }

    public void setContactMethodCode(String contactMethodCode) {
        this.contactMethodCode = contactMethodCode;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public Integer getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Integer creditLimit) {
        this.creditLimit = creditLimit;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public String getMaritalStatusCode() {
        return maritalStatusCode;
    }

    public void setMaritalStatusCode(String maritalStatusCode) {
        this.maritalStatusCode = maritalStatusCode;
    }

    public Long getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(Long membershipId) {
        this.membershipId = membershipId;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPrincipalName() {
        return principalName;
    }

    public void setPrincipalName(String principalName) {
        this.principalName = principalName;
    }

    public Date getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(Date registeredDate) {
        this.registeredDate = registeredDate;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName() + "@" + Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("address1=");
        buffer.append(getAddress1());
        buffer.append(',');
        buffer.append("address2=");
        buffer.append(getAddress2());
        buffer.append(',');
        buffer.append("approximateIncome=");
        buffer.append(getApproximateIncome());
        buffer.append(',');
        buffer.append("childrenUnder18=");
        buffer.append(getChildrenUnder18());
        buffer.append(',');
        buffer.append("city=");
        buffer.append(getCity());
        buffer.append(',');
        buffer.append("confirmedEmail=");
        buffer.append(getConfirmedEmail());
        buffer.append(',');
        buffer.append("contactByAffilliatesFlag=");
        buffer.append(getContactByAffilliatesFlag());
        buffer.append(',');
        buffer.append("contactMethodCode=");
        buffer.append(getContactMethodCode());
        buffer.append(',');
        buffer.append("contactableFlag=");
        buffer.append(getContactableFlag());
        buffer.append(',');
        buffer.append("countryId=");
        buffer.append(getCountryId());
        buffer.append(',');
        buffer.append("creditLimit=");
        buffer.append(getCreditLimit());
        buffer.append(',');
        buffer.append("customerId=");
        buffer.append(getCustomerId());
        buffer.append(',');
        buffer.append("dateOfBirth=");
        buffer.append(getDateOfBirth());
        buffer.append(',');
        buffer.append("firstName=");
        buffer.append(getFirstName());
        buffer.append(',');
        buffer.append("gender=");
        buffer.append(getGender());
        buffer.append(',');
        buffer.append("lastName=");
        buffer.append(getLastName());
        buffer.append(',');
        buffer.append("latitude=");
        buffer.append(getLatitude());
        buffer.append(',');
        buffer.append("longitude=");
        buffer.append(getLongitude());
        buffer.append(',');
        buffer.append("maritalStatusCode=");
        buffer.append(getMaritalStatusCode());
        buffer.append(',');
        buffer.append("membershipId=");
        buffer.append(getMembershipId());
        buffer.append(',');
        buffer.append("mobilePhoneNumber=");
        buffer.append(getMobilePhoneNumber());
        buffer.append(',');
        buffer.append("phoneNumber=");
        buffer.append(getPhoneNumber());
        buffer.append(',');
        buffer.append("postalCode=");
        buffer.append(getPostalCode());
        buffer.append(',');
        buffer.append("principalName=");
        buffer.append(getPrincipalName());
        buffer.append(',');
        buffer.append("registeredDate=");
        buffer.append(getRegisteredDate());
        buffer.append(',');
        buffer.append("stateProvince=");
        buffer.append(getStateProvince());
        buffer.append(',');
        buffer.append("title=");
        buffer.append(getTitle());
        buffer.append(']');
        return buffer.toString();
    }
}
