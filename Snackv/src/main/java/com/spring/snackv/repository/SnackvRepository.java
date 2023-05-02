package com.spring.snackv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.snackv.model.Snackv;

public interface SnackvRepository extends JpaRepository<Snackv, Integer> {
	
Snackv findByuname(String uname);
}
