package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class MainClass03 {
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
			
			pstmt = con.prepareStatement("select * from board");
			
			rs = pstmt.executeQuery();
			
			//ResultSetMetaData 객체 생성
			ResultSetMetaData rsmd = rs.getMetaData();
			
			//board 테이블의 컬럼 갯수 
			int columnCnt = rsmd.getColumnCount();
			System.out.println("Column Count : "+columnCnt);
			
			System.out.println(
				"[Column Name]\t[Column Type]\t[Null Alowed]");
			
			
			for(int i=1;i<=columnCnt;i++){
				String columnName = rsmd.getColumnName(i);
				String columnType = rsmd.getColumnTypeName(i);
				int isNull = rsmd.isNullable(i);
				System.out.print(columnName+"\t\t"+columnType+"\t\t");
				
				if(isNull == 0)
					System.out.println("Not Null");
				else if(isNull == 1)
					System.out.println("Null");
				else
					System.out.println("Unknown");
			}
			
			
			
			
			
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}
}
