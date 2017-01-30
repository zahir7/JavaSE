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


INSERT INTO member VALUES('홍길동',180,30,70,'남자');
INSERT INTO member VALUES('이영애',170,30,50,'여자');

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
	/* 데이터베이스에 저장된  data 을  Member  클래스의 배열로 저장.
	1. 데이터베이스 에 저장된  data 갯수를 알아본다. ( "SELECT count(*) FROM member" )
	2. 갯수만큼  배열생성한다.
	3. ResultSet  객체를 이용하여 data 값을 얻어와서 배열에 저장시킨다.
	4. member 변수를 return  시킨다.	 */
	
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

	/* 1.	중복된 내용이 존재하는지 isExist() 이용하여 체크한다.
		-존재하면 DuplicatedException("데이터가 존재합니다.!!!"); 객체생성한다.
		2.  인자값으로 넘겨진 내용을 가지고  Query  문을 이용하여  insert  시킨다. */

	public void addMember(MemberVo mvo)throws DuplicatedException{
		
		if (isExist(mvo.getName()) )
			throw new DuplicatedException("데이터가 존재합니다");

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

	/* 	1. 중복된 내용이 존재하는지  isExist() 이용하여 체크한다.
		-존재하지 않으면  RecordNotFoundException("레코드가 존재하지 않습니다."); 객체생성한다.
		2. name  을 가지고  Query  문을 이용하여 delete 시킨다.	*/	

	public void delMember(String name) throws RecordNotFoundException{
		Connection con = null;
		PreparedStatement pstmt = null;
		
		if( ! isExist(name)) throw new RecordNotFoundException("레코드가 존재하지 않습니다");
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

  /* 인자값으로 넘겨받은 내용을 가지고  Query 문을 이용하여 update 시킨다. */

	public void updateMember(MemberVo mvo)
			throws RecordNotFoundException{
		Connection con = null;
		PreparedStatement pstmt = null;
		if(!isExist(mvo.getName())) throw new RecordNotFoundException("데이터가 존재하지 않습니다");
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
	1 .인자값으로 넘겨온 name 가지고   Query 문을 이용하여 Search 한다.	
	- 존재하지 않으면 RecordNotFoundException("레코드가 존재하지 않습니다."); 객체생성한다.
	2. ResultSet  객체를 이용하여  데이터베이스 내용을 얻어온 후에 그 data 을 가지고  Member 객체 생성한다.
	3.  mem  을 return  시킨다. */
	
	public MemberVo searchMember(String name) 
			throws RecordNotFoundException,SQLException{ 
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemberVo mem = null;
		if(!isExist(name)) throw new RecordNotFoundException("데이터가 존재하지 않습니다!!");
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

	public boolean isExist(String name){ //이름이 존재하느냐..
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

