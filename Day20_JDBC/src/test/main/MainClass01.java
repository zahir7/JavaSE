package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class MainClass01 {
	public static void main(String[] args) {
		try {
			//1. 드라이버 로드
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
			//1. Database 연결을 위한 객체
			//2. getConnection(url,user,password);
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE"
					,"hr","hr");
			
			//3. SQL문을 전송하기 위한 객체
			stmt = con.createStatement();
			
			//4. SQL문을 Database에게 전송한다.
			// SQL문을 전송하기 위한 메서드
			// 4.1 executeUpdate(sql) - insert , update, delete
			// 반환값 => int 
			// insert => insert한 행의 수
			// update => update한 행의 수
			// delete => delete한 행의 수
			
			// 4.2 executeQuery(sql) - select
			// 반환값 => ResultSet
			
			StringBuffer sql = new StringBuffer();
			
			sql.append("insert into board(b_num,b_writer,b_title, ");
			sql.append("b_content,b_pwd,b_hit,b_regdate) values (");
			sql.append("board_seq.NEXTVAL,'안철수','제목12','내용12',");
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
			
			//executeQuery(sql) 메서드는 select문을 전송할 때 사용되는
			//메서드이며 select의 결과가 있기 때문에 ResultSet객체로 반환
			rs = stmt.executeQuery(sql.toString());
			//rs.next() 메서드는 커서를 다음 행으로 내려주고 다음행의 결과가
			//있으면 true , 없으면 false 반환
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
