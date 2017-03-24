package test;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import com.mysql.jdbc.Statement;

/*	

 	JDBC - JAVA DATA BASE CONECTIVITY
  	기본 API로는 안됨. 오픈소스 라이브러리 추가해야함.
  	
  	DATA BASE MANNAGEMNET SYSTEM
  		- ORACLE, MYSQL = MARIADB, MSSQL(SQL SERVER), CUBRID
  		TIBERO, MONGODB 등
  	
  	1. JDBC DRIVER 객체 메모리에 로드
  	2. DRIVER 통해 Connection 객체 생성.
  	3. Connection 객체를 통해 Statement 객체 생성
  	4. Statement 객체를 통해 SQL질의 또는 SQL문 작성.
  	5. Statement로 SQL문 실행.
  	6. ResultSet 객체로 SQL질의어 받음.
  	7. Connection close().
  	
  	CREATE TABLE `test` (
  		`num` int(11) DEFAULT NULL,
  		`name` varchar(2000) DEFAULT NULL
	) 

  	SELECT * FROM TEST;


*/


public class MainApp {
	
	static String url = "jdbc:mysql://lenkim.ipdisk.co.kr:3306/test";
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver"); // 1 diriver 로드
			
			conn = (Connection) DriverManager.getConnection(url,"com","com");	// 2. conn 생성
			stmt = (Statement) conn.createStatement();	// 3. conn -> statement 생성
			
			StringBuffer sb = new StringBuffer();
			
			sb.append("select * from test");
//			sb.append("insert into test values(");
//			sb.append("2, '임종천')");
			
//			sb.append("delete from test");

			rs = stmt.executeQuery(sb.toString());	// sql문 실행
			
//			int result = stmt.executeUpdate(sb.toString());	// sql문 실행
//			System.out.println(result);
			
			while(rs.next()){
				int num = rs.getInt(1);
				String name = rs.getString(2);
				System.out.println(num +" : " + name);
			}
			
			
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally{
			try {
				if(rs != null)rs.close();
				if(stmt != null)stmt.close();
				if(conn != null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}