package com.masai.crud.Orders.UseCases;

import java.sql.Date;

import com.masai.crud.Orders.DAO.OrderDAO;
import com.masai.crud.Orders.DAO.OrderDAOimpl;
import com.masai.crud.Orders.Exception.OrderNotFoundException;


public class get_Items {
public static void main(String[] args) throws OrderNotFoundException {
	OrderDAO dao = new OrderDAOimpl();
	dao.getItems(Date.valueOf("2023-04-22"));
	
	
	
}
}


