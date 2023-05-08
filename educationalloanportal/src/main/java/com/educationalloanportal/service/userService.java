package com.educationalloanportal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educationalloanportal.model.userModel;

import com.educationalloanportal.repository.userRepository;


@Service
public class userService {
@Autowired
userRepository usRep;


		public List<userModel> getProfile()
		{
			return usRep.findAll();
			
		}
		
		public userModel savedata(userModel l)
		{
			return usRep.save(l);
		}
		
		public void deletedata(int id)
		{
			usRep.deleteById(id);
		}
		
		public userModel updatedata (userModel c,int id)
		{
			Optional<userModel> eldata=usRep.findById(id);
			if(eldata.isPresent())
			
			{
				return usRep.save(c);
			}
			return null;
		}
		
}

