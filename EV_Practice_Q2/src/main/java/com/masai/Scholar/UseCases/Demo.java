package com.masai.Scholar.UseCases;

import com.masai.Scholar.DAO.StudentDAO;
import com.masai.Scholar.DAO.StudentDAOimpl;
import com.masai.Scholar.Model.DayScholar;

public class Demo {
public static void main(String[] args) {
	StudentDAO stu = new StudentDAOimpl();
	DayScholar dayvir = stu.getDayScholar("Virat Kohli");
	dayvir.DisplayDetails();
	System.out.println(dayvir.payfee());
	System.out.println();
	DayScholar dayvinay = stu.getDayScholar("Zakir");
	dayvinay.DisplayDetails();
	
}
}
