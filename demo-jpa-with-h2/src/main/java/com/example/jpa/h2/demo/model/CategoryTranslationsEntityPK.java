package com.example.jpa.h2.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryTranslationsEntityPK  implements Serializable {

    private String language;
    private Long categoryId;
    public boolean equals(Object other) {
        if (other instanceof CategoryTranslationsEntityPK) {
            final CategoryTranslationsEntityPK otherProductTranslationsPK = (CategoryTranslationsEntityPK) other;
            final boolean areEqual =
                    (otherProductTranslationsPK.language.equals(language) &&
                            otherProductTranslationsPK.categoryId.equals(categoryId));
            return areEqual;
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode();
    }
}
