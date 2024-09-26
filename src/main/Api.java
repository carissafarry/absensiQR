import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Api {
    public static void initializeDatabaseConnection(String host, String port, String databaseName, String userName, String password) {
        if (host == null || port == null || databaseName == null) {
            System.out.println("Host, port, and database information are required");
            return;
        }

        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection to the database
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://" + host + ":" + port + "/" + databaseName + "?sslmode=require", userName, password);

            System.out.println("Database connection established successfully");

            // Example query execution
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT version() AS version");

            while (resultSet.next()) {
                System.out.println("Database Version: " + resultSet.getString("version"));
            }

            // Close the connection
            resultSet.close();
            statement.close();
            connection.close();

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database connection failure.");
            e.printStackTrace();
        }
    }
}