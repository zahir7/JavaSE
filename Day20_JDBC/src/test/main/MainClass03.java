package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainClass03 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
			
			StringBuffer sql = new StringBuffer();
			sql.append("select b_num, b_title ");
			sql.append("from board ");
			// ? �� ���ε� ����
			sql.append("where b_num = ?");
			
			//PreparedStatemt ��ü�� �����Ѵ�.
			//stmt = con.createStatement(); => ��
			pstmt = con.prepareStatement(sql.toString());
			
			//ù��° ���ε� ������ 2�� �����Ѵ�. 
			pstmt.setInt(1,2);
			
			// rs = stmt.executeQuery(sql.toString()); => ��
			rs = pstmt.executeQuery();
			if(rs.next()){
				int num = rs.getInt(1);
				String title = rs.getString(2);
				System.out.printf("%d, %s %n",num,title);
			}
			
			
			sql.setLength(0);
			sql.append("insert into board(b_num,b_writer,b_title, ");
			sql.append("b_content,b_pwd,b_hit,b_regdate) values (");
			sql.append("board_seq.NEXTVAL,?,?,?,?,0,sysdate)");
			
			pstmt = con.prepareStatement(sql.toString());
			int index=0;
			pstmt.setString(++index,"�ڱ���");
			pstmt.setString(++index,"����100");
			pstmt.setString(++index,"����100");
			pstmt.setString(++index,"1111");
			
			int result = pstmt.executeUpdate();
			
			System.out.println("result : "+result);
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(con != null) con.close();
				
			} catch (SQLException e2) {
				// TODO: handle exception
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
