package javaDataBaseConnection;

import java.sql.Connection;
import java.sql.Statement;

public class Example2 {

    class Student
    {
        private Long id;
        private String name;

        public Student(Long id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    public static void main(String[] args) {

        Initlizer.Register();
        Connection connectionWithDB = Initlizer.CreateConnectionWithDB("jdbc:mysql://localhost:3306/javacore","root","root");
        Statement stm = Initlizer.CreateStatementObject(connectionWithDB);



    }
}
