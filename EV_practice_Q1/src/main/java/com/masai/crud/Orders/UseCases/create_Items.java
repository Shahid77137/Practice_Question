package com.masai.crud.Orders.UseCases;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.masai.crud.Orders.DAO.OrderDAO;
import com.masai.crud.Orders.DAO.OrderDAOimpl;
import com.masai.crud.Orders.Exception.OrderNotFoundException;
import com.masai.crud.Orders.Model.Item;

public class create_Items {

	public static void main(String[] args) throws OrderNotFoundException {
		
		OrderDAO odao = new OrderDAOimpl();
		
		Item itm = new Item();
		
		List<Item> list = new ArrayList<Item>();
		
		list.add(new Item(1,"Ferrari F8 Tributo",null,Date.valueOf("2023-04-22"),new Timestamp(System.currentTimeMillis())));
		list.add(new Item(2,"Jaguar F-Type SVR",null,Date.valueOf("2023-05-22"),new Timestamp(System.currentTimeMillis())));
		list.add(new Item(3,"Ferrari 812 Competizione",null,Date.valueOf("2023-03-22"),new Timestamp(System.currentTimeMillis())));
		list.add(new Item(4,"fortuner",null,Date.valueOf("2023-04-22"),new Timestamp(System.currentTimeMillis())));
				
//		  Item itm1 = new Item();
//        itm1.setName("Ferrari F8 Tributo");
//        itm1.setEstimatedDeliveryDate(Date.valueOf("2023-01-01"));
//        itm1.setCreatedAt(LocalDateTime.now());
//
//        
//        Item itm2 = new Item();
//        itm2.setName("Vitara Brezza");
//        itm1.setEstimatedDeliveryDate(Date.valueOf("2023-01-10"));    
//        itm2.setCreatedAt(LocalDateTime.now());
//
//        list.add(itm1);
//        list.add(itm2);
        
        odao.createItems(list, 1);
        
	}
	
}
