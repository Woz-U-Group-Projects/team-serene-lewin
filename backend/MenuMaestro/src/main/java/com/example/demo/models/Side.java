package com.example.demo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection="side")
public class Side {

	@Id
	private String itemId;
	private String itemName;
	private String itemDesc;
	private int itemPrice;
	
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName (String itemName) {
		this.itemName = itemName;
	}
	public String getItemDesc() {
		return itemDesc;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice (int itemPrice) {
		this.itemPrice = itemPrice;
	}
}
