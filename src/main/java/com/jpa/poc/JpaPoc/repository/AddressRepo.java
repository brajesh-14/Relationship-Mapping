package com.jpa.poc.JpaPoc.repository;

import com.jpa.poc.JpaPoc.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address, Long> {
}
