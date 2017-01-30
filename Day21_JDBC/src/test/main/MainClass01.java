package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MainClass01 {
	//1. static ������ static �޼��常 ȣ�Ⱑ��
	//2. main �޼��庸�� ���� ȣ���.
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
			
			//addBatch(sql) �޼���� sql���� Statement ��ü�� �߰��ؼ�
			//�ϰ�ó���ϱ� ���� ���
			stmt.addBatch("insert into salary values('t1','10')");
			stmt.addBatch("insert into salary values('t2','20')");
			stmt.addBatch("insert into salary values('t3','30')");
			stmt.addBatch("insert into salary values('t4','40')");
			stmt.addBatch("insert into salary values('t5','50')");
			stmt.addBatch("insert into salary values('t6','60')");
			
			//executeBatch() �޼���� Statement�� ����� ��� sql����
			//������ ���̽��� �ϰ������Ѵ�.
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
