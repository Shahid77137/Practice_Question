package com.masai.crud.Orders.DAO;



import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.crud.Orders.Exception.OrderNotFoundException;
import com.masai.crud.Orders.Model.Item;
import com.masai.crud.Orders.Model.Orders;
import com.masai.crud.Orders.Utils.EMUtils;




public class OrderDAOimpl implements OrderDAO{

	@Override
	public void createOrder(Orders order) {
		// TODO Auto-generated method stub
		EntityManager em = EMUtils.getEntityManager();
		em.getTransaction().begin();
		em.persist(order);
		em.getTransaction().commit();
		em.close();
		System.out.println("Order Added Successfully");
		
	}

	@Override
	public void createItem(Item item, int orderId) throws OrderNotFoundException {
//		// TODO Auto-generated method stub
//		
		EntityManager em = EMUtils.getEntityManager();
		
		Orders od = em.find(Orders.class, orderId);
        if(od == null)
	       throw new OrderNotFoundException("No record found of this Id " + orderId);
//		Item itm = new Item();
		item.setOrder_id(od);
		
	    od.getItem().add(item);
		em.getTransaction().begin();
		
		em.merge(od);
		
		em.getTransaction().commit();
		em.close();
		
		System.out.println("Item created successfully");
//		
	}

	@Override
	public void createItems(List<Item> items, int orderId) throws OrderNotFoundException {
//		// TODO Auto-generated method stub
        EntityManager em = EMUtils.getEntityManager();
		
		Orders od = em.find(Orders.class, orderId);

		if(od == null)
			throw new OrderNotFoundException("No record found of this Id " + orderId);

		for(Item it:items) {
			it.setOrder_id(od);
		}
        
        od.getItem().addAll(items);  
        em.getTransaction().begin();

        em.merge(od);
		
		em.getTransaction().commit();
		em.close();
		
		System.out.println("Items created successfully");
	
	}

	@Override
	public void getItem(int itemId) throws OrderNotFoundException {
		// TODO Auto-generated method stub
		EntityManager em = EMUtils.getEntityManager();

//		Item itm = em.find(Item.class, itemId);
		
//		 Query query = em.createNamedQuery("Display Customer details by it's Id");
		 
		 System.out.println("Display Item details by it's Id");
		
//		 Item item = em.createNamedQuery("Display Item details by it's Id", Item.class)
//			        .setParameter("id", itemId)
//			        .getSingleResult();
		 Item item = em.find(Item.class,itemId);
		
		if(item == null) 
		throw new OrderNotFoundException("No item found by this id "+ itemId);
		
//		System.out.println("Item Name : "+item.getName());
		
//			System.out.println(item);
		    System.out.println(item.getItemId()+ " "+item.getName()+" "+item.getCreatedAt()+" "+item.getEstimatedDeliveryDate());
            
	
	}

	@Override
	public void getOrder(int orderId) throws OrderNotFoundException {
		// TODO Auto-generated method stub
		 EntityManager em = EMUtils.getEntityManager();
			
	        Orders od = em.find(Orders.class, orderId);
	        
			if(od == null) 
			throw new OrderNotFoundException("No order found by this id "+ orderId);
		
			System.out.println(od.getOrderId()+ " "+od.getTotalAmount()+" "+od.getDeliveryAddress()+" "+od.getCreatedAt());
			
	}

	@Override
	public void getItems(Date inputDate) throws OrderNotFoundException {
		// TODO Auto-generated method stub
		EntityManager em = EMUtils.getEntityManager();
		List<Item> items = em.createQuery("select i from Item i where i.estimatedDeliveryDate = '"+inputDate+"'",Item.class).getResultList();

		
		if(items.isEmpty())
			throw new OrderNotFoundException("No Item found with given EstimatedDelivary");
		items.forEach(item -> 

		System.out.println(item.getItemId()+" "+item.getName()+" "+item.getCreatedAt()+" "+item.getEstimatedDeliveryDate())
		);
	}
}