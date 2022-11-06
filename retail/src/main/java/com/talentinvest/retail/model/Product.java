package com.talentinvest.retail.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product")
public class Product {

	@Id
	private int pID;
	private String pName;
	private int pPrice;
	
	public Product() {
		
	}

	public Product(int pID, String pName, int ePrice, int pPrice) {
		super();
		this.pID = pID;
		this.pName = pName;
		this.pPrice = pPrice;
	}

	
	public int getpID() {
		return pID;
	}

	public void setpID(int pID) {
		this.pID = pID;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getpPrice() {
		return pPrice;
	}

	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}

	@Override
	public String toString() {
		return "Product [pID=" + pID + ", pName=" + pName + ", pPrice=" + pPrice + "]";
	}
	
}
