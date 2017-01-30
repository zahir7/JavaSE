/*

DROP TABLE member;

CREATE TABLE member (
  name   varchar(10) CONSTRAINT member_name_pk PRIMARY KEY,
  height number(5),
  age    number(5),
  weight number(5),
  sex    varchar(5));

  CREATE TABLE member (
  name   varchar(10) PRIMARY KEY,
  height int,
  age    int,
  weight int,
  sex    varchar(5));


INSERT INTO member VALUES('ȫ�浿',180,30,70,'����');
INSERT INTO member VALUES('�̿���',170,30,50,'����');

SELECT * FROM member;
COMMIT;
*/
package teacher;
import java.sql.*;
import java.util.ArrayList;
public class MemberDao{
	static{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static MemberDao dao;
	
	private MemberDao(){
	} //end Database Constructor
	
	public static MemberDao getInstance(){
		if(dao == null)
			dao = new MemberDao();
		return dao;
	}
	/* �����ͺ��̽��� �����  data ��  Member  Ŭ������ �迭�� ����.
	1. �����ͺ��̽� �� �����  data ������ �˾ƺ���. ( "SELECT count(*) FROM member" )
	2. ������ŭ  �迭�����Ѵ�.
	3. ResultSet  ��ü�� �̿��Ͽ� data ���� ���ͼ� �迭�� �����Ų��.
	4. member ������ return  ��Ų��.	 */
	
	public  MemberVo [] getAllMember()throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<MemberVo> list = new ArrayList<MemberVo>();
		try {
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
			StringBuffer sql = new StringBuffer();
			sql.append("select name , height, age, weight, sex  ");
			sql.append("from member order by name asc");
			pstmt = con.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				list.add(new MemberVo(rs.getString(1),rs.getInt(2),
						rs.getInt(3),rs.getInt(4),rs.getString(5)));
			}
				
		}catch(SQLException e){
			
		}finally{
			try{
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
				if(rs != null) rs.close();
			}catch(SQLException e){}
		}
		return (MemberVo[])list.toArray(new MemberVo[list.size()]);
	}

	/* 1.	�ߺ��� ������ �����ϴ��� isExist() �̿��Ͽ� üũ�Ѵ�.
		-�����ϸ� DuplicatedException("�����Ͱ� �����մϴ�.!!!"); ��ü�����Ѵ�.
		2.  ���ڰ����� �Ѱ��� ������ ������  Query  ���� �̿��Ͽ�  insert  ��Ų��. */

	public void addMember(MemberVo mvo)throws DuplicatedException{
		
		if (isExist(mvo.getName()) )
			throw new DuplicatedException("�����Ͱ� �����մϴ�");

		Connection con = null;
		PreparedStatement pstmt = null;
		
		try{
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO member VALUES(?,?,?,?,?)");
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
			int index = 0;
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(++index,mvo.getName());
			pstmt.setInt(++index,mvo.getHeight());
			pstmt.setInt(++index,mvo.getAge());
			pstmt.setInt(++index,mvo.getWeight());
			pstmt.setString(++index,mvo.getSex());
			pstmt.executeUpdate();
		}catch(SQLException sqle){
			sqle.printStackTrace();
		}finally{
			try{
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
			}catch(SQLException e){}
		}

	}  //end addMember()

	/* 	1. �ߺ��� ������ �����ϴ���  isExist() �̿��Ͽ� üũ�Ѵ�.
		-�������� ������  RecordNotFoundException("���ڵ尡 �������� �ʽ��ϴ�."); ��ü�����Ѵ�.
		2. name  �� ������  Query  ���� �̿��Ͽ� delete ��Ų��.	*/	

	public void delMember(String name) throws RecordNotFoundException{
		Connection con = null;
		PreparedStatement pstmt = null;
		
		if( ! isExist(name)) throw new RecordNotFoundException("���ڵ尡 �������� �ʽ��ϴ�");
		try{
			StringBuffer sql = new StringBuffer();
			sql.append("DELETE FROM member WHERE name=?");
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
			
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1,name);
			pstmt.executeUpdate();
		}catch(SQLException sqle){
			System.out.println("DELETE" + sqle);
		}finally{
			try{
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
			}catch(SQLException e){}
		}

	} //end delMember()

  /* ���ڰ����� �Ѱܹ��� ������ ������  Query ���� �̿��Ͽ� update ��Ų��. */

	public void updateMember(MemberVo mvo)
			throws RecordNotFoundException{
		Connection con = null;
		PreparedStatement pstmt = null;
		if(!isExist(mvo.getName())) throw new RecordNotFoundException("�����Ͱ� �������� �ʽ��ϴ�");
		try{
			StringBuffer sql = new StringBuffer();
			sql.append("UPDATE member SET age=? , height=? , weight=? , sex=? WHERE name=?");
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
			pstmt = con.prepareStatement(sql.toString());
			int index=0;
			pstmt.setInt(++index,mvo.getAge());
			pstmt.setInt(++index,mvo.getHeight());
			pstmt.setInt(++index,mvo.getWeight());
			pstmt.setString(++index,mvo.getSex());
			pstmt.setString(++index,mvo.getName());
			pstmt.executeUpdate();
		}catch(SQLException sqle){
			System.out.println("UPDATE" + sqle);
		}finally{
			try{
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
				
			}catch(SQLException e){}
		}

	} //end updateMember()

	/*
	1 .���ڰ����� �Ѱܿ� name ������   Query ���� �̿��Ͽ� Search �Ѵ�.	
	- �������� ������ RecordNotFoundException("���ڵ尡 �������� �ʽ��ϴ�."); ��ü�����Ѵ�.
	2. ResultSet  ��ü�� �̿��Ͽ�  �����ͺ��̽� ������ ���� �Ŀ� �� data �� ������  Member ��ü �����Ѵ�.
	3.  mem  �� return  ��Ų��. */
	
	public MemberVo searchMember(String name) 
			throws RecordNotFoundException,SQLException{ 
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemberVo mem = null;
		if(!isExist(name)) throw new RecordNotFoundException("�����Ͱ� �������� �ʽ��ϴ�!!");
		try{
			
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT * FROM member WHERE name like ?");
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1,name+"%");
			rs = pstmt.executeQuery();
			if(rs.next()){
				int index=0;
				String nm = rs.getString(++index);
				int height = rs.getInt(++index);
				int age = rs.getInt(++index);
				int weight = rs.getInt(++index);
				String sex = rs.getString(++index);
				mem = new MemberVo(nm, height, age, weight, sex);
			
			}
		}catch(SQLException sqle){
			System.out.println("Search" + sqle);
		}finally{
			try{
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
				if(rs != null) rs.close();
			}catch(SQLException e){}
		}
		return mem;

	}

	public boolean isExist(String name){ //�̸��� �����ϴ���..
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		boolean result = false; 		
		try{
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT * FROM member WHERE name like ?");
			
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
			
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1,name+"%");

			rs = pstmt.executeQuery();
			if( rs.next()){ 
					result = true;
			}
		}catch(SQLException sqle){
			System.out.println("isExist" + sqle);
			
		}finally{
			try{
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
				if(rs != null) rs.close();
			}catch(SQLException e){}
		}
		return result;
			
	}
	
} // end Database class

