package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

//import com.example.customers.dao.repo;
//import com.example.demo.Customer;

import jakarta.transaction.Transactional;

@Service
public class ApiService {
@Autowired
	ApiRepository repo;
	public List <Customer> getAllDetails(){
		List<Customer>customerList=repo.findAll();
		return customerList;
	}
	public Customer saveCustomers(Customer s) {
		Customer obj=repo.save(s);
		return obj;
		//return studRepository.save(S);
	}
	public Customer updateCustomer(Customer s)
	{
		Customer obj=repo.save(s);
		return obj;
	}
	public void deleteCustomer(int sNo)
	{
		repo.deleteById(sNo);
	}
	public Customer getCustomer(int sNo)
	{
		Customer s=repo.findById(sNo).get();
		return s;
	}
	
	public List<Customer> sortCustomer(String field) {
		//return repo.findAll(Sort.by(field)); //to return the table data in ascending order
		return repo.findAll(Sort.by(Direction.DESC,field));
	}
	public List<Customer>PagingCustomer(int offset,int pageSize)
	{
		Pageable paging=PageRequest.of(offset, pageSize);
		Page<Customer>customerData=repo.findAll(paging);
		List<Customer> customerList=customerData.getContent();
		return  customerList;
	}
	

	
	public List<Customer>pagingSortingCustomer(int offset,int pageSize,String field){
		
		Pageable paging=PageRequest.of(offset,pageSize).withSort(Sort.by(field));
		Page<Customer>customerData= repo.findAll(paging);	
		List<Customer>customerList=customerData.getContent();
		return customerList;
	}
	
	public List<Customer>getCustomerByBrand(String bikeVariant) {
		List<Customer> customerList=repo.getCustomerByClass(bikeVariant);
		return customerList;
	}
	@Transactional
	public int deleteCustomerByBrand(String bikeVariant) {
		return repo.deleteCustomerByClass(bikeVariant);
	}
	
	@Transactional
	public int UpdateCustomerByBrand(String bikeVariant,String bikeColor) {
		return repo.UpdateCustomerByClass(bikeVariant,bikeColor);
	}

	

}