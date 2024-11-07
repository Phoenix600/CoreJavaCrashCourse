package javaDataBaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Initlizer {
    public static void Register()
    {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

        }catch (ClassNotFoundException e)
        {
            System.err.println("Error MYSQL-JDBC Class Not Found");
            System.exit(-1);
        }
    }

    public static Connection CreateConnectionWithDB(final String JDBC_CONNECTION_STRING, String username, String password)
    {
        Connection connection = null;
        try {

           connection = DriverManager.getConnection(JDBC_CONNECTION_STRING,username,password);

        }catch (Exception e)
        {
            System.err.println("ERROR: Incorrect URL or Credentials");
            System.exit(-1);
        }

        return  connection;
    }

    public static Statement CreateStatementObject(Connection con)
    {
        Statement stm = null;
        try {
             stm = con.createStatement();
        } catch (SQLException e) {
            System.err.println("ERROR: CreateConnection() Failed : " + e.getMessage());
            System.exit(-1);;
        }

        return stm;
    }
}
