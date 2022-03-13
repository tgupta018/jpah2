package com.demo.spring.service.membership.service;

import com.demo.spring.service.membership.common.response.MembershipResponse;
import com.demo.spring.service.membership.common.response.MembershipTranslationsResponse;
import com.demo.spring.service.membership.common.response.PersonResponse;
import com.demo.spring.service.membership.model.MembershipTranslations;
import com.demo.spring.service.membership.model.MembershipsBase;
import com.demo.spring.service.membership.repo.MembershipTranslationsRepository;
import com.demo.spring.service.membership.repo.MembershipsBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class MembersService {

    private MembershipsBaseRepository membershipsBaseRepository;
    private MembershipTranslationsRepository membershipTranslationsRepository;

    public MembersService(@Autowired MembershipsBaseRepository membershipsBaseRepository,
                          @Autowired MembershipTranslationsRepository membershipTranslationsRepository){
        this.membershipTranslationsRepository = membershipTranslationsRepository;
        this.membershipsBaseRepository = membershipsBaseRepository;
    }

    private MembershipResponse getMembershipWithPersonDetails(String transactionId, Long memberShipId){
       List<MembershipTranslations> membershipTranslationsList =
               membershipTranslationsRepository.findMembershipTranslationsByMembershipsBase1_MembershipId(memberShipId);

    }

    private List<PersonResponse> getPersonsDetails(){
        return null;
    }

    private MembershipResponse prepareMembershipResponse(String transactionId,List<MembershipTranslations> membershipTranslationsList ){

       Map<MembershipsBase,List<MembershipTranslations>> membershipsBaseListMap =  membershipTranslationsList.stream()
                .collect(Collectors.groupingBy(MembershipTranslations::getMembershipsBase1));

        membershipsBaseListMap.entrySet().stream().


    }

    private List<MembershipTranslationsResponse> transformMembershipTranslationsList(List<MembershipTranslations> membershipTranslationsList){

        Function<MembershipTranslations, MembershipTranslationsResponse> transformFunction =
                membershipTranslations -> new MembershipTranslationsResponse( membershipTranslations.getMembershipTranslationsId(),
                membershipTranslations.getMembershipName(),membershipTranslations.getDescription(),
                membershipTranslations.getLanguage(),membershipTranslations.getSourceLanguage(), null);


         return  membershipTranslationsList.stream()
                .map(k->transformFunction(k))
                .collect(Collectors.toList());
    }

}
