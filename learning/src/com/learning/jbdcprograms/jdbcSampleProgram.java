package com.learning.jbdcprograms;
import java.sql.Connection;
import java.sql.DriverManager;

public class jdbcSampleProgram {
    public static void main(String[] args) {
        try {
            System.out.println("Working fine!");
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/new", "root", "1234");
            System.out.println("✅ Connected Successfully!");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//output
//✅ Connected Successfully!