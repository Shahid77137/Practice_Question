package com.masai.Scholar.Model;

import javax.persistence.Entity;

@Entity
public class DayScholar extends Student{

	private double transportfee;
	
	@Override
	public double payfee() {
		return this.getExamfee() + this.getTransportfee();
	}

	public double getTransportfee() {
		return transportfee;
	}

	public void setTransportfee(double transportfee) {
		this.transportfee = transportfee;
	}

	public DayScholar(double transportfee) {
		super();
		this.transportfee = transportfee;
	}
	
	public DayScholar() {};

	public DayScholar(String name, String address, double transportfee,double efee) {
		this.setName(name);
		this.setAddress(address);
		this.setTransportfee(transportfee);
		this.setExamfee(efee);
	}
	
}
