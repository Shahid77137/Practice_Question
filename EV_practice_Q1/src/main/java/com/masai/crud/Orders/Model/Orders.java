package com.masai.crud.Orders.Model;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Orders {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int orderId;
		private String deliveryAddress;
        private double totalAmount;
        private Timestamp createdAt;   //(Current Timestamp)
        
        @OneToMany(mappedBy = "order_id",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
        private List<Item> item = new ArrayList<>();

        public Orders() {};
        
		public Orders(int orderId, String deliveryAddress, int totalAmount, Timestamp createdAt, List<Item> item) {
			super();
			this.orderId = orderId;
			this.deliveryAddress = deliveryAddress;
			this.totalAmount = totalAmount;
			this.createdAt = createdAt;
			this.item = item;
		}

		public int getOrderId() {
			return orderId;
		}

		public void setOrderId(int orderId) {
			this.orderId = orderId;
		}

		public String getDeliveryAddress() {
			return deliveryAddress;
		}

		public void setDeliveryAddress(String deliveryAddress) {
			this.deliveryAddress = deliveryAddress;
		}

		
		public double getTotalAmount() {
			return totalAmount;
		}

		public void setTotalAmount(double totalAmount) {
			this.totalAmount = totalAmount;
		}

		public Timestamp getCreatedAt() {
			return createdAt;
		}

		public void setCreatedAt(Timestamp timestamp) {
			this.createdAt = timestamp;
		}

		public List<Item> getItem() {
			return item;
		}

		public void setItem(List<Item> item) {
			this.item = item;
		}



		
		
		
   
}

	

