package com.demo.spring.service.domain;

import java.io.Serializable;

public class CountryCodesPK implements Serializable {
    private String isoCountryCode;
    private String language;

    public CountryCodesPK() {
    }

    public CountryCodesPK(String isoCountryCode, String language) {
        this.isoCountryCode = isoCountryCode;
        this.language = language;
    }

    public boolean equals(Object other) {
        if (other instanceof CountryCodesPK) {
            final CountryCodesPK otherCountryCodesPK = (CountryCodesPK) other;
            final boolean areEqual =
                (otherCountryCodesPK.isoCountryCode.equals(isoCountryCode) &&
                 otherCountryCodesPK.language.equals(language));
            return areEqual;
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String getIsoCountryCode() {
        return isoCountryCode;
    }

    public void setIsoCountryCode(String isoCountryCode) {
        this.isoCountryCode = isoCountryCode;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
