package com.tnsif.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnectionTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//load driver
		Class.forName("org.postgresql.Driver");
		System.out.println("Driver loaded");
		//Establish connection
		Connection con = DriverManager.getConnection(
				"jdbc:postgresql://localhost:5432/JavaApplication",
				"postgres",
				"root");
		System.out.println("Connection Established");
		//create a statement
		Statement st = con.createStatement();
		//int i = st.executeUpdate("insert into student values(102,'nick')");
		//System.out.println(i+" record updated successfully");
		ResultSet rs = st.executeQuery("select * from students");
		while(rs.next())
		{
			System.out.println("id = "+rs.getInt(1)+" sname= "+rs.getString(2));
		}
		st.close();
		con.close();
		
	}

	

}
