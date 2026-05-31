package com.cts.dn.corejava.v31v32v33;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadingData {
    
    private static final String URL = "jdbc:mysql://localhost:3306/url";
    private static final String USER = "root";     
    private static final String PASSWORD = "12345678";     

    public static void main(String[] args) {
        
        try {
            // Add this line to explicitly register the MySQL Driver!
            Class.forName("com.mysql.cj.jdbc.Driver");
        	
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement stmt = conn.createStatement();
            
            System.out.println("Successfully connected to MySQL Database!");

            String query = "SELECT created_at, original_url FROM short_urls";
            
            try (ResultSet rs = stmt.executeQuery(query)) {
                while (rs.next()) {
                    String creation = rs.getString("created_at");
                    String ourl = rs.getString("original_url");
                    System.out.println("Created At : " + creation + " | Original Url : " + ourl);
                }
            }

        } catch (Exception e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }
}
