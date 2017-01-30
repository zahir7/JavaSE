package test.server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ZipcodeDao {
	static{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String select(String dong){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String msg = "";
		
		try {
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
			StringBuffer sql = new StringBuffer();
			sql.append("select seq_num,zipcode,area1,area2,area3,area4 ");
			sql.append("from zipcode ");
			sql.append("where area3 like ?");
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1, dong+"%");
			
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				int index = 1;
				String zipcode = rs.getString(++index);
				String area1 = rs.getString(++index);
				String area2 = rs.getString(++index);
				String area3 = rs.getString(++index);
				String area4 = rs.getString(++index);
				if(area4==null) area4="";
				msg += "   "+zipcode +"      "+area1+"      "+
						area2+"      "+ area3+"      "+area4+
					System.getProperty("line.separator");
			}
			if(msg.length()==0)
				msg ="검색된 결과가 없습니다.";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return msg;
	}
	
	public String selectList(String dong){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String msg = "";

		
		try {
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
			StringBuffer sql = new StringBuffer();
			sql.append("select seq_num,zipcode,area1,area2,area3,area4 ");
			sql.append("from zipcode ");
			sql.append("where area3 like ?");
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1, dong+"%");
			
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				int index = 1;
				String zipcode = rs.getString(++index);
				String area1 = rs.getString(++index);
				String area2 = rs.getString(++index);
				String area3 = rs.getString(++index);
				String area4 = rs.getString(++index);
				if(area4==null) area4="";
				msg += "   "+zipcode +"      "+area1+"      "+
						area2+"      "+ area3+"      "+area4+
						System.getProperty("line.separator");
				
			}
			if(msg.length()==0){
				msg ="검색된 결과가 없습니다.";
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return msg;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
