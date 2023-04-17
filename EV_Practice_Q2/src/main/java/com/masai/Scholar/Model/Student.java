package com.masai.Scholar.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String address;
	private double examfee;
	
	public abstract double payfee();
	
	public void DisplayDetails() {
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.address);
		System.out.println(this.examfee);
	}
	
	public Student() {};
	
	public Student(int id, String name, String address, double examfee) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.examfee = examfee;
	}
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getExamfee() {
		return examfee;
	}
	public void setExamfee(double examfee) {
		this.examfee = examfee;
	}
	
	
}
