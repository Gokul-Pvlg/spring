package com.educationalloanportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educationalloanportal.model.adminModel;
import com.educationalloanportal.model.loanApplicationModel;
@Repository
public interface loanApplicationRepository extends JpaRepository<loanApplicationModel, Integer> {

}
