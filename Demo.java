package demo.kodnest.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
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
     stmt.execute("create table students1(name varchar(20),age int)");
      
      System.out.println("success");
     Student s1 = new Student();
		Scanner scan = new Scanner(System.in);
		System.out.println("User enter the name");
		s1.setName(scan.nextLine());
		
		System.out.println("User enter the age");
		s1.setAge(scan.nextInt()); 
	    
		
		 //insert records
        String sql = "insert into students1 values(?,?)";
        String name = s1.getName();
        int age = s1.getAge();
        
        //creation of statement
       PreparedStatement statement = connection.prepareStatement(sql);
       statement.setString(1,name);
       statement.setInt(2,age);
       int executeUpdate = statement.executeUpdate();
         System.out.println("success "+executeUpdate);
	}

}


class Student{
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private int age;
	private String name;
}