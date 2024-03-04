package demo.kodnest.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BankInsertRecords {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("JDBC");
		
		//loading the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Connection Information
		String url = "jdbc:mysql://localhost/kodnestjdbc";
		String username = "root";
		String password = "kroopa89";
		
      //insert records
      String sql1 = "update bank set balance=balance-25000 where acc_no=10";  
      String sql2 = "updat bank set balance=balance+5000 where acc_no=20";
      
      Connection connection = null;
      try {
      //Establishing Connection
      connection = DriverManager.getConnection(url, username, password);
      connection.setAutoCommit(false);
      //creating the sql statement 
      Statement stmt = connection.createStatement();
      
      stmt.addBatch(sql1);
      stmt.addBatch(sql2);
      stmt.executeBatch(); 
      connection.commit();
  
      }
      catch(Exception e) {
    	  System.out.println("Exception occured");
      connection.rollback();
      }
      
      System.out.println("success");
      
	}
}
      