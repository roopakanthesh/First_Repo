package demo.kodnest.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertRecords {
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
        
      //creating the sql statement 
        Statement stmt = connection.createStatement();

        
        //insert records
        String s = "insert into student values(1,'jhon')"; 
		int executeUpdate = stmt.executeUpdate(s);
      //  stmt.execute(s);
       
         System.out.println("success "+executeUpdate);

      
	}

}
