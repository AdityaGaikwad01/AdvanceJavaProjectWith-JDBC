package com.tak.product.controller;

import java.sql.Connection;
import java.util.Scanner;

import com.tak.product.config.DBConnection;
import com.tka.product.model.Product;
import com.tka.product.service.ProductService;
import com.utility.ProductUtility;

public class ProductContrller {

	public static void main(String[] args) {
//	
//		// It is entry point in the project 
//		// used for calling service and fetching result from the service part 
//		
//		// add product 
//		
//		
//		
////		Product product = new Product(102, "Pecil", 1000, 110, "2024-06-12", "2027-06-12");
//		ProductService productService = new ProductService();
//		
//		
//		System.out.println(msg);
//		
//		
//		
//		// delete product 
////		
////		ProductService productService2 = new ProductService();
////		String deleteupdate = productService2.deleteProductById(102);
////		System.out.println(deleteupdate);
		
////	
		ProductService productService = new ProductService();
		//Product product = ProductUtility.prepareProductData(); // Data from user from  utility 
		//String msg= productService.addProduct(product);
		
		Scanner scanner = new Scanner(System.in);
		int choice;
		boolean wantToTerminate = false;
		
		do {
			
			System.out.println("Press 1 For Add Product");
			System.out.println("Press 2 For Get Product");
			System.out.println("Press 3 For Delete Product");

			System.out.println("Press 0 for Terminate");
			choice = scanner.nextInt();

			switch (choice) {
			case 1: {
				Product product = ProductUtility.prepareProductData();

				String msg = productService.addProduct(product);
				System.out.println(msg);

				break;
			}

			case 2: {
				System.out.println("Eneter Id");
				long productId = scanner.nextLong();

				Object obj = productService.getProductById(productId);
				System.out.println(obj);
				break;
			}
			case 3:{
				System.out.println("Enter Id");
				long productId = scanner.nextLong();
				ProductService ps = new ProductService();
				String msg = ps.deleteProductById(productId);
				System.out.println(msg);
			}
			

			case 0: {
				wantToTerminate = true;
			}

			default:
				System.out.println("Invalid Choice....");
			}

		} while (wantToTerminate);

	}

}
