package com.vksk;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
	public class Product {
		
			@Id
			int id;
			String name;
			float cost;
			public Product() {
				super();
				
			}
			public Product(int id, String name, float cost) {
				super();
				this.id = id;
				this.name = name;
				this.cost = cost;
			}
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public float getCost() {
				return cost;
			}
			public void setCost(float cost) {
				this.cost = cost;
			}
			
			
}
