package com.tka.product.service;

import java.util.Date;
import java.text.SimpleDateFormat;

import com.tak.product.dao.ProductDao;
import com.tka.product.model.Product;

public class ProductService {
	
	// Return type is depend upon the work of methods 
	// decided from problem statement's input and output sections
	/// in Service layer Business logic is written which is not related to database 
	
	ProductDao productDao  = new ProductDao();
	
	

	public String addProduct(Product product) {
		
		// This is business logic 
		// give the id according to current timestamp 
		 String productId = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		 product.setProductID(Long.parseLong(productId));
		
		String msg = productDao.addProduct(product);
		return msg;
		
	}
	public Object getProductById(long productId) {
		Object obj = productDao.getProductById(productId);
		
		return obj;
	}
	
	public String  deleteProductById(long productId) {
		
		String deleteProductById = productDao.deleteProductById(productId);
		return deleteProductById;
		
	}
	
	public String  updateProduct(Product product) {
		return null;
	}

}
