package com.demo.spring.service.membership.common.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    String principalName;
    String title;
    String firstName;
    String lastName;
    String personTypeCode;
    Long supplierId;
    String provisionedFlag;
    Long primaryAddressId;
    Date registeredDate;
    Long membershipId;
    String email;
    String confirmedEmail;
    String phoneNumebr;
    String mobilePhoneNumber;
    Double creditLimit;
    Date dateOfBirth;
    String martialStatusCode;
    String gender;
    Long childrenUnder18;
    Double approximateIncome;
    String contactMethodCode;
    String contactableFlag;
    String contactByAffilliatesFlag;
}
