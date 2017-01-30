package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainClass02 {
	public static void main(String[] args) {
		
		try {
			//1. 드라이브 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		
		try {
			//2. Connection 객체를 생성한다.
			con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:XE",
				"hr","hr");
			
			//3. SQL문을 전송할 수 있는 Statement 객체를 생성한다.
			stmt = con.createStatement();
			
			//4-1. SQL문을 전송한다.
			int result = stmt.executeUpdate(
					"insert, update, delete");
			
			//4-2. select문을 경우는 ResultSet으로 결과 집합을 반환한다.
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
				//5. 모든 객체을 닫는다.
				if(con != null) con.close();
				if(stmt != null) stmt.close();
				if(rs != null) rs.close();
			} catch (SQLException e2) {
				// TODO: handle exception
			}
		}
		
		
		
		
		
		
		
		
	}
}
