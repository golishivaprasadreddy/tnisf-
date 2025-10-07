package com.learning.jbdcprograms;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDataExample {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/new", "root", "1234");

            Statement stmt = con.createStatement();
            String sql = "INSERT INTO students (name, age) VALUES " +
                    "('John Doe', 22), " +
                    "('Jane Smith', 21), " +
                    "('Mike Brown', 24), " +
                    "('Alice Green', 23)";
       

            int rows = stmt.executeUpdate(sql);

            System.out.println("✅ " + rows + " row(s) inserted successfully!");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


//output
//
//✅ 4 row(s) inserted successfully!
