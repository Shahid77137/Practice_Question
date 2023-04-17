package com.masai.crud.Orders.Model;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;

import com.masai.crud.Orders.Utils.EMUtils;

public class Demo1 {

	public static void main(String[] args) {
		
		EntityManager em = EMUtils.getEntityManager();
		
		Orders od = new Orders();
		od.setTotalAmount(10000);
        od.setDeliveryAddress("Krishnanagar");
        od.setCreatedAt(LocalDateTime.now());
		
        
        Item itm1 = new Item();
        itm1.setName("Ferrari Roma");
        itm1.setEstimatedDeliveryDate(null);
        itm1.setCreatedAt(LocalDateTime.now());
        itm1.setOrder_id(od);
        
        Item itm2 = new Item();
        itm2.setName("Ferrari 812 GTS");
        itm2.setEstimatedDeliveryDate(null);
        itm2.setCreatedAt(LocalDateTime.now());
        itm2.setOrder_id(od);
        
        List<Item> list = new ArrayList<Item>();
        list.add(itm1);
        list.add(itm2);
        
        od.setItem(list);
        
        em.getTransaction().begin();
        
        em.persist(od);
        
        em.getTransaction().commit();
        em.close();
        
	}
	
}
