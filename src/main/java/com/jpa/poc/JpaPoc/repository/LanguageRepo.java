package com.jpa.poc.JpaPoc.repository;

import com.jpa.poc.JpaPoc.entity.Languages;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepo extends JpaRepository<Languages, Long> {

   Languages findByLanguage(String lang);
}
