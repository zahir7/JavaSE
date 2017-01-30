package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MainClass01 {
	//1. static 변수와 static 메서드만 호출가능
	//2. main 메서드보다 먼저 호출됨.
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
		Statement stmt = null;
		boolean isSuccess = false;
		try {
			con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
			con.setAutoCommit(false);
			
			stmt = con.createStatement();
			
			//addBatch(sql) 메서드는 sql문을 Statement 객체에 추가해서
			//일괄처리하기 위한 기능
			stmt.addBatch("insert into salary values('t1','10')");
			stmt.addBatch("insert into salary values('t2','20')");
			stmt.addBatch("insert into salary values('t3','30')");
			stmt.addBatch("insert into salary values('t4','40')");
			stmt.addBatch("insert into salary values('t5','50')");
			stmt.addBatch("insert into salary values('t6','60')");
			
			//executeBatch() 메서드는 Statement에 저장된 모든 sql문을
			//데이터 베이스에 일괄전송한다.
			int[] updateCount = stmt.executeBatch();
			
			System.out.println("result count : "+updateCount.length);
			
			isSuccess = true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(isSuccess){
					con.commit();
				}else{
					con.rollback();
				}
			} catch (SQLException e2) {
				// TODO: handle exception
			}
		}
		
		
		
		
		
		
		
		
	}
}
