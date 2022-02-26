package com.example.jpa.h2.demo.repo;

import com.example.jpa.h2.demo.model.CategoryTranslationsEntity;
import com.example.jpa.h2.demo.model.CategoryTranslationsEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryTranslationsRepo extends JpaRepository<CategoryTranslationsEntity, CategoryTranslationsEntityPK> {
}
