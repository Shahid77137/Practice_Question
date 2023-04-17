package com.masai.crud.Orders.UseCases;

import com.masai.crud.Orders.DAO.OrderDAOimpl;
import com.masai.crud.Orders.Exception.OrderNotFoundException;
import com.masai.crud.Orders.Model.Item;
import com.masai.crud.Orders.Model.Orders;

public class get_Order {
public static void main(String[] args) throws OrderNotFoundException {
		
        OrderDAOimpl odao = new OrderDAOimpl();
		
		Orders itm = new Orders();

		odao.getOrder(1);
		
	}
}
