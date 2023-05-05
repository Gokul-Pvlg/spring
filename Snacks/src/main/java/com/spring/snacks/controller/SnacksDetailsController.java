package com.spring.snacks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.snacks.model.SnacksDetails;
import com.spring.snacks.service.SnacksDetailsService;

@RestController
public class SnacksDetailsController {
	@Autowired
	SnacksDetailsService ser;
	
	@PostMapping("/postDetails")
	public SnacksDetails postDetails(@RequestBody SnacksDetails d)
	{
		return ser.postDetails(d);
	}
	@GetMapping("/getDetails")
	public List<SnacksDetails> getDetails(){
		return ser.getDetails();
	}
	
	

}
