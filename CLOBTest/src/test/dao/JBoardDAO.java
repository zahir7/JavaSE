package test.dao;

import java.io.Reader;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import test.dto.BoardDTO;

/*
 * JDBC 로 DB 관련 작업을 사는 DAO
 */
public class JBoardDAO {
	static JBoardDAO dao;
	static{
		try{
			//오라클 드라이버 로딩하기
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException ce){
			ce.printStackTrace();
		}
	}
	//DAO 객체의 참조값 리턴해주는 메소드
	public static JBoardDAO getInstance(){
		if(dao==null){
			dao=new JBoardDAO();
		}
		return dao;
	}
	//DB 에 글 입력하는 메소드
	public void insert(BoardDTO dto){
		Connection con=null;
		PreparedStatement pstmt=null;
		try{
			//Connection 객체 얻어오기
			con=DriverManager.getConnection
		("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
			//실행할 SQL 문 준비하기
			String sql="INSERT INTO board VALUES" +
					"(my_seq.NEXTVAL, ?, ?, SYSDATE)";
			//PreparedStatement 객체 얻어오기.
			pstmt=con.prepareStatement(sql);
			//필요한 칼럼에 값 넣어주기
			pstmt.setString(1, dto.getTitle());
			pstmt.setString(2, dto.getContent());
			pstmt.execute(); //SQL 문 실행하기.
		}catch(SQLException se){
			se.printStackTrace();
		}finally{
			try{
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
			}catch(Exception e){}
		}
		
	}//insert()
	
	//DB 에 저장된 글 목록을 리턴하는 메소드
	public ArrayList<BoardDTO> getList(){
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		ArrayList<BoardDTO> list=new ArrayList<BoardDTO>();
		try{
			con=DriverManager.getConnection
		("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
			String sql="SELECT * FROM board";
			stmt=con.createStatement();
			//Query 문 실행하고 결과 값을 ResultSet 객체에 담아오기.
			rs=stmt.executeQuery(sql);
			//반복문 돌면서 ResultSet 에 담긴 애용을 읽어온다.
			while(rs.next()){
				int num=rs.getInt("num");
				String title=rs.getString("title");
				//Clob 형태의 데이터 읽어오기.
				Clob clobContent=rs.getClob("content");
				String regdate=rs.getString("regdate");
				//Clob 을 String 으로 변환하기
				String content=convertClobToString(clobContent);
				//DTO 객체 생성하기
				BoardDTO dto=
						new BoardDTO(num, title, content, regdate);
				//글 하나의 정보를 담고 있는 DTO 객체를 배열에 담기
				list.add(dto);
			}
			
		}catch(SQLException se){
			se.printStackTrace();
		}finally{
			try{
				if(rs!=null)rs.close();
				if(stmt!=null)stmt.close();
				if(con!=null)con.close();
			}catch(Exception e){}
		}
		return list;
	}//insert()
	
	//Clob 데이터를 String 형태로 변환해서 리턴하는 메소드
	public String convertClobToString(Clob clobContent){
		String stringContent=null;
		try{
			//읽어들일 스트림 객체 얻어오기
			Reader reader=clobContent.getCharacterStream();
			
			//읽어들일 char[] 객체 생성하기.(한번에 1024개의 글자)
			char[] charBuffer=new char[1024];
			//읽어들은 글자를 저장할 객체
			StringBuffer sBuff=new StringBuffer();
			while(true){
				//charBuffer 객체 전달하면서 읽어오기.
				int n=reader.read(charBuffer);
				if(n == -1)break; //더이상 읽어올 데이터가 없다면 break
				//읽어온만큼의 데이터를 String 형으로 만든다.
				String str=new String(charBuffer ,0 ,n);
				//만들어진 String 객체를 StringBuffer 객체에 담기
				sBuff.append(str);
			}
			//StringBuffer 객체에 저장된 문자열 읽어오기.
			stringContent=sBuff.toString();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return stringContent;
	}
	
}












