package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MainClass05 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean isSuccess = false;
		try {
			con = DriverManager.getConnection(
			"jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
			
			//Ʈ����� ����
			con.setAutoCommit(false);
			
			pstmt = con.prepareStatement(
				"insert into salary values('s4',1000)");
			pstmt.executeUpdate();
			
			pstmt = con.prepareStatement(
					"insert into salary values('s5',2000)");
			pstmt.executeUpdate();
			
			
			pstmt = con.prepareStatement(
					"insert into salary values('s6',3000");
			pstmt.executeUpdate();
				
			isSuccess = true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(isSuccess){
					//Ʈ������� ���� ó���Ǿ��� ��� ��� ����
					con.commit();
				}else{
					//Ʈ������� ���� ó�� �����ʾ��� ��� ��� ���
					con.rollback();
				}
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
			} catch (SQLException e2) {
				// TODO: handle exception
			}
			
		}

		
	}
}
