package com.kharoud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Result;

public class LoginDao {
	
	
	String query = "select * from login where uname=? and pass=?";
	String url ="jdbc:mysql://localhost:3306/kharoud";
	String username = "root";
	String password = "9464468230q";
	
	public boolean check( String uname, String password) throws SQLException {
		
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1, uname);
			st.setString(2, password);
			ResultSet rs = st.executeQuery();
			
			if( rs.next()) {
				return true;
			}
					
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}

}
