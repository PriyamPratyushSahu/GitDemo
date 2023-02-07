package com.selenium.part4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		
		//MySQL Server:
		String dbURL = "jdbc:mysql://localhost:3306/world";
		
		String username = "root";
		String password = "PRI@YAM@#12345";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(dbURL, username, password);
		
		Statement st = con.createStatement();
		String selectquery = "SELECT * FROM world.city where CountryCode = 'IND' and District = 'Maharashtra'";
		
		ResultSet rs = st.executeQuery(selectquery);
		
		int i = 1;
		while(rs.next())
		{
			System.out.println("Record: " + i);
			System.out.println("City Name: " + rs.getString("Name"));
			System.out.println("Country Code: " + rs.getString("CountryCode"));
			System.out.println("District Name: " + rs.getString("District"));
			System.out.println("Population: " + rs.getString("Population"));
			System.out.println("\n \n*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*# \n \n");
			i++;
		}
		con.close();
	}

}
