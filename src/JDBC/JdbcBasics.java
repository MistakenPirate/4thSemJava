package JDBC;

import java.sql.*;

//Java Database Connectivity Theory
/*
1. Import --> java.sql
2. Load and Register the driver -->   com.mysql.jdbc.Driver
3. Create connection --> Connection interface
4. Create a statement --> Statement interface
5. Execute the query -->
6. Process the results -->
7. Close
 */

public class JdbcBasics {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/mydatabase";
        String uname = "postgres";
        String pass = "";

        try {
            // Load and register the PostgreSQL driver
            Class.forName("org.postgresql.Driver");

            //Class.forName("com.mysql.jdbc.Driver");

            // Establish a connection to the PostgreSQL database
            Connection connection = DriverManager.getConnection(url, uname, pass);
            System.out.println("Connected to the PostgreSQL database successfully.");

            // Close the connection
            connection.close();

        } catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Failed to connect to the PostgreSQL database.");
            e.printStackTrace();
        }
    }
}
