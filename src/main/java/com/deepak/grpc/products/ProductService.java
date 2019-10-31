//$Id$
package com.deepak.grpc.products;

import java.sql.DriverManager;
import java.sql.ResultSet;

import org.deepak.grpc.protoFiles.Products.APIResponse;
import org.deepak.grpc.protoFiles.Products.prodId;
import org.deepak.grpc.protoFiles.Products.product;
import org.deepak.grpc.protoFiles.productsGrpc.productsImplBase;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import io.grpc.stub.StreamObserver;

public class ProductService extends productsImplBase {

	@Override
	public void getProduct(prodId request, StreamObserver<APIResponse> responseObserver) {
		Integer pid = request.getId();
		try{
			Products product = new Products();
			ResultSet rSet = getProductsById(pid);
			System.out.println("rset");
			while(rSet.next()){
				product.setId(rSet.getInt(1));
				product.setName(rSet.getString(2));
				product.setPrice(rSet.getInt(3));
				product.setStock(rSet.getInt(4));
				System.out.println(rSet.getInt(1)+"  "+rSet.getString(2)+" "+rSet.getInt(3)+"  "+rSet.getInt(4)+"  ");  
			}
			APIResponse.Builder response = APIResponse.newBuilder();
			response.setMessageCode(0).setResponseMessage(product.toString());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		APIResponse.Builder response = APIResponse.newBuilder();
		response.setMessageCode(0).setResponseMessage("Sorry");
	}

	@Override
	public void addProduct(product request, StreamObserver<APIResponse> responseObserver) {
		String name = request.getProdName();
		Integer price = request.getProdPrice();
		Integer stock = request.getProdStock();
		Products product = new Products();
		product.setName(name);
		product.setPrice(price);
		product.setStock(stock);
		try{
			PreparedStatement st = addProduct(product);
			st.executeUpdate();
			APIResponse.Builder response = APIResponse.newBuilder();
			response.setMessageCode(0).setResponseMessage("values inserted");
			System.out.println("values inserted");
		}
		catch (Exception e){
			APIResponse.Builder response = APIResponse.newBuilder();
			response.setMessageCode(0).setResponseMessage("values not inserted");
			e.printStackTrace();
		}

	}

	private PreparedStatement addProduct(Products product) {
		String sql = "INSERT INTO products(NAME, price, stock) VALUES(?,?,?)";
		PreparedStatement st = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection cons=(Connection)DriverManager.getConnection( "jdbc:mysql://localhost:3306/maven","root","root");  
			st = (PreparedStatement) cons.prepareStatement(sql);
			st.setString(1, product.getName());
			st.setInt(2, product.getPrice());
			st.setInt(3, product.getStock());
			return st;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public void deleteProduct(prodId request, StreamObserver<APIResponse> responseObserver) {
		Integer pid = request.getId();
		String sql = "delete from products where id="+pid;
		PreparedStatement stmt=null;
		try{
			//DatabaseConnection.getInstance();
			Class.forName("com.mysql.jdbc.Driver");  
			Connection cons=(Connection)DriverManager.getConnection( "jdbc:mysql://localhost:3306/maven","root","root");  
			stmt = (PreparedStatement) cons.prepareStatement(sql);
			stmt.executeUpdate();
			APIResponse.Builder response = APIResponse.newBuilder();
			response.setMessageCode(0).setResponseMessage("deleted");
		}
		catch (Exception e) {
			APIResponse.Builder response = APIResponse.newBuilder();
			response.setMessageCode(0).setResponseMessage("failed");
			e.printStackTrace();
		}
	}

	private static ResultSet getProductsById(int id){

		ResultSet rSet = null;
		try{
			String sql = "select * from products where id="+id;
			Class.forName("com.mysql.jdbc.Driver");  
			Connection cons=(Connection)DriverManager.getConnection( "jdbc:mysql://localhost:3306/maven","root","root");  
			Statement stmt=(Statement)cons.createStatement(); 
			rSet = stmt.executeQuery(sql);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return rSet;
	}
}
