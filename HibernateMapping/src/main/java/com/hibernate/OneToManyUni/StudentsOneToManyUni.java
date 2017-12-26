package com.hibernate.OneToManyUni;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@SuppressWarnings("unused")
@Entity
public class StudentsOneToManyUni {
	@Id
	@Column(name="Student_ID")
	int sId;
	
	@Column(name="Student_Name")
	String sName;

	public StudentsOneToManyUni(int sId, String sName) {
		super();
		this.sId = sId;
		this.sName = sName;
	}

	public StudentsOneToManyUni() {
		super();
	}

	@Override
	public String toString() {
		return "Students [sId=" + sId + ", sName=" + sName + "]";
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

}
