package test;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

/*	



SELECT ID, NAME, DESCRIPTION, USE_YN, REG_USER			-- 5 
FROM SAMPLE												-- 1
WHERE ID = 'SAMPLE-00125'								-- 2
AND NAME = '임희준'
ORDER BY												-- 6


*/


public class MainApp2 {

	public static void main(String[] args) {
		System.out.println("1111");
		
		String url = "jdbc:mysql://lenkim.ipdisk.co.kr:3306/test";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver"); 
			
			conn = (Connection) DriverManager.getConnection(url,"com","com");
			conn.setCharacterEncoding("euc-kr");
			
			StringBuffer sb = new StringBuffer();
			
			sb.append("SELECT ID, NAME, DESCRIPTION, USE_YN, REG_USER ");
			sb.append("FROM SAMPLE ");
			sb.append("WHERE ID = ?");
			
			System.out.println(sb.toString());
			
			pstmt = (PreparedStatement) conn.prepareStatement(sb.toString());
			pstmt.setString(1, "SAMPLE-00125");
			
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				String num = rs.getString("ID");
				String name = rs.getString("NAME");
				String DESCRIPTION = rs.getString("DESCRIPTION");
				String USE_YN = rs.getString("USE_YN");
				String REG_USER = rs.getString("REG_USER");
				System.out.println(num +" : " + name + ":" + DESCRIPTION);
			}
			
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally{
			try {
				if(rs != null)rs.close();
				if(pstmt != null)pstmt.close();
				if(conn != null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}