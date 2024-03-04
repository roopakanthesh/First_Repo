package demo.kodnest.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class CreationOfTable {
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
 
     //executing the sql statement 
     Statement stmt = connection.createStatement();
    // stmt.execute("create table student(id int,name varchar(20))");
      
      System.out.println("success");
 
	}

}
