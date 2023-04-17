package com.masai.Scholar.UseCases;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.Scholar.DAO.StudentDAO;
import com.masai.Scholar.DAO.StudentDAOimpl;
import com.masai.Scholar.Model.DayScholar;
import com.masai.Scholar.Model.Hosteller;
import com.masai.Scholar.Util.EMUtils;

public class InsertStudent {

	public static void main(String[] args) {

		StudentDAO dao = new StudentDAOimpl();
		
		DayScholar ds1 = new DayScholar();
		ds1.setName("Jack");
		ds1.setAddress("Mumbai");
		ds1.setTransportfee(1000.60);
		ds1.setExamfee(100.00);

		System.out.println(dao.insertingDayScholar(ds1));
		
		DayScholar ds2 = new DayScholar();
		ds2.setName("Mickel");
		ds2.setAddress("Itely");
		ds2.setTransportfee(3000.60);
		ds2.setExamfee(800.00);

		System.out.println(dao.insertingDayScholar(ds2));

		Hosteller hs = new Hosteller();
		hs.setName("Andrew");
		hs.setAddress("Bangalore");
		hs.setHostelfee(600.40);
		hs.setExamfee(100.00);
		
		System.out.println(dao.insertingHosteller(hs));
		
		Hosteller hs2 = new Hosteller();
		hs2.setName("John");
		hs2.setAddress("Morocco");
		hs2.setHostelfee(7000.40);
		hs2.setExamfee(1400.00);
		
		System.out.println(dao.insertingHosteller(hs2));
	}
	
}
