package com.demo.service;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.demo.model.Product;

public class ProductService {

	Connection con;
	
	public ProductService() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/feb2019","Rosh","1234");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Product> viewAll() {
		
		ArrayList<Product> list = new ArrayList<Product>();
		
		try {
			PreparedStatement ps = con.prepareCall("select * from products");	
			ResultSet rs = ps.executeQuery();
			if(!rs.next()){
				System.out.println("No Data!");
			}
			do {
				Product p = new Product(rs.getString(2), rs.getDouble(3), rs.getNString(4));
				p.setId(rs.getInt(1));
				list.add(p);
			} while(rs.next());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	
	}
	
	public int insert(Product p) {
		try {
			PreparedStatement ps = con.prepareStatement("insert into products (name, price, seller) values (?,?,?)");
			ps.setString(1, p.getName());
			ps.setDouble(2, p.getPrice());
			ps.setString(3, p.getSeller());
			return ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

}
