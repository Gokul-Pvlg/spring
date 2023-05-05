package com.spring.snacks.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.snacks.model.SnacksDetails;
import com.spring.snacks.repository.SnacksDetailsRepository;


@Service
public class SnacksDetailsService {

	@Autowired
	SnacksDetailsRepository rep;
	public SnacksDetails postDetails(SnacksDetails d) {
		// TODO Auto-generated method stub
		return rep.save(d);
	}
	public List<SnacksDetails> getDetails() {
		// TODO Auto-generated method stub
		return rep.findAll();
	}

}
