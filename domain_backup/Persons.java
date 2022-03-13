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
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQueries({ @NamedQuery(name = "Persons.findAll", query = "select o from Persons o") })
public class Persons implements Serializable {
    private static final long serialVersionUID = 4275627451503935783L;
    @Column(name = "APPROXIMATE_INCOME")
    private Long approximateIncome;
    @Column(name = "CHILDREN_UNDER_18")
    private Integer childrenUnder18;
    @Column(name = "CONFIRMED_EMAIL", length = 25)
    private String confirmedEmail;
    @Column(name = "CONTACTABLE_FLAG", nullable = false, length = 1)
    private String contactableFlag;
    @Column(name = "CONTACT_BY_AFFILLIATES_FLAG", nullable = false, length = 1)
    private String contactByAffilliatesFlag;
    @Column(name = "CONTACT_METHOD_CODE", length = 30)
    private String contactMethodCode;
    @Column(name = "CREATED_BY", nullable = false, length = 60)
    private String createdBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "CREATION_DATE", nullable = false)
    private Date creationDate;
    @Column(name = "CREDIT_LIMIT")
    private Integer creditLimit;
    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_OF_BIRTH")
    private Date dateOfBirth;
    @Column(nullable = false, length = 25)
    private String email;
    @Column(name = "FIRST_NAME", length = 30)
    private String firstName;
    @Column(nullable = false, length = 1)
    private String gender;
    @Column(name = "LAST_NAME", length = 30)
    private String lastName;
    @Column(name = "LAST_UPDATED_BY", nullable = false, length = 60)
    private String lastUpdatedBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "LAST_UPDATE_DATE", nullable = false)
    private Date lastUpdateDate;
    @Column(name = "MARITAL_STATUS_CODE", nullable = false, length = 30)
    private String maritalStatusCode;
    @Column(name = "MOBILE_PHONE_NUMBER", length = 20)
    private String mobilePhoneNumber;
    @Column(name = "OBJECT_VERSION_ID", nullable = false)
    private Long objectVersionId;
    @Id
    @Column(name = "PERSON_ID", nullable = false)
    private Long personId;
    @Column(name = "PERSON_TYPE_CODE", nullable = false, length = 30)
    private String personTypeCode;
    @Column(name = "PHONE_NUMBER", length = 20)
    private String phoneNumber;
    @Column(name = "PRINCIPAL_NAME", nullable = false, length = 60)
    private String principalName;
    @Column(name = "PROVISIONED_FLAG", length = 1)
    private String provisionedFlag;
    @Temporal(TemporalType.DATE)
    @Column(name = "REGISTERED_DATE")
    private Date registeredDate;
    @Column(length = 12)
    private String title;
    @OneToMany(mappedBy = "persons", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CustomerInterests> customerInterestsList;
    @ManyToOne
    @JoinColumn(name = "SUPPLIER_ID")
    private Suppliers suppliers;
    @OneToMany(mappedBy = "persons1", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<PaymentOptions> paymentOptionsList;
    @OneToMany(mappedBy = "persons2", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CouponUsages> couponUsagesList1;
    @ManyToOne
    @JoinColumn(name = "MEMBERSHIP_ID")
    private MembershipsBase membershipsBase2;
    @OneToMany(mappedBy = "persons3", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<Orders> ordersList3;
    @OneToMany(mappedBy = "persons4", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CustomerIdentifications> customerIdentificationsList;
    @OneToOne(mappedBy = "persons5")
    private CustomerIdentifications customerIdentificationsList1;
    @OneToMany(mappedBy = "persons6", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<AddressUsages> addressUsagesList1;
    @ManyToOne
    @JoinColumn(name = "PRIMARY_ADDRESS_ID")
    private Addresses addresses2;

    public Persons() {
    }

    public Persons(Long approximateIncome, Integer childrenUnder18, String confirmedEmail,
                   String contactByAffilliatesFlag, String contactMethodCode, String contactableFlag, String createdBy,
                   Date creationDate, Integer creditLimit, Date dateOfBirth, String email, String firstName,
                   String gender, String lastName, Date lastUpdateDate, String lastUpdatedBy, String maritalStatusCode,
                   MembershipsBase membershipsBase2, String mobilePhoneNumber, Long objectVersionId, Long personId,
                   String personTypeCode, String phoneNumber, Addresses addresses2, String principalName,
                   String provisionedFlag, Date registeredDate, Suppliers suppliers, String title) {
        this.approximateIncome = approximateIncome;
        this.childrenUnder18 = childrenUnder18;
        this.confirmedEmail = confirmedEmail;
        this.contactByAffilliatesFlag = contactByAffilliatesFlag;
        this.contactMethodCode = contactMethodCode;
        this.contactableFlag = contactableFlag;
        this.createdBy = createdBy;
        this.creationDate = creationDate;
        this.creditLimit = creditLimit;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.firstName = firstName;
        this.gender = gender;
        this.lastName = lastName;
        this.lastUpdateDate = lastUpdateDate;
        this.lastUpdatedBy = lastUpdatedBy;
        this.maritalStatusCode = maritalStatusCode;
        this.membershipsBase2 = membershipsBase2;
        this.mobilePhoneNumber = mobilePhoneNumber;
        this.objectVersionId = objectVersionId;
        this.personId = personId;
        this.personTypeCode = personTypeCode;
        this.phoneNumber = phoneNumber;
        this.addresses2 = addresses2;
        this.principalName = principalName;
        this.provisionedFlag = provisionedFlag;
        this.registeredDate = registeredDate;
        this.suppliers = suppliers;
        this.title = title;
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

    public Integer getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Integer creditLimit) {
        this.creditLimit = creditLimit;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getMaritalStatusCode() {
        return maritalStatusCode;
    }

    public void setMaritalStatusCode(String maritalStatusCode) {
        this.maritalStatusCode = maritalStatusCode;
    }


    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public Long getObjectVersionId() {
        return objectVersionId;
    }

    public void setObjectVersionId(Long objectVersionId) {
        this.objectVersionId = objectVersionId;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getPersonTypeCode() {
        return personTypeCode;
    }

    public void setPersonTypeCode(String personTypeCode) {
        this.personTypeCode = personTypeCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String getPrincipalName() {
        return principalName;
    }

    public void setPrincipalName(String principalName) {
        this.principalName = principalName;
    }

    public String getProvisionedFlag() {
        return provisionedFlag;
    }

    public void setProvisionedFlag(String provisionedFlag) {
        this.provisionedFlag = provisionedFlag;
    }

    public Date getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(Date registeredDate) {
        this.registeredDate = registeredDate;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<CustomerInterests> getCustomerInterestsList() {
        return customerInterestsList;
    }

    public void setCustomerInterestsList(List<CustomerInterests> customerInterestsList) {
        this.customerInterestsList = customerInterestsList;
    }

    public CustomerInterests addCustomerInterests(CustomerInterests customerInterests) {
        getCustomerInterestsList().add(customerInterests);
        customerInterests.setPersons(this);
        return customerInterests;
    }

    public CustomerInterests removeCustomerInterests(CustomerInterests customerInterests) {
        getCustomerInterestsList().remove(customerInterests);
        customerInterests.setPersons(null);
        return customerInterests;
    }

    public Suppliers getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(Suppliers suppliers) {
        this.suppliers = suppliers;
    }

    public List<PaymentOptions> getPaymentOptionsList() {
        return paymentOptionsList;
    }

    public void setPaymentOptionsList(List<PaymentOptions> paymentOptionsList) {
        this.paymentOptionsList = paymentOptionsList;
    }

    public PaymentOptions addPaymentOptions(PaymentOptions paymentOptions) {
        getPaymentOptionsList().add(paymentOptions);
        paymentOptions.setPersons1(this);
        return paymentOptions;
    }

    public PaymentOptions removePaymentOptions(PaymentOptions paymentOptions) {
        getPaymentOptionsList().remove(paymentOptions);
        paymentOptions.setPersons1(null);
        return paymentOptions;
    }

    public List<CouponUsages> getCouponUsagesList1() {
        return couponUsagesList1;
    }

    public void setCouponUsagesList1(List<CouponUsages> couponUsagesList1) {
        this.couponUsagesList1 = couponUsagesList1;
    }

    public CouponUsages addCouponUsages(CouponUsages couponUsages) {
        getCouponUsagesList1().add(couponUsages);
        couponUsages.setPersons2(this);
        return couponUsages;
    }

    public CouponUsages removeCouponUsages(CouponUsages couponUsages) {
        getCouponUsagesList1().remove(couponUsages);
        couponUsages.setPersons2(null);
        return couponUsages;
    }

    public MembershipsBase getMembershipsBase2() {
        return membershipsBase2;
    }

    public void setMembershipsBase2(MembershipsBase membershipsBase2) {
        this.membershipsBase2 = membershipsBase2;
    }

    public List<Orders> getOrdersList3() {
        return ordersList3;
    }

    public void setOrdersList3(List<Orders> ordersList3) {
        this.ordersList3 = ordersList3;
    }

    public Orders addOrders(Orders orders) {
        getOrdersList3().add(orders);
        orders.setPersons3(this);
        return orders;
    }

    public Orders removeOrders(Orders orders) {
        getOrdersList3().remove(orders);
        orders.setPersons3(null);
        return orders;
    }

    public List<CustomerIdentifications> getCustomerIdentificationsList() {
        return customerIdentificationsList;
    }

    public void setCustomerIdentificationsList(List<CustomerIdentifications> customerIdentificationsList) {
        this.customerIdentificationsList = customerIdentificationsList;
    }

    public CustomerIdentifications addCustomerIdentifications(CustomerIdentifications customerIdentifications) {
        getCustomerIdentificationsList().add(customerIdentifications);
        customerIdentifications.setPersons4(this);
        return customerIdentifications;
    }

    public CustomerIdentifications removeCustomerIdentifications(CustomerIdentifications customerIdentifications) {
        getCustomerIdentificationsList().remove(customerIdentifications);
        customerIdentifications.setPersons4(null);
        return customerIdentifications;
    }

    public CustomerIdentifications getCustomerIdentificationsList1() {
        return customerIdentificationsList1;
    }

    public void setCustomerIdentificationsList1(CustomerIdentifications customerIdentificationsList1) {
        this.customerIdentificationsList1 = customerIdentificationsList1;
    }

    public List<AddressUsages> getAddressUsagesList1() {
        return addressUsagesList1;
    }

    public void setAddressUsagesList1(List<AddressUsages> addressUsagesList1) {
        this.addressUsagesList1 = addressUsagesList1;
    }

    public AddressUsages addAddressUsages(AddressUsages addressUsages) {
        getAddressUsagesList1().add(addressUsages);
        addressUsages.setPersons6(this);
        return addressUsages;
    }

    public AddressUsages removeAddressUsages(AddressUsages addressUsages) {
        getAddressUsagesList1().remove(addressUsages);
        addressUsages.setPersons6(null);
        return addressUsages;
    }

    public Addresses getAddresses2() {
        return addresses2;
    }

    public void setAddresses2(Addresses addresses2) {
        this.addresses2 = addresses2;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName() + "@" + Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("approximateIncome=");
        buffer.append(getApproximateIncome());
        buffer.append(',');
        buffer.append("childrenUnder18=");
        buffer.append(getChildrenUnder18());
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
        buffer.append("createdBy=");
        buffer.append(getCreatedBy());
        buffer.append(',');
        buffer.append("creationDate=");
        buffer.append(getCreationDate());
        buffer.append(',');
        buffer.append("creditLimit=");
        buffer.append(getCreditLimit());
        buffer.append(',');
        buffer.append("dateOfBirth=");
        buffer.append(getDateOfBirth());
        buffer.append(',');
        buffer.append("email=");
        buffer.append(getEmail());
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
        buffer.append("lastUpdateDate=");
        buffer.append(getLastUpdateDate());
        buffer.append(',');
        buffer.append("lastUpdatedBy=");
        buffer.append(getLastUpdatedBy());
        buffer.append(',');
        buffer.append("maritalStatusCode=");
        buffer.append(getMaritalStatusCode());
        buffer.append(',');
        buffer.append("mobilePhoneNumber=");
        buffer.append(getMobilePhoneNumber());
        buffer.append(',');
        buffer.append("objectVersionId=");
        buffer.append(getObjectVersionId());
        buffer.append(',');
        buffer.append("personId=");
        buffer.append(getPersonId());
        buffer.append(',');
        buffer.append("personTypeCode=");
        buffer.append(getPersonTypeCode());
        buffer.append(',');
        buffer.append("phoneNumber=");
        buffer.append(getPhoneNumber());
        buffer.append(',');
        buffer.append("principalName=");
        buffer.append(getPrincipalName());
        buffer.append(',');
        buffer.append("provisionedFlag=");
        buffer.append(getProvisionedFlag());
        buffer.append(',');
        buffer.append("registeredDate=");
        buffer.append(getRegisteredDate());
        buffer.append(',');
        buffer.append("title=");
        buffer.append(getTitle());
        buffer.append(']');
        return buffer.toString();
    }
}
