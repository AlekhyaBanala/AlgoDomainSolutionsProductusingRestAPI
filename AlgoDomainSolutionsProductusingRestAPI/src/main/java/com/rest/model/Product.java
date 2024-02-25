package com.rest.model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	private String productName;
	private String productType;
	private String productCategory;
	private double productPrice;
	private double discount;
	private double finalPrice;
	@Embedded
	private Charges charges;
	public Product() {
		super();
	}
	public Product(int productId, String productName, String productType, String productCategory, double productPrice,
			double discount, double finalPrice, Charges charges) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productType = productType;
		this.productCategory = productCategory;
		this.productPrice = productPrice;
		this.discount = discount;
		this.finalPrice = finalPrice;
		this.charges = charges;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getFinalPrice() {
		return finalPrice;
	}
	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}
	public Charges getCharges() {
		return charges;
	}
	public void setCharges(Charges charges) {
		this.charges = charges;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productType=" + productType
				+ ", productCategory=" + productCategory + ", productPrice=" + productPrice + ", discount=" + discount
				+ ", finalPrice=" + finalPrice + ", charges=" + charges + "]";
	}
	
	
	
	

}
