package com.masai.Scholar.Model;

public class Hosteller extends Student{

	@Override
	public double payfee() {
		
		return this.getExamfee() + this.getHostelfee();
	}

	private double hostelfee;

	public double getHostelfee() {
		return hostelfee;
	}

	public void setHostelfee(double hostelfee) {
		this.hostelfee = hostelfee;
	}

	public Hosteller() {};

	public Hosteller(String name, String address, double hostelfee,double efee) {
		this.setName(name);
		this.setAddress(address);
		this.setHostelfee(hostelfee);
		this.setExamfee(efee);
	}

	
	
	
}
