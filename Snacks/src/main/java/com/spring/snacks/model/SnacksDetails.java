package com.spring.snacks.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class SnacksDetails {
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="item_id")
	private Snacks snack;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String description;
	private String manudate;
	private String expdate;
	private String discount;
	public Snacks getSnack() {
		return snack;
	}
	public void setSnack(Snacks snack) {
		this.snack = snack;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getManudate() {
		return manudate;
	}
	public void setManudate(String manudate) {
		this.manudate = manudate;
	}
	public String getExpdate() {
		return expdate;
	}
	public void setExpdate(String expdate) {
		this.expdate = expdate;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	
	

}
