package com.educationalloanportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educationalloanportal.model.adminModel;
import com.educationalloanportal.model.loanApplicationModel;
import com.educationalloanportal.model.loginModel;
import com.educationalloanportal.model.userModel;
@Repository
public interface userRepository extends JpaRepository<userModel, Integer> {

}
