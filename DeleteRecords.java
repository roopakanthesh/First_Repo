package demo.kodnest.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRecords {
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
      Statement stmt = connection.createStatement();
 
     
      //delete the records
      String a = "delete from bank where acc_no=1";
     // boolean execute = stmt.execute(a);
     // System.out.println("success "+execute);
      
	}

}

