package test;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import com.mysql.jdbc.Statement;

/*	

 	JDBC - JAVA DATA BASE CONECTIVITY
  	�⺻ API�δ� �ȵ�. ���¼ҽ� ���̺귯�� �߰��ؾ���.
  	
  	DATA BASE MANNAGEMNET SYSTEM
  		- ORACLE, MYSQL = MARIADB, MSSQL(SQL SERVER), CUBRID
  		TIBERO, MONGODB ��
  	
  	1. JDBC DRIVER ��ü �޸𸮿� �ε�
  	2. DRIVER ���� Connection ��ü ����.
  	3. Connection ��ü�� ���� Statement ��ü ����
  	4. Statement ��ü�� ���� SQL���� �Ǵ� SQL�� �ۼ�.
  	5. Statement�� SQL�� ����.
  	6. ResultSet ��ü�� SQL���Ǿ� ����.
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
			
			Class.forName("com.mysql.jdbc.Driver"); // 1 diriver �ε�
			
			conn = (Connection) DriverManager.getConnection(url,"com","com");	// 2. conn ����
			stmt = (Statement) conn.createStatement();	// 3. conn -> statement ����
			
			StringBuffer sb = new StringBuffer();
			
			sb.append("select * from test");
//			sb.append("insert into test values(");
//			sb.append("2, '����õ')");
			
//			sb.append("delete from test");

			rs = stmt.executeQuery(sb.toString());	// sql�� ����
			
//			int result = stmt.executeUpdate(sb.toString());	// sql�� ����
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