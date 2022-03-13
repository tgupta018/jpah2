package com.demo.spring.service.domain;

import java.io.Serializable;

public class CouponUsagesPK implements Serializable {
    private Long persons2;
    private Long discountsBase4;

    public CouponUsagesPK() {
    }

    public CouponUsagesPK(Long persons2, Long discountsBase4) {
        this.persons2 = persons2;
        this.discountsBase4 = discountsBase4;
    }

    public boolean equals(Object other) {
        if (other instanceof CouponUsagesPK) {
            final CouponUsagesPK otherCouponUsagesPK = (CouponUsagesPK) other;
            final boolean areEqual =
                (otherCouponUsagesPK.persons2.equals(persons2) &&
                 otherCouponUsagesPK.discountsBase4.equals(discountsBase4));
            return areEqual;
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public Long getPersons2() {
        return persons2;
    }

    public void setPersons2(Long persons2) {
        this.persons2 = persons2;
    }

    public Long getDiscountsBase4() {
        return discountsBase4;
    }

    public void setDiscountsBase4(Long discountsBase4) {
        this.discountsBase4 = discountsBase4;
    }
}
