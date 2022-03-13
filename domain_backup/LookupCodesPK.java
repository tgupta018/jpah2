package com.demo.spring.service.domain;

import java.io.Serializable;

public class LookupCodesPK implements Serializable {
    private String language;
    private String lookupCode;
    private String lookupType;

    public LookupCodesPK() {
    }

    public LookupCodesPK(String language, String lookupCode, String lookupType) {
        this.language = language;
        this.lookupCode = lookupCode;
        this.lookupType = lookupType;
    }

    public boolean equals(Object other) {
        if (other instanceof LookupCodesPK) {
            final LookupCodesPK otherLookupCodesPK = (LookupCodesPK) other;
            final boolean areEqual =
                (otherLookupCodesPK.language.equals(language) && otherLookupCodesPK.lookupCode.equals(lookupCode) &&
                 otherLookupCodesPK.lookupType.equals(lookupType));
            return areEqual;
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLookupCode() {
        return lookupCode;
    }

    public void setLookupCode(String lookupCode) {
        this.lookupCode = lookupCode;
    }

    public String getLookupType() {
        return lookupType;
    }

    public void setLookupType(String lookupType) {
        this.lookupType = lookupType;
    }
}
