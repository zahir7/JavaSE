package test.main;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainClass04 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con = null;
		CallableStatement cstmt = null;
		
		try {
			con = DriverManager.getConnection(
			 "jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
			
			//CallabelStatement 按眉 积己规过
			cstmt = con.prepareCall("{call adjust(?,?)}");
			cstmt.setString(1, "syh2022");
			cstmt.setFloat(2,(float)0.05);
			
			cstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
