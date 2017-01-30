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
			
			//트랜잭션 시작
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
					//트랜잭션이 정상 처리되었을 경우 모두 수행
					con.commit();
				}else{
					//트랜잭셩이 정상 처리 되지않았을 경우 모두 취소
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
