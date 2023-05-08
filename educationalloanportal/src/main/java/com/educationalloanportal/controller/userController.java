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

import com.educationalloanportal.model.adminModel;
import com.educationalloanportal.model.userModel;
import com.educationalloanportal.service.userService;


@RestController
public class userController {
	@Autowired
	userService usSer;
//	@Autowired
//	loanApplicationSer laSer;

		@GetMapping("/user/getProfile")
		public List<userModel> getProfile()
		{
			
		return usSer.getProfile();
		}
		
//		@GetMapping("admin/getAllloans")
//		public List<adminModel> getAllLoans()
//		{
//			
//		return laSer.getAllloans();
//		}
		
		@PostMapping("/user/insert")
		public userModel savelog(@RequestBody userModel l)
		{
			return usSer.savedata(l);
		}
		
		@PutMapping("/user/update/{id}")
		
			public userModel updateuser (@RequestBody userModel u, @PathVariable("id") int id)
			{
			return usSer.updatedata(u,id);
			}
		
		@DeleteMapping("/user/{id}")
		public String  deleteconnection(@PathVariable("id") int id)
		{
			usSer.deletedata(id);
			return "Deleted";
		}
		
		
		
		
	}

