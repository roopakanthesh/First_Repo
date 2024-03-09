package demo.kodnest.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DisplayRecordById {

    public static void main(String[] args) {
        // JDBC URL, username, and password of MySQL server
        String url = "jdbc:mysql://localhost:3306/kodnestjdbc";
        String user = "root";
        String password = "kroopa89";

        // ID for which you want to retrieve the record
        int targetId = 20; // Replace with the desired ID

        // SQL query to retrieve a record by ID
        String query = "SELECT * FROM student WHERE id = ?";

        try (
            // Establishing the connection
            Connection connection = DriverManager.getConnection(url, user, password);
            
            // Creating a PreparedStatement
            PreparedStatement preparedStatement = connection.prepareStatement(query)
        ) {
            // Setting the ID parameter
            preparedStatement.setInt(1, targetId);
            
            // Executing the query and getting the result set
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                // Displaying the record
                if (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    //int age = resultSet.getInt("age");

                    System.out.println("ID: " + id + ", Name: " + name );
                } else {
                    System.out.println("No record found with ID: " + targetId);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}