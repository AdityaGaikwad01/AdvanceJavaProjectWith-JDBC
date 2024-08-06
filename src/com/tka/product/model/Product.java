package com.tka.product.model;

public class Product {
	
	private long productID;
	private String productName;
	private int productQuantity;
	private double productPrice;
	private String mfgDate;
	private String expDate;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product( String productName, int productQuantity, double productPrice, String mfgDate,
			String expDate) {
		super();
		
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.productPrice = productPrice;
		this.mfgDate = mfgDate;
		this.expDate = expDate;
	}

	public Product(long productID, String productName, int productQuantity, double productPrice, String mfgDate,
			String expDate) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.productPrice = productPrice;
		this.mfgDate = mfgDate;
		this.expDate = expDate;
	}

	public long getProductID() {
		return productID;
	}

	public void setProductID(long productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(String mfgDate) {
		this.mfgDate = mfgDate;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	@Override
	public String toString() {
		return "Product [productID=" + productID + ", productName=" + productName + ", productQuantity="
				+ productQuantity + ", productPrice=" + productPrice + ", mfgDate=" + mfgDate + ", expDate=" + expDate
				+ "]";
	}
	
	

}
