package com.example.jpa.h2.demo.service;

import com.example.jpa.h2.demo.model.CategoryTranslationsEntity;
import com.example.jpa.h2.demo.model.CategoryTranslationsEntityPK;
import com.example.jpa.h2.demo.repo.CategoryTranslationsRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CategoryTranslationsService {

    @Autowired
    CategoryTranslationsRepo categoryTranslationsRepo;

    public CategoryTranslationsEntity getSampleCategoryTranslation(String language, Long categoryId){
        try {
            CategoryTranslationsEntityPK categoryTranslationsEntityPK = new CategoryTranslationsEntityPK(language, categoryId);
            CategoryTranslationsEntity categoryTranslationsEntity =  categoryTranslationsRepo.getById(categoryTranslationsEntityPK);
            return categoryTranslationsEntity;
        }catch (Exception exception){
            log.error("Exception occurred {}",exception);
            throw exception;
        }
    }
}
