package com.masai.crud.Orders.Model;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
//import java.util.Date;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "Display Item details by it's Id",
query = "SELECT c FROM Item c WHERE c.itemId = :id")
public class Item {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int itemId;
	private String name;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "order_id")
	private Orders order_id;  //(Foreign Key)
	
	private Date estimatedDeliveryDate;  //(Date)
	private Timestamp createdAt;   //(Current Timestamp)
	public Item() {
		super();
	}
	public Item(int itemId, String name, Orders order_id, Date estimatedDeliveryDate, Timestamp createdAt) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.order_id = order_id;
		this.estimatedDeliveryDate = estimatedDeliveryDate;
		this.createdAt = createdAt;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Orders getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Orders order_id) {
		this.order_id = order_id;
	}
	public Date getEstimatedDeliveryDate() {
		return estimatedDeliveryDate;
	}
	public void setEstimatedDeliveryDate(Date estimatedDeliveryDate) {
		this.estimatedDeliveryDate = estimatedDeliveryDate;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	
	
	
}
