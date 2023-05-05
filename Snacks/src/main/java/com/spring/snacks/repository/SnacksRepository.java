package com.spring.snacks.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.spring.snacks.model.Snacks;

public interface SnacksRepository extends JpaRepository<Snacks, Integer> {
	
	@Query("select s from Snacks s where s.snacksname=:snacksname")
	public List<Snacks> getSnacksByName(String snacksname);
	@Modifying
	@Query("delete from Snacks s where s.snacksname=?1")
	public int deleteSnacks(String snacksname);
	@Modifying
	@Query("update Snacks s set s.price=?1 where s.snacksname=?2")
	public int updatesnacks(float price,String snacksname);

}
