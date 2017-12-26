package com.hibernate.OneToManyUni;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table
public class SubjectsOneToManyUni {

	@Id
	@GeneratedValue
	
	int subId;	
	String subName;

	@OneToMany(cascade = CascadeType.ALL)
	// @PrimaryKeyJoinColumn
	@JoinColumn
	//@JoinTable(name = "Combined_Table")
	List<StudentsOneToManyUni> students;

	public SubjectsOneToManyUni(int subId, String subName, List<StudentsOneToManyUni> students) {
		super();
		this.subId = subId;
		this.subName = subName;
		this.students = students;
	}

	public SubjectsOneToManyUni() {
		super();
	}

	@Override
	public String toString() {
		return "SubjectsOneToManyUni [subId=" + subId + ", subName=" + subName + ", students=" + students + "]";
	}

	public int getSubId() {
		return subId;
	}

	public void setSubId(int subId) {
		this.subId = subId;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public List<StudentsOneToManyUni> getStudents() {
		return students;
	}

	public void setStudents(List<StudentsOneToManyUni> students) {
		this.students = students;
	}
	

}
