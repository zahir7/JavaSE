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
			// jdbc.properties ������ �̿��ؼ� FileInputStream ��ü����
			fis = new FileInputStream("c:\\jdbc1.properties");
			// propertis ������ �����ϴ� Ŭ����
			pro = new Properties();
			// Properties ��ü�� FileInputStream ��ü�� �ε��Ѵ�.
			// �̷��Ǹ� Properties ��ü�� getProperty(key)�� ����Ͽ�
			// jdbc.properties ������ ������ key�� �̿��Ͽ� ���� ������ �� ����.
			pro.load(fis);
			String driver = pro.getProperty("driver");
			String url = pro.getProperty("url");
			String user = pro.getProperty("user");
			String pwd = pro.getProperty("password");
			
			Class.forName(driver);
			con = DriverManager.getConnection(url,user,pwd);
			System.out.println("Connection ����");
			
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
