package demo.kodnest.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayRecords {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("JDBC");
		
		//loading the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Connection Information
		String url = "jdbc:mysql://localhost/kodnestjdbc";
		String username = "root";
		String password = "kroopa89";
		
		//Establishing Connection
		Connection connection = DriverManager.getConnection(url, username, password);
		System.out.println(connection+" connection success");
		
		//creating the sql statement 
		//Statement stmt = connection.createStatement();
		
		
		//display  the records
		String d = "Select * from student where id>3";
		
		//ResultSet rs = stmt.executeQuery(d);
		
		//while(rs.next()) {
		//System.out.println(rs.getInt(1)+" "+rs.getString(2));
		
		}	
	}
	
//}


	




