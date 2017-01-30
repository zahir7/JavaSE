package test.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MainClass02 {
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
		FileReader fr = null;
		BufferedReader br = null;
		boolean isSuccess = false;
		try {
			con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
			con.setAutoCommit(false);
			
			stmt = con.createStatement();
			
			fr = new FileReader("C:\\work01\\address.sql");
			br = new BufferedReader(fr);
			
			String readLine = null;
			
			while((readLine = br.readLine()) != null){
				stmt.addBatch(readLine);
				
			}
			
			int[] updateCount = stmt.executeBatch();
			
			System.out.println("result count : "+updateCount.length);
			
			isSuccess = true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
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
