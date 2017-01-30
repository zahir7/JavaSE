package test.main;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class MainClass05 {
	static{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void createStatement(){
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			//DB와 연결하는 Connection 객체 생성
			con = DriverManager.getConnection(
			 "","","");
			
			//SQL문을 관리할 수 있는 객체
			stmt = con.createStatement();
			
			
			//SQL문을 전송
			int resultCnt = 
				stmt.executeUpdate("insert ,update, delete)");
			//SQL문을 전송
			
			rs = stmt.executeQuery("select ");
			while(rs.next()){//커서 내리기
				rs.getString(1);//첫번째 컬럼 추출
				rs.getInt(2);//두번째 컬럼 추출.....
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void preparedStatement(){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection("","","");
			
			//PreparedSatement 객체 생성방법
			pstmt = con.prepareStatement(
				"insert into member values (?,?)");
			
			//바인딩 변수 세팅방법
			pstmt.setString(1, "");
			pstmt.setInt(2,0);
			
			int resultCnt = pstmt.executeUpdate();
			
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				
			}
			
			
			
			
		} catch (SQLException e) {
			// TODO: handle exception
		}
	}
	public void callableStatement(){
		Connection con = null;
		CallableStatement cstmt = null;
		try {
			con = DriverManager.getConnection("","","");
			
			//CallableStatement 객체 생성
			cstmt = con.prepareCall("{call adjust(?,?)}");
			
			cstmt.setString(1, "syh1011");
			cstmt.setFloat(2,(float)0.05);
			
			cstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO: handle exception
		}
	}
	
	public void transaction(){
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean isSuccess = false;
		try {
			con = DriverManager.getConnection("","","");
			
			//트랜잭션 시작
			con.setAutoCommit(false);
			
			pstmt = con.prepareStatement("insert ");
			pstmt.executeUpdate();
			
			pstmt = con.prepareStatement("insert ");
			pstmt.executeUpdate();
			
			pstmt = con.prepareStatement("update ");
			pstmt.executeUpdate();
			
			pstmt = con.prepareStatement("delete ");
			pstmt.executeUpdate();
			
			isSuccess = true;
			
		} catch (SQLException e) {
			
			
		
		} finally {
			try {
				if(isSuccess){
					con.commit();
				}else{
					con.rollback();
				}
				//트랜잭션이 종료가 되면 Connection 객체를 원상태 복구해야함
				con.setAutoCommit(true);
				
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
				
			} catch (SQLException e2) {
				// TODO: handle exception
			}
		}
		
	}
	public void batchQuery(){
		Connection con = null;
		Statement stmt = null;
		boolean isSuccess = false;
		try {
			con = DriverManager.getConnection("","","");
			
			con.setAutoCommit(false);
			
			stmt = con.createStatement();
			
			stmt.addBatch("insert ");
			stmt.addBatch("insert ");
			stmt.addBatch("insert ");
			
			int[] resultArray = stmt.executeBatch();
			
			isSuccess = true;
			
		} catch (SQLException e) {
			// TODO: handle exception
		} finally {
			try {
				if(isSuccess){
					con.commit();
				}else{
					con.rollback();
				}
				con.setAutoCommit(true);
				
			} catch (SQLException e2) {
				// TODO: handle exception
			}
		}
	}
	
	public void resultSetMetaData(){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ResultSetMetaData rsmd = null;
		
		try {
			con = DriverManager.getConnection("","","");
			pstmt = con.prepareStatement("select * from board");
			rs = pstmt.executeQuery();
			
			//테이블 이름, 컬럼수, 컬럼명, 컬럼타입, 컬럼크기,등등..
			rsmd = rs.getMetaData();
			
			
			int columnCount = rsmd.getColumnCount();
			
			for(int i=1;i<=columnCount;i++){
				rsmd.getColumnName(i);
			}
			
			
			
			
		} catch (SQLException e) {
			// TODO: handle exception
		}
	}
	public void scrollable(){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection("","","");
			
			//scroll 가능한 PreparedStatement 객체 생성
			pstmt = con.prepareStatement(
				"select * from board",
				ResultSet.TYPE_SCROLL_INSENSITIVE,
				ResultSet.CONCUR_UPDATABLE);
			
			//scroll 가능한 ResultSet 객체 생성
			rs = pstmt.executeQuery();
			while(rs.next()){
				
			}
			
			while(rs.previous()){
				
			}
			
			while(rs.next()){
				
			}
			
			rs.beforeFirst();
			
			while(rs.next()){
				
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
