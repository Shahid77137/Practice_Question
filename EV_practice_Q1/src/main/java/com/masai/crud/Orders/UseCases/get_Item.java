package com.masai.crud.Orders.UseCases;

import com.masai.crud.Orders.DAO.OrderDAOimpl;
import com.masai.crud.Orders.Exception.OrderNotFoundException;
import com.masai.crud.Orders.Model.Item;


public class get_Item {

	public static void main(String[] args) throws OrderNotFoundException {
		
        OrderDAOimpl odao = new OrderDAOimpl();
		
		Item itm = new Item();

		odao.getItem(1);
		System.out.println();
		
	}
	
}
