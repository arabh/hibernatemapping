package com.hibernate.OnetoOneBi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="address_bi")
public class AddressBi {
	@Id
	@Column
	int addId;
	
	@Column
	String city;

	@Column
	int pinCode;
	
	@OneToOne
	StudentBi studentbi;



	public AddressBi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AddressBi(int addId, String city, int pinCode, StudentBi studentbi) {
		super();
		this.addId = addId;
		this.city = city;
		this.pinCode = pinCode;
		this.studentbi = studentbi;
	}

	@Override
	public String toString() {
		return "AddressBi [addId=" + addId + ", city=" + city + ", pinCode=" + pinCode + ", studentbi=" + studentbi
				+ "]";
	}

	public int getAddId() {
		return addId;
	}

	public void setAddId(int addId) {
		this.addId = addId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public StudentBi getStudentbi() {
		return studentbi;
	}

	public void setStudentbi(StudentBi studentbi) {
		this.studentbi = studentbi;
	}


	

}
