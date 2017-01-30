package test.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MainClass01 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		Properties pro = null;
		Connection con = null;
		
		try {
			// jdbc.properties 파일을 이용해서 FileInputStream 객체생성
			fis = new FileInputStream("c:\\jdbc1.properties");
			// propertis 파일을 관리하는 클래스
			pro = new Properties();
			// Properties 객체에 FileInputStream 객체를 로드한다.
			// 이렇되면 Properties 객체의 getProperty(key)를 사용하여
			// jdbc.properties 파일의 내용을 key를 이용하여 쉽게 가져올 수 있음.
			pro.load(fis);
			String driver = pro.getProperty("driver");
			String url = pro.getProperty("url");
			String user = pro.getProperty("user");
			String pwd = pro.getProperty("password");
			
			Class.forName(driver);
			con = DriverManager.getConnection(url,user,pwd);
			System.out.println("Connection 성공");
			
			System.out.println(pro.getProperty("board.select"));
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
