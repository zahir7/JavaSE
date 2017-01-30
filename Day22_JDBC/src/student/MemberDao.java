package student;
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


INSERT INTO member VALUES('ȫ�浿',180,30,70,'��');
INSERT INTO member VALUES('�̿���',170,30,50,'��');

SELECT * FROM member;
COMMIT;
*/

import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
	
	public  MemberVo[] getAllMember()throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<MemberVo> list = new ArrayList<MemberVo>();
		try {
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
			StringBuffer sql = new StringBuffer();
			sql.append("select name , height, age, weight, sex  ");
			sql.append("from member ");
			sql.append("");

			pstmt = con.prepareStatement(sql.toString());

			rs = pstmt.executeQuery();
			while (rs.next()) {
				
				list.add(new MemberVo(rs.getString(1),rs.getInt(2),
						rs.getInt(3),rs.getInt(4),rs.getString(5)));
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

		return (MemberVo[])list.toArray(new MemberVo[list.size()]);
	}

	/* 
	1.�ߺ��� ������ �����ϴ��� isExist() �̿��Ͽ� üũ�Ѵ�.
		-�����ϸ� DuplicatedException("�����Ͱ� �����մϴ�.!!!"); ��ü�����Ѵ�.
	2.���ڰ����� �Ѱ��� ������ �ϴ� height,age,weight�� int type���� �ٲٰ�.  
	   Query  ���� �̿��Ͽ�  insert  ��Ų��. 
	*/

	public void addMember(String name ,String  height, String  age ,String weight, String sex)throws DuplicatedException{
		
		if (isExist(name)) 
			throw new DuplicatedException("�����Ͱ� �����մϴ�");

		int h = 0;
		int a = 0; 
		int w = 0; 

		

	}  //end addMember()

	/* 	
	1. �ߺ��� ������ �����ϴ���  isExist() �̿��Ͽ� üũ�Ѵ�.
	  -�������� ������  RecordNotFoundException("���ڵ尡 �������� �ʽ��ϴ�."); ��ü�����Ѵ�.
	2. name  �� ������  Query  ���� �̿��Ͽ� delete ��Ų��.
	*/	

	public void delMember(String name) throws RecordNotFoundException{
		if(!isExist(name)) throw new RecordNotFoundException("���ڵ尡 �������� �ʽ��ϴ�");
		

	} //end delMember()

  /*
    1. �ߺ��� ������ �����ϴ���  isExist() �̿��Ͽ� üũ�Ѵ�.
	  -�������� ������  RecordNotFoundException("���ڵ尡 �������� �ʽ��ϴ�."); ��ü�����Ѵ�.
    2.���ڰ����� �Ѱ��� ������ �ϴ� height,age,weight�� int type���� �ٲٰ�. 
	  name ������  Query ���� �̿��Ͽ� update ��Ų��. */

	public void updateMember(String name, String  height, String  age, String weight, String sex) 
		throws RecordNotFoundException{

			if(!isExist(name)) throw new RecordNotFoundException("�����Ͱ� �������� �ʽ��ϴ�");
	
			int h = 0;
			int a = 0; 
			int w = 0; 
			

	} //end updateMember()

	/*
	1 .���ڰ����� �Ѱܿ� name ������   Query ���� �̿��Ͽ� Search �Ѵ�.	
	- �������� ������ RecordNotFoundException("�����Ͱ� �������� �ʽ��ϴ�."); ��ü�����Ѵ�.
	2. ResultSet  ��ü�� �̿��Ͽ�  �����ͺ��̽� ������ ���� �Ŀ� �� data �� ������  Member ��ü �����Ѵ�.
	3.  mem  �� return  ��Ų��. 
	*/
	
	public MemberVo searchMember(String name) throws RecordNotFoundException,SQLException{ 
		if(!isExist(name)) throw new RecordNotFoundException("�����Ͱ� �������� �ʽ��ϴ�!!");
		return null;

	}

	public boolean isExist(String name){ //�̸��� �����ϴ���..
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		boolean result = false; 
			
			try{
				String query = "SELECT * FROM member WHERE name = ?";  
				con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
				pstmt = con.prepareStatement(query);
				pstmt.setString(1,name);

				rs = pstmt.executeQuery();
				if( rs.next()){ 
					return true;
				}else{
					return false;
				}
			}catch(SQLException sqle) {
				System.out.println("isExist" + sqle);
				return false;
			}finally{
				try{
					if(con != null)con.close();
					if(pstmt != null) pstmt.close();
					if(rs != null) rs.close();
					
					
				}catch(SQLException e){
					
				}
			}
			
	}
	
	
} // end Database class

