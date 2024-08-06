package com.utility;

import java.util.Scanner;

import com.tka.product.model.Product;

public class ProductUtility {
	
	
	public static Product prepareProductData() {
		
		
		Scanner scanner = new Scanner(System.in);
		
		// product_id not taking from the user it will generate according to timestamp 
//		System.out.println("Enter ProductId");
//		long productId = scanner.nextLong();
		
		System.out.println("Enter ProductName: ");
		String productName = scanner.next();
		
		System.out.println("Enter ProductQty: ");
		int productQty = scanner.nextInt();
		
		
		System.out.println("Enter Product Price: ");
		double productPrice = scanner.nextDouble();

		System.out.println("Enter Product mfg date ");
		String mfgDate = scanner.next();
		
		System.out.println("Enter Product exp date");
		String expDate = scanner.next();
		
		Product product = new Product(productName, productQty, productPrice, mfgDate, expDate);

		
		scanner.close();
		return product;
	}
	
	public  static long prepareProductIdUser() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Product id : ");
		long productId = sc.nextLong();
		sc.close();
		return productId;
		
		
	}

}
