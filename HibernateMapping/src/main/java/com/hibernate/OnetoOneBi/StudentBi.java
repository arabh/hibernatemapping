package com.hibernate.OnetoOneBi;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.hibernate.OnetoOneUni.Address;

@Entity
@Table(name = "student_bi")
public class StudentBi {
	@Id
	@Column
	int id;
	
	@Column
	String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	//@PrimaryKeyJoinColumn
	@JoinColumn
	//@JoinTable(name="Combined_Table")
	AddressBi addressbi;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AddressBi getAddressbi() {
		return addressbi;
	}

	public void setAddressbi(AddressBi addressbi) {
		this.addressbi = addressbi;
	}

	@Override
	public String toString() {
		return "StudentBi [id=" + id + ", name=" + name + ", addressbi=" + addressbi + "]";
	}

	public StudentBi(int id, String name, AddressBi addressbi) {
		super();
		this.id = id;
		this.name = name;
		this.addressbi = addressbi;
	}

	public StudentBi() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}