package com.masai.crud.Orders.UseCases;

import java.sql.Date;
import java.sql.Timestamp;


import javax.persistence.EntityManager;

import com.masai.crud.Orders.DAO.OrderDAOimpl;
import com.masai.crud.Orders.Exception.OrderNotFoundException;
import com.masai.crud.Orders.Model.Item;
import com.masai.crud.Orders.Utils.EMUtils;

public class CreateItem {

	public static void main(String[] args) throws OrderNotFoundException {
		
		EntityManager em = EMUtils.getEntityManager();
		
		Item item = new Item();
		
		item.setCreatedAt(new Timestamp(System.currentTimeMillis()));
	    item.setEstimatedDeliveryDate(Date.valueOf("2023-05-20"));
	    item.setName("Jaguar F-Pace");
	    
	    
	    OrderDAOimpl oddao = new OrderDAOimpl();
	    
	    oddao.createItem(item, 1);
	    
		
	}
	
}
