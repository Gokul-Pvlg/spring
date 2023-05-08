package com.educationalloanportal.model;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class userModel 

{
@jakarta.persistence.Id
private int Id;
private String Email;
private String Password;
private String Username;
private String MobileNumber;
private String UserRole;
private int LoanId;


//@OneToMany(cascade = CascadeType.ALL)
//@JoinColumn(name="department")
//private List<loanApplicationModel> loanModels;




public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public String getUsername() {
	return Username;
}
public void setUsername(String username) {
	Username = username;
}
public String getMobileNumber() {
	return MobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	MobileNumber = mobileNumber;
}
public String getUserRole() {
	return UserRole;
}
public void setUserRole(String userRole) {
	UserRole = userRole;
}
public int getLoanId() {
	return LoanId;
}
public void setLoanId(int loanId) {
	LoanId = loanId;
}
//public List<loanApplicationModel> getLoanModels() {
//	return loanModels;
//}
//public void setLoanModels(List<loanApplicationModel> loanModels) {
//	this.loanModels = loanModels;
//}


}
