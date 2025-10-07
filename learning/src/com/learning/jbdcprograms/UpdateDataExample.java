package com.learning.jbdcprograms;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UpdateDataExample {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/new", "root", "1234");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                System.out.println(id + " | " + name + " | " + age);
            }
            String sql = "UPDATE students SET age = 25 WHERE name = 'John Doe'";
            int rows = stmt.executeUpdate(sql);

            System.out.println("✅ " + rows + " row(s) updated successfully!");
            
            
            ResultSet rs1 = stmt.executeQuery("SELECT * FROM students");
            while (rs1.next()) {
                int id = rs1.getInt("id");
                String name = rs1.getString("name");
                int age = rs1.getInt("age");
                System.out.println(id + " | " + name + " | " + age);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


//output
//1 | John Doe | 23
//✅ 1 row(s) updated successfully!
//1 | John Doe | 25

