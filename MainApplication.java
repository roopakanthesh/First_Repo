package com.kodnest.JDBCproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MainApplication {
	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost/kodnestjdbc";
		String username = "root";
		String password = "kroopa89";
		
		//hardcoded values
		//insert the values
	   //	String sql = "insert into employee values(40,'jogi')";
		
		//create a table
	    //	String sql = "create table products(pid int,pname varchar(20))";

		//update the values
		//String sql = "update student Set name ='jithu' where id =40";
		
		//delete the values
		//String sql = "delete from student where id=40";
		
		//using prepared statement(user input)
//		String sql = "delete from student where id=?";
//		Scanner scanner = new Scanner(System.in);
		
		
//		System.out.println("enter the id of students to be deleted");
//		int id = scanner.nextInt();
		//  PreparedStatement stmt = conn.prepareStatement(sql);
		// stmt.setInt(1, id);
		// stmt.executeUpdate();
		
		//retrieve the values 
//		String sql = "select * from student where id=20 ";
//		
//	  Connection conn = DriverManager.getConnection(url,username,password);
//	  Statement stmt = conn.createStatement();
//	 / ResultSet rs =  stmt.executeQuery(sql);
//	while(rs.next()) {
//	  System.out.println(rs.getInt(1)+" - "+rs.getString(2));
//	  }
//      System.out.println("success");
	}
}
 