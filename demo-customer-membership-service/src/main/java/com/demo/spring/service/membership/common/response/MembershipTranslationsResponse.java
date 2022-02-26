package com.demo.spring.service.membership.common.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MembershipTranslationsResponse {
    Long membershipTranslationsId;
    String membershipName;
    String description;
    String language;
    String sourceLanguage;
    List<PersonResponse> personResponseList;
}
