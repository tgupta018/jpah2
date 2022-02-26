package com.example.jpa.h2.demo.controller;

import com.example.jpa.h2.demo.constants.ProductConstants;
import com.example.jpa.h2.demo.model.CategoryTranslationsEntity;
import com.example.jpa.h2.demo.service.CategoryTranslationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ProductConstants.PRODUCT_REQUEST_MAPPING)
public class ProductController {

    @Autowired
    CategoryTranslationsService categoryTranslationsService;

    @GetMapping(path = "/categorytranslations/{language}/{categoryId}",
    produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getControllerId(@PathVariable @DefaultValue("EN") String language,
                                             @PathVariable(required=true) Long categoryId){
        try{
            CategoryTranslationsEntity categoryTranslationsEntity
                    = categoryTranslationsService.getSampleCategoryTranslation(language, categoryId);

            return new ResponseEntity(categoryTranslationsEntity, HttpStatus.OK);
        }catch (Exception exception){
            return new ResponseEntity(exception.getCause(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
