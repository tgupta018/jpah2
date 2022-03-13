package com.demo.spring.service.domain;

import java.io.Serializable;

public class CategoryTranslationsPK implements Serializable {
    private String language;
    private Long productCategoriesBase2;

    public CategoryTranslationsPK() {
    }

    public CategoryTranslationsPK(String language, Long productCategoriesBase2) {
        this.language = language;
        this.productCategoriesBase2 = productCategoriesBase2;
    }

    public boolean equals(Object other) {
        if (other instanceof CategoryTranslationsPK) {
            final CategoryTranslationsPK otherCategoryTranslationsPK = (CategoryTranslationsPK) other;
            final boolean areEqual =
                (otherCategoryTranslationsPK.language.equals(language) &&
                 otherCategoryTranslationsPK.productCategoriesBase2.equals(productCategoriesBase2));
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

    public Long getProductCategoriesBase2() {
        return productCategoriesBase2;
    }

    public void setProductCategoriesBase2(Long productCategoriesBase2) {
        this.productCategoriesBase2 = productCategoriesBase2;
    }
}
