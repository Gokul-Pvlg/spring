package com.spring.snackv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.spring.snackv.model.Snackv;
import com.spring.snackv.repository.SnackvRepository;

@Service
public class SnackvService {
	@Autowired
	SnackvRepository repository;
	public String checkLogin(String uname,String pwd) {
		Snackv user=repository.findByuname(uname);
		if(user==null) {
			return "no user found";
		}
		else
		{
			if(user.getPwd().equals(pwd)) {
				return "Login Successfull";
			}
			else {
				return "Login Failed";
			}
		}
	}
	public Snackv addUser(Snackv snackv) {

		return repository.save(snackv);

	}

	public List<Snackv			> getUser(){

		return repository.findAll();

	}
	public List<Snackv> paginationAndSorting(int pageNumber, int pageSize, String column_name){
		Page<Snackv> i = repository.findAll(PageRequest.of(pageNumber, pageSize, Sort.by(column_name).descending()));
		return i.getContent();
	}
	public List<Snackv> sortDescending(String field){	
		return repository.findAll(Sort.by(Direction.DESC, field));
	}
	
	public List<Snackv> sortAscending(String field){	
		return repository.findAll(Sort.by(Direction.ASC, field));
	}
	public List<Snackv> pagination(int pageNumber, int pageSize){
		Page<Snackv> i = repository.findAll(PageRequest.of(pageNumber, pageSize));
		return i.getContent();
	}
	
	public List<Snackv> paginationAndSortingList(int pageNumber, int pageSize, String column_name){
		Page<Snackv> i = repository.findAll(PageRequest.of(pageNumber, pageSize, Sort.by(column_name).descending()));
		return i.getContent();
	}
	
}
