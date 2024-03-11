package demo.kodnest.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class InsertRecordsUsingScanner {
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
 
        //executing the sql statement
        String sql = "insert into student values(?,?)";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Id");
        int id = scan.nextInt();
        
        scan.nextLine();
        
        System.out.println("Enter the name");
        String name = scan.nextLine();
        
        
      //creating the statement
       PreparedStatement statement = connection.prepareStatement(sql);
       statement.setInt(1, id);
       statement.setString(2, name);
        
      //int executeUpdate = statement.executeUpdate();
      //System.out.println("Success -"+executeUpdate);
	}

}
