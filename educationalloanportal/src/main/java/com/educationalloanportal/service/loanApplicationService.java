package com.educationalloanportal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educationalloanportal.model.loanApplicationModel;


import com.educationalloanportal.repository.loanApplicationRepository;

@Service
public class loanApplicationService {
@Autowired
loanApplicationRepository laRep;


		public List<loanApplicationModel> getAllloans()
		{
			return laRep.findAll();
			
		}
		public loanApplicationModel saveloan(loanApplicationModel l)
		{
			return laRep.save(l);
		}
		
		public void deleteloan(int id)
		{
			laRep.deleteById(id);
		}
		
		public loanApplicationModel updateloan (loanApplicationModel c,int id)
		{
			Optional<loanApplicationModel> eldata=laRep.findById(id);
			if(eldata.isPresent())
			
			{
				return laRep.save(c);
			}
			return null;
		}

}
