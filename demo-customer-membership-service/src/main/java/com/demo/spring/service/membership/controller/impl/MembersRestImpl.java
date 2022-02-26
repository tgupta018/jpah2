package com.demo.spring.service.membership.controller.impl;

import com.demo.spring.service.membership.common.request.MembersRequest;
import com.demo.spring.service.membership.controller.MembersRest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

public class MembersRestImpl implements MembersRest {


    public ResponseEntity<?> getMembersDetail(@PathVariable(name = "memberId", required = true) Long memberId){

        return null;
    }

    public ResponseEntity<?> createMembers(@RequestBody MembersRequest membersDetails, @RequestHeader String transactionId){


        return null;
    }

}
