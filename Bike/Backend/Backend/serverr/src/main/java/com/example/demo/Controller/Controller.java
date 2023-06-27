package com.example.demo.Controller;

import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Customer;
//import com.example.demo.Customer;
//import com.example.customeres.service.service;

import io.swagger.v3.oas.annotations.tags.Tag;

//import com.example.Store.model.Store;
//import com.example.Store.model.Store;
import com.example.demo.ApiService;
@CrossOrigin("*")
@RestController
public class Controller{
	@Autowired
	ApiService service;
    @Tag(name="Get",description="get data")
	@GetMapping(value="fetchDetails") 
	public List<Customer> getAllDetails(){
	List<Customer> customerList=service.getAllDetails();
		return customerList;
}
	@PostMapping(value="/saveDetails")
	public   Customer saveDetails(@RequestBody Customer s)
	{
		return service.saveCustomers(s);
	}
	@PutMapping(value="/updateDetails")
	public Customer updateCustomer(@RequestBody Customer s)
	{
		return service.saveCustomers(s);
	}
	@DeleteMapping(value="/deleteDetails/{rno}")
	public void deleteCustomer(@PathVariable("rno") int sNo) {
		service.deleteCustomer(sNo);
	}
	@GetMapping(value="/getCustomer/{rno}")
	public Customer getCustomer(@PathVariable("rno") int sNo) {
		return service.getCustomer(sNo);
	}
	@GetMapping("/sortCustomer/{field}")
	 public List<Customer>sortCustomer(@PathVariable String field) 
	 {
		 return service.sortCustomer(field);
		 
	 }
	 
	 //paging
	 @GetMapping("/pagingCustomers/{offset}/{pageSize}")
	 public List<Customer>pagingcustomer(@PathVariable int offset,@PathVariable int pageSize) 
	 {
		 return service.PagingCustomer(offset,pageSize);
	 }
	 
	 //paging&&sorting
	
	 @GetMapping("/pagingSortingCustomer/{offset}/{pageSize}/{field}")
	  public List<Customer>pagingSortingCustomer(@PathVariable int offset,@PathVariable int pageSize,@PathVariable String field) 
	  {
		 return service.pagingSortingCustomer(offset,pageSize,field);
	  }
	 

	/* @GetMapping("/getCustomerByBrand/{brand}")
	 public List<Customer>getCustomerByBrand(@PathVariable String brand) {
		 List<Customer> customerList=service.getCustomerByBrand(brand);
		 return customerList;
	 }
	 
	 @DeleteMapping("/deleteCustomerByBrand/{brand}")
	 public String deleteStudentByName(@PathVariable String brand) {
		 int result=service.deleteCustomerByBrand(brand);
		 if(result>0)
			 return "Student record deleted";
		 else
			 return "Problem occured while deleting";
	 }
	 @PutMapping("/updateCustomerByBrand/{brand}/{price}")
	 public String updateCustomerByBrand(@PathVariable String brand,@PathVariable String price) {
		 int result=service.UpdateCustomerByBrand(brand,price);
		 if(result>0)
			 return "Customer record updated";
		 else
			 return "Problem occured while updating";
	 }*/

	 
	  
}