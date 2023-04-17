package com.masai.crud.Orders.DAO;

import java.util.Date;
import java.util.List;

import com.masai.crud.Orders.Exception.OrderNotFoundException;
import com.masai.crud.Orders.Model.Item;
import com.masai.crud.Orders.Model.Orders;


public interface OrderDAO {
	
	public void createOrder(Orders od);

	public void createItem(Item item, int orderId) throws OrderNotFoundException; //[Points: 0.5 ]**
	//- this method should create a item and associate with an order.

	public void createItems(List<Item> items, int orderId) throws OrderNotFoundException;  //[Points: 1 ]**
	//- this method should create multiple item and associate with an order.

	public void getItem(int itemId) throws OrderNotFoundException;  //[Points: 0.5 ]**
	//    - This method should get item details along with the order details
	  //  - If the Item is not present then throw Item **Not Found Exception**

	public void getOrder(int orderId) throws OrderNotFoundException; //[Points: 0.5 ]**
	    //- This method should get order details along with the details of all the items associated with that order
	    //- If the Order is not present then throw Order **Not Found Exception**

	public void getItems(Date inputDate) throws OrderNotFoundException; //[Points: 1 ]**
	    //- This method should get all item details whose delivery date is greater than inputDate.
	    //- If there are no Items Whose delivery date greater than inputDate then print “All Items are expected to be deliver on time”.
	    //- **Hint : Use JPQL**

	
}