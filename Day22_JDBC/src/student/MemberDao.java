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


INSERT INTO member VALUES('홍길동',180,30,70,'남');
INSERT INTO member VALUES('이영애',170,30,50,'여');

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

	/* 데이터베이스에 저장된  data 을  Member  클래스의 배열로 저장.
	1. 데이터베이스 에 저장된  data 갯수를 알아본다. ( "SELECT count(*) FROM member" )
	2. 갯수만큼  배열생성한다.
	3. ResultSet  객체를 이용하여 data 값을 얻어와서 배열에 저장시킨다.
	4. member 변수를 return  시킨다.	 */
	
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
	1.중복된 내용이 존재하는지 isExist() 이용하여 체크한다.
		-존재하면 DuplicatedException("데이터가 존재합니다.!!!"); 객체생성한다.
	2.인자값으로 넘겨진 내용을 일단 height,age,weight를 int type으로 바꾸고.  
	   Query  문을 이용하여  insert  시킨다. 
	*/

	public void addMember(String name ,String  height, String  age ,String weight, String sex)throws DuplicatedException{
		
		if (isExist(name)) 
			throw new DuplicatedException("데이터가 존재합니다");

		int h = 0;
		int a = 0; 
		int w = 0; 

		

	}  //end addMember()

	/* 	
	1. 중복된 내용이 존재하는지  isExist() 이용하여 체크한다.
	  -존재하지 않으면  RecordNotFoundException("레코드가 존재하지 않습니다."); 객체생성한다.
	2. name  을 가지고  Query  문을 이용하여 delete 시킨다.
	*/	

	public void delMember(String name) throws RecordNotFoundException{
		if(!isExist(name)) throw new RecordNotFoundException("레코드가 존재하지 않습니다");
		

	} //end delMember()

  /*
    1. 중복된 내용이 존재하는지  isExist() 이용하여 체크한다.
	  -존재하지 않으면  RecordNotFoundException("레코드가 존재하지 않습니다."); 객체생성한다.
    2.인자값으로 넘겨진 내용을 일단 height,age,weight를 int type으로 바꾸고. 
	  name 가지고  Query 문을 이용하여 update 시킨다. */

	public void updateMember(String name, String  height, String  age, String weight, String sex) 
		throws RecordNotFoundException{

			if(!isExist(name)) throw new RecordNotFoundException("데이터가 존재하지 않습니다");
	
			int h = 0;
			int a = 0; 
			int w = 0; 
			

	} //end updateMember()

	/*
	1 .인자값으로 넘겨온 name 가지고   Query 문을 이용하여 Search 한다.	
	- 존재하지 않으면 RecordNotFoundException("데이터가 존재하지 않습니다."); 객체생성한다.
	2. ResultSet  객체를 이용하여  데이터베이스 내용을 얻어온 후에 그 data 을 가지고  Member 객체 생성한다.
	3.  mem  을 return  시킨다. 
	*/
	
	public MemberVo searchMember(String name) throws RecordNotFoundException,SQLException{ 
		if(!isExist(name)) throw new RecordNotFoundException("데이터가 존재하지 않습니다!!");
		return null;

	}

	public boolean isExist(String name){ //이름이 존재하느냐..
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

