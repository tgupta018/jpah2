package com.demo.spring.service.membership.controller;

import com.demo.spring.service.membership.common.request.MembersRequest;
import com.demo.spring.service.membership.utils.MembersConstants;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = MembersConstants.MEMBERS_SERVICE_PATH)
public interface MembersRest {

    @RequestMapping(path = "/membersdetail/{memberId}/{language}",method = RequestMethod.GET )
    public ResponseEntity<?> getMembersDetail(@PathVariable(name = "memberId", required = true) Long memberId);

    @PostMapping(value = "/create")
    public ResponseEntity<?> createMembers(@RequestBody MembersRequest membersDetails, @RequestHeader String transactionId);
}
