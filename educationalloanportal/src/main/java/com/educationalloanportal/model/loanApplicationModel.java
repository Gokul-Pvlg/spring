package com.educationalloanportal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class loanApplicationModel {
@Id

private int loanId;
private String loantype;
private String applicantName;
private String applicantAddress;
private String applicantMobile;
private String applicantEmail;
private String applicantAadhaar;
private String applicantPan;
private String applicantSalary;


public int getLoanId() {
	return loanId;
}
public void setLoanId(int loanId) {
	this.loanId = loanId;
}
public String getLoantype() {
	return loantype;
}
public void setLoantype(String loantype) {
	this.loantype = loantype;
}
public String getApplicantName() {
	return applicantName;
}
public void setApplicantName(String applicantName) {
	this.applicantName = applicantName;
}
public String getApplicantAddress() {
	return applicantAddress;
}
public void setApplicantAddress(String applicantAddress) {
	this.applicantAddress = applicantAddress;
}
public String getApplicantMobile() {
	return applicantMobile;
}
public void setApplicantMobile(String applicantMobile) {
	this.applicantMobile = applicantMobile;
}
public String getApplicantEmail() {
	return applicantEmail;
}
public void setApplicantEmail(String applicantEmail) {
	this.applicantEmail = applicantEmail;
}
public String getApplicantAadhaar() {
	return applicantAadhaar;
}
public void setApplicantAadhaar(String applicantAadhaar) {
	this.applicantAadhaar = applicantAadhaar;
}
public String getApplicantPan() {
	return applicantPan;
}
public void setApplicantPan(String applicantPan) {
	this.applicantPan = applicantPan;
}
public String getApplicantSalary() {
	return applicantSalary;
}
public void setApplicantSalary(String applicantSalary) {
	this.applicantSalary = applicantSalary;
}

}
