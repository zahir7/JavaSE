package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainClass04 {
	static{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(
			"jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
			// 커서를 양방향으로 이동할 수 있는 PreparedStatement 객체생성
			pstmt = con.prepareStatement(
				"select b_num, b_writer from board",
				ResultSet.TYPE_SCROLL_INSENSITIVE,
				ResultSet.CONCUR_UPDATABLE);
			
			rs = pstmt.executeQuery();
			while(rs.next()){
				int num = rs.getInt(1);
				String writer = rs.getString(2);
				System.out.printf("%d, %s %n", num, writer);
			}
			
			//커서를 처음 이전으로 이동하는 메서드
			//JDBC1.0에서는 사용불가
			rs.beforeFirst();
			
			while(rs.next()){
				int num = rs.getInt(1);
				String writer = rs.getString(2);
				System.out.printf("%d, %s %n", num, writer);
			}
			
			
			
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
