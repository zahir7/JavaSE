package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class MainClass02 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
			
			pstmt = con.prepareStatement("select * from jobs");
			
			rs = pstmt.executeQuery();
			
			//ResultSetMetaData 객체 생성
			ResultSetMetaData rsmd = rs.getMetaData();
			
			//board 테이블의 컬럼 갯수 
			int columnCnt = rsmd.getColumnCount();
			
			
			for(int i=1;i<=columnCnt;i++){
				String columnName = rsmd.getColumnName(i);
				System.out.print(columnName+"\t");
			}
			System.out.println();
			
			
			while(rs.next()){
				for(int i=1;i<=columnCnt;i++){
					String simpleName = rsmd.getColumnClassName(i);
					if(simpleName.equals("java.lang.String")){
						System.out.print(rs.getString(i)+"\t");
					}else if(simpleName.equals("java.math.BigDecimal")){
						System.out.print(rs.getInt(i)+"\t");
					}else if(simpleName.equals("java.sql.Timestamp")){
						System.out.print(rs.getString(i)+"\t");
					}
					
				}
				System.out.println();
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}
}
