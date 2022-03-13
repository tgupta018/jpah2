package com.demo.spring.service.membership.repo;

import com.demo.spring.service.membership.model.MembershipTranslations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MembershipTranslationsRepository extends JpaRepository<MembershipTranslations,Long> {

    List<MembershipTranslations> findMembershipTranslationsByMembershipsBase1_MembershipId(Long membershipId);
}
