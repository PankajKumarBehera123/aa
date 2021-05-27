package com.urbanladder.dto;

public class ProductDto {
	protected String productName;
	protected String description;
	protected double price;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductDto [productName=" + productName + ", description=" + description + ", price=" + price + "]";
	}

}
