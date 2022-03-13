package com.demo.spring.service.membership.common.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonResponse {
    Long personId;
    String principalName;
    String title;
    String firstName;
    String lastName;
}
