package test.mypack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BoardDao {
	static{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//singleton => 객체를 하나만 생성할 수 있도록 코딩
	
	//1. BoardDao 객체를 static 변수로 선언한다.
	private static BoardDao dao;
	
	//2. default constructor의 접근 한정자를 private
	private BoardDao(){
		
	}
	
	//3. BoardDao 객체를 하나만 생성할 수 있는 getInstance() 메서드 생성
	public static BoardDao getInstance(){
		if(dao == null)
			dao = new BoardDao();
		return dao;
	}
	/*
	 insert into board(b_num,b_writer,b_title,b_content,
	 b_pwd,b_hit,b_regdate) values (board_seq.nextval,
	 '작성50','제목50','내용50','1111',0,sysdate)
	 * */
	public boolean insert(BoardVo bvo){
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean isSuccess = false;
		try{
			con = DriverManager.getConnection(
			"jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
			StringBuffer sql = new StringBuffer();
			sql.append("insert into board(b_num,b_writer,b_title,b_content, ");
			sql.append(" b_pwd,b_hit,b_regdate) values (board_seq.nextval, ");
			sql.append("?,?,?,?,0,sysdate)");
			
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1,bvo.getWriter());
			pstmt.setString(2,bvo.getTitle());
			pstmt.setString(3,bvo.getContent());
			pstmt.setString(4,bvo.getPwd());
			
			int resultCount = pstmt.executeUpdate();
			
			if(resultCount >=1)
				isSuccess = true;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
			} catch (SQLException e2) {
				// TODO: handle exception
			}
		}//end finally
		
		return isSuccess;
		
	}//end method
	/*
	 * update board
		set b_writer='작성61', b_title='제목61', 
		b_content='내용61', b_pwd='2222'
		where b_num = 46
	 * */
	public boolean update(BoardVo bvo){
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean isSuccess = false;
		try {
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
			StringBuffer sql = new StringBuffer();
			sql.append("update board ");
			sql.append("set b_writer=?, b_title=?,  ");
			sql.append("b_content=?, b_pwd=? ");
			sql.append("where b_num = ?");

			pstmt = con.prepareStatement(sql.toString());
			
			pstmt.setString(1,bvo.getWriter());
			pstmt.setString(2,bvo.getTitle());
			pstmt.setString(3,bvo.getContent());
			pstmt.setString(4,bvo.getPwd());
			pstmt.setInt(5,bvo.getNum());
			
			int resultCount = pstmt.executeUpdate();

			if (resultCount >= 1)
				isSuccess = true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e2) {
				// TODO: handle exception
			}
		}

		return isSuccess;
	}
	public boolean delete(int num){
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean isSuccess = false;
		try {
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
			StringBuffer sql = new StringBuffer();
			sql.append("delete from board where b_num = ?");
			sql.append("");
			sql.append("");

			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1,num);
			int resultCount = pstmt.executeUpdate();

			if (resultCount >= 1)
				isSuccess = true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e2) {
				// TODO: handle exception
			}
		}

		return isSuccess;
	}
	/*
	 * 	select b_num, b_writer,b_title,b_content,b_pwd
		p_hit,b_regdate
		from board
		order by b_num desc
	 * 
	 */
	public ArrayList<BoardVo> select(){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<BoardVo> list = new ArrayList<BoardVo>();
		try {
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
			StringBuffer sql = new StringBuffer();
			sql.append("select b_num, b_writer,b_title,b_content,b_pwd, ");
			sql.append("b_hit, to_char(b_regdate,'YYYY/MM/dd') ");
			sql.append("from board ");
			sql.append("order by b_num desc");

			pstmt = con.prepareStatement(sql.toString());
			
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int index = 0;
				int num = rs.getInt(++index);
				String writer = rs.getString(++index);
				String title = rs.getString(++index);
				String content = rs.getString(++index);
				String pwd = rs.getString(++index);
				int hit = rs.getInt(++index);
				String regdate = rs.getString(++index);
				
				list.add(new BoardVo(num,writer,title,content,
						pwd,hit,regdate));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e2) {
				// TODO: handle exception
			}
		}

		return list;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
