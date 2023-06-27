package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

//import com.example.watches.model.Watch;

public interface ApiRepository extends JpaRepository<Customer,Integer> {
	
	@Query("select s from Customer s where s.bikeVariant=:bikeVariant")
	public List<Customer>getCustomerByClass(String bikeVariant);
    
	@Modifying
	@Query("delete from Customer s  where s.paymentMode=?1")
	public int deleteCustomerByClass(String paymentMode);
	
	@Modifying
	@Query("update Customer s set s.paymentMode=?1 where s.bikeColor=?2")
	public int UpdateCustomerByClass(String paymentMode,String bikeColor);
	
	/*List<Customer> findByBrandStartingWith(String prefix);
	List<Customer> findByBrandEndingWith(String suffix);
	List<Customer> findByBrand(String Brand);*/


}