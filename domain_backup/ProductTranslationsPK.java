package com.demo.spring.service.domain;

import java.io.Serializable;

public class ProductTranslationsPK implements Serializable {
    private String language;
    private Long productsBase1;

    public ProductTranslationsPK() {
    }

    public ProductTranslationsPK(String language, Long productsBase1) {
        this.language = language;
        this.productsBase1 = productsBase1;
    }

    public boolean equals(Object other) {
        if (other instanceof ProductTranslationsPK) {
            final ProductTranslationsPK otherProductTranslationsPK = (ProductTranslationsPK) other;
            final boolean areEqual =
                (otherProductTranslationsPK.language.equals(language) &&
                 otherProductTranslationsPK.productsBase1.equals(productsBase1));
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

    public Long getProductsBase1() {
        return productsBase1;
    }

    public void setProductsBase1(Long productsBase1) {
        this.productsBase1 = productsBase1;
    }
}
