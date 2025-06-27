package com.jpa.poc.JpaPoc.repository;

import com.jpa.poc.JpaPoc.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface
UserRepo extends JpaRepository<User, Long> {
}
