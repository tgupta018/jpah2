package com.demo.spring.service.domain;

import java.io.Serializable;

public class EligibleDiscountsPK implements Serializable {
    private Long membershipsBase;
    private Long discountsBase2;

    public EligibleDiscountsPK() {
    }

    public EligibleDiscountsPK(Long membershipsBase, Long discountsBase2) {
        this.membershipsBase = membershipsBase;
        this.discountsBase2 = discountsBase2;
    }

    public boolean equals(Object other) {
        if (other instanceof EligibleDiscountsPK) {
            final EligibleDiscountsPK otherEligibleDiscountsPK = (EligibleDiscountsPK) other;
            final boolean areEqual =
                (otherEligibleDiscountsPK.membershipsBase.equals(membershipsBase) &&
                 otherEligibleDiscountsPK.discountsBase2.equals(discountsBase2));
            return areEqual;
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public Long getMembershipsBase() {
        return membershipsBase;
    }

    public void setMembershipsBase(Long membershipsBase) {
        this.membershipsBase = membershipsBase;
    }

    public Long getDiscountsBase2() {
        return discountsBase2;
    }

    public void setDiscountsBase2(Long discountsBase2) {
        this.discountsBase2 = discountsBase2;
    }
}
