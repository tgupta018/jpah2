package com.demo.spring.service.membership.common.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MembersRequest {
    Long membershipId;
    String membershipName;
    String description;
    String language;
    String sourceLanguage;
    Long objectVersionId;
    List<Person> persons;
}
