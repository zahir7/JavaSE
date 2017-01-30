package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainClass02 {
	public static void main(String[] args) {
		
		try {
			//1. ����̺� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		
		try {
			//2. Connection ��ü�� �����Ѵ�.
			con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:XE",
				"hr","hr");
			
			//3. SQL���� ������ �� �ִ� Statement ��ü�� �����Ѵ�.
			stmt = con.createStatement();
			
			//4-1. SQL���� �����Ѵ�.
			int result = stmt.executeUpdate(
					"insert, update, delete");
			
			//4-2. select���� ���� ResultSet���� ��� ������ ��ȯ�Ѵ�.
			rs = stmt.executeQuery("select ");
			while(rs.next()){
				int index=0;
				String temp1 = rs.getString(++index);
				int temp2 = rs.getInt(++index);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				//5. ��� ��ü�� �ݴ´�.
				if(con != null) con.close();
				if(stmt != null) stmt.close();
				if(rs != null) rs.close();
			} catch (SQLException e2) {
				// TODO: handle exception
			}
		}
		
		
		
		
		
		
		
		
	}
}
