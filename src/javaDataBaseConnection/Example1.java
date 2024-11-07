package javaDataBaseConnection;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Example1 {
    public static void main(String[] args) throws Exception {

        Initlizer.Register();
        Connection connectionWithDB = Initlizer.CreateConnectionWithDB("jdbc:mysql://localhost:3306/javacore","root","root");
        Statement stm = Initlizer.CreateStatementObject(connectionWithDB);

        ResultSet rs = stm.executeQuery("SELECT * FROM tbl_student;");
        while (rs.next())
        {
            System.out.println(rs.getString(1) + "...." + rs.getString("name"));
        }

        stm.close();
        connectionWithDB.close();
    }
}
