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
 * JDBC �� DB ���� �۾��� ��� DAO
 */
public class JBoardDAO {
	static JBoardDAO dao;
	static{
		try{
			//����Ŭ ����̹� �ε��ϱ�
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException ce){
			ce.printStackTrace();
		}
	}
	//DAO ��ü�� ������ �������ִ� �޼ҵ�
	public static JBoardDAO getInstance(){
		if(dao==null){
			dao=new JBoardDAO();
		}
		return dao;
	}
	//DB �� �� �Է��ϴ� �޼ҵ�
	public void insert(BoardDTO dto){
		Connection con=null;
		PreparedStatement pstmt=null;
		try{
			//Connection ��ü ������
			con=DriverManager.getConnection
		("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
			//������ SQL �� �غ��ϱ�
			String sql="INSERT INTO board VALUES" +
					"(my_seq.NEXTVAL, ?, ?, SYSDATE)";
			//PreparedStatement ��ü ������.
			pstmt=con.prepareStatement(sql);
			//�ʿ��� Į���� �� �־��ֱ�
			pstmt.setString(1, dto.getTitle());
			pstmt.setString(2, dto.getContent());
			pstmt.execute(); //SQL �� �����ϱ�.
		}catch(SQLException se){
			se.printStackTrace();
		}finally{
			try{
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
			}catch(Exception e){}
		}
		
	}//insert()
	
	//DB �� ����� �� ����� �����ϴ� �޼ҵ�
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
			//Query �� �����ϰ� ��� ���� ResultSet ��ü�� ��ƿ���.
			rs=stmt.executeQuery(sql);
			//�ݺ��� ���鼭 ResultSet �� ��� �ֿ��� �о�´�.
			while(rs.next()){
				int num=rs.getInt("num");
				String title=rs.getString("title");
				//Clob ������ ������ �о����.
				Clob clobContent=rs.getClob("content");
				String regdate=rs.getString("regdate");
				//Clob �� String ���� ��ȯ�ϱ�
				String content=convertClobToString(clobContent);
				//DTO ��ü �����ϱ�
				BoardDTO dto=
						new BoardDTO(num, title, content, regdate);
				//�� �ϳ��� ������ ��� �ִ� DTO ��ü�� �迭�� ���
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
	
	//Clob �����͸� String ���·� ��ȯ�ؼ� �����ϴ� �޼ҵ�
	public String convertClobToString(Clob clobContent){
		String stringContent=null;
		try{
			//�о���� ��Ʈ�� ��ü ������
			Reader reader=clobContent.getCharacterStream();
			
			//�о���� char[] ��ü �����ϱ�.(�ѹ��� 1024���� ����)
			char[] charBuffer=new char[1024];
			//�о���� ���ڸ� ������ ��ü
			StringBuffer sBuff=new StringBuffer();
			while(true){
				//charBuffer ��ü �����ϸ鼭 �о����.
				int n=reader.read(charBuffer);
				if(n == -1)break; //���̻� �о�� �����Ͱ� ���ٸ� break
				//�о�¸�ŭ�� �����͸� String ������ �����.
				String str=new String(charBuffer ,0 ,n);
				//������� String ��ü�� StringBuffer ��ü�� ���
				sBuff.append(str);
			}
			//StringBuffer ��ü�� ����� ���ڿ� �о����.
			stringContent=sBuff.toString();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return stringContent;
	}
	
}












