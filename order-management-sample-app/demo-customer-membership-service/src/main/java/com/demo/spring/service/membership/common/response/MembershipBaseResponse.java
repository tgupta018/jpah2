package com.demo.spring.service.membership.common.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MembershipBaseResponse {
//    Long membershipId;
//    String membershipTypeCode;
//    Long contactId;
    List<MembershipTranslationsResponse> membershipTranslationsResponseList;
}
