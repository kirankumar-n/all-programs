/*Steps to connect to database
1. Import the package - java.sql.*
2. Load and 2.Register the driver - Driver : (com.mysql.java.Driver) jar : mysqlConnector, Register using forName
3. Establish the connection - Connection Interface
4. Create the statement - Prepared, Statment, Collable
5. Execute the query -
6. Process the results
7. Close the connection*/

import java.sql.*;

public class BasicJDBC {

    public static void main(String args[]) throws Exception {

        String url = "jdbc:mysql://127.0.0.1:3306/leasing";
        String userName = "root";
        String password = "abc";
        String query = "select name from user where id = 13";

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url,userName,password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        resultSet.next();
        String name = resultSet.getString("name");

        System.out.println(name);

        statement.close();
        connection.close();
    }
}

//output: testuser1