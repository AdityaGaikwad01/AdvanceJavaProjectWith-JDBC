package com.tak.product.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

import com.tak.product.config.DBConnection;
import com.tka.product.model.Product;

public class ProductDao {
	

	public String addProduct(Product product) {
		String msg = null;
		try {
			Connection conn = DBConnection.getConnection(); // alt + shift + L shortcut for variable writing;
			
			String sqlQuery = "INSERT INTO product(product_id,product_name,product_qty,product_price,mgf_date,exp_date) VALUES(?,?,?,?,?,?)";
			
			PreparedStatement pst = conn.prepareStatement(sqlQuery);
			pst.setLong(1,product.getProductID());
			pst.setString(2, product.getProductName());
			pst.setInt(3, product.getProductQuantity());
			pst.setDouble(4, product.getProductPrice());
			pst.setString(5, product.getMfgDate());
			pst.setString(6, product.getExpDate());
			
			int affectedRows = pst.executeUpdate();
			if(affectedRows > 0) {
				msg = "Added Succefully";
			}
			
			
		} catch (SQLIntegrityConstraintViolationException e) {
			// TODO: handle exception
			msg = "Data already Exist in System";
		}
		catch (SQLException e) {
			// TODO: handle exception
			msg = "Database is not connected ";
		}
		catch (Exception e) {
			// TODO: handle exception
			msg = "Something went wrong";
		}
		
		return msg;
		
	}
	public Object getProductById(long productId) {
		String msg = null;
		try {
			Connection connection = DBConnection.getConnection();
			String sqlQuery = "SELECT * FROM product WHERE product_id = ?";
			PreparedStatement pst = connection.prepareStatement(sqlQuery);
			pst.setLong(1, productId);
			
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				String productName = rs.getString("product_name");
				int productQty = rs.getInt("product_qty");
				double productPrice = rs.getDouble("product_price");
				String mfgDate = rs.getString("mgf_date");
				String expDate = rs.getString("exp_date");
				
				Product product = new Product(productId, productName, productQty, productPrice, mfgDate, expDate);
				return product;

			}
			else {
				return "Product Not Found For ID = " + productId;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			msg = "Something went wrong";
		}
		return msg;
	}
	
	public String  deleteProductById(long productId) {
		String massage = null;
		
		try {
			Connection connection = DBConnection.getConnection();
			PreparedStatement pst = connection.prepareStatement("DELETE FROM product WHERE product_id = ?");
			pst.setLong(1, productId);
			
			int affectedRows = pst.executeUpdate();
			if(affectedRows > 0) {
				massage = "Deleted succesfully";
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return massage;
		
	}
	
	
}
