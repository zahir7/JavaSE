package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class MainClass01 {
	public static void main(String[] args) {
		try {
			//1. ����̹� �ε�
			//2. oracle.jdbc.driver.OracleDriver driver = new oracle.jdbc.driver.OracleDriver();
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			//1. Database ������ ���� ��ü
			//2. getConnection(url,user,password);
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE"
					,"hr","hr");
			
			//3. SQL���� �����ϱ� ���� ��ü
			stmt = con.createStatement();
			
			//4. SQL���� Database���� �����Ѵ�.
			// SQL���� �����ϱ� ���� �޼���
			// 4.1 executeUpdate(sql) - insert , update, delete
			// ��ȯ�� => int 
			// insert => insert�� ���� ��
			// update => update�� ���� ��
			// delete => delete�� ���� ��
			
			// 4.2 executeQuery(sql) - select
			// ��ȯ�� => ResultSet
			
			StringBuffer sql = new StringBuffer();
			
			sql.append("insert into board(b_num,b_writer,b_title, ");
			sql.append("b_content,b_pwd,b_hit,b_regdate) values (");
			sql.append("board_seq.NEXTVAL,'��ö��','����12','����12',");
			sql.append("'1111',0,sysdate)");
			int resultCnt = stmt.executeUpdate(sql.toString());
			System.out.println("result : "+resultCnt);
			
			
			/*
			sql.setLength(0);
			sql.append("update board set b_flag='Y', b_ip='192.168.0.157' ");
			sql.append("where b_num = 21");
			
			int resultCnt = stmt.executeUpdate(sql.toString());
			System.out.println("result : "+resultCnt);
			*/
			/*
			sql.setLength(0);
			sql.append("delete from board where b_num = 2l");
			int resultCnt = stmt.executeUpdate(sql.toString());
			System.out.println("result : "+resultCnt);
			*/
			
			sql.setLength(0);
			sql.append("select b_num, b_writer, b_title, ");
			sql.append("b_content, b_pwd, b_hit, b_regdate ");
			sql.append("from board ");
			sql.append("order by b_regdate desc");
			
			//executeQuery(sql) �޼���� select���� ������ �� ���Ǵ�
			//�޼����̸� select�� ����� �ֱ� ������ ResultSet��ü�� ��ȯ
			rs = stmt.executeQuery(sql.toString());
			//rs.next() �޼���� Ŀ���� ���� ������ �����ְ� �������� �����
			//������ true , ������ false ��ȯ
			while(rs.next()){
				int index = 1;
				int num = rs.getInt(index++);
				String writer = rs.getString(index++);
				String title = rs.getString(index++);
				String content = rs.getString(index++);
				String pwd = rs.getString(index++);
				int hit = rs.getInt(index++);
				String regdate = rs.getString(index++);
				System.out.printf("%d,%s,%s,%s,%s,%d,%s %n",
					num,writer,title,content,pwd,hit,regdate);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(con != null) con.close();
				if(stmt != null) stmt.close();
				if(rs != null) rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
