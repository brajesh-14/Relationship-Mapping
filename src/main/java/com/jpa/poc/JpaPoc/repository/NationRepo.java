package com.jpa.poc.JpaPoc.repository;

import com.jpa.poc.JpaPoc.entity.Nationality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NationRepo extends JpaRepository<Nationality, Long> {

}
