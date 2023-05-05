package com.spring.snacks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.snacks.model.SnacksDetails;

public interface SnacksDetailsRepository extends JpaRepository<SnacksDetails,Long> {



}
