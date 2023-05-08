package com.educationalloanportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.educationalloanportal.model.loanApplicationModel;
import com.educationalloanportal.model.loginModel;
import com.educationalloanportal.model.userModel;
import com.educationalloanportal.service.loanApplicationService;


@RestController
public class loanApplicationController {
	@Autowired
	loanApplicationService laSer;


	@GetMapping("/la/getloandata")
	public List<loanApplicationModel> getloandata()
	{
		
	return laSer.getAllloans();
	}
	
	@PostMapping("/la/saveloan")
	public loanApplicationModel saveloan(@RequestBody loanApplicationModel l)
	{
		return laSer.saveloan(l);
	}
	
	@PutMapping("/la/update/{loanId}")
	
		public loanApplicationModel updateuser (@RequestBody loanApplicationModel u, @PathVariable("loanId") int loanId)
		{
		return laSer.updateloan(u,loanId);
		}
	
	@DeleteMapping("/la/{loanId}")
	public String  deleteconnection(@PathVariable("loanId") int loanId)
	{
		laSer.deleteloan(loanId);
		return "Deleted";
	}
	
	
	
	
	
	
//	@GetMapping("user/getProfile")
//		public List<userModel> getProfile()
//		{
//			
//		return laSer.getProfile();
//		}
//		
//		@PostMapping("user/login")
//		public loginModel savelog(@RequestBody loginModel l)
//		{
//			return laSer.saveLog(l);
//		}
}
