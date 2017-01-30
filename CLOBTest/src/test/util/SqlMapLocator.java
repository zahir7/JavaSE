package test.util;

import java.io.IOException;
import java.io.Reader;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class SqlMapLocator {
	 private static SqlMapClient sqlMapper;

	  static {
	    try {                                                 //환경설정파일 읽어오기~~
	      Reader reader = Resources.
	    	getResourceAsReader("test/util/SqlMapConfig.xml");
	      sqlMapper = SqlMapClientBuilder.buildSqlMapClient(reader);
	      reader.close(); 
	      System.out.println("sqlMapper 생성성공!");
	    } catch (IOException e) {
		     System.out.println(e.getMessage());	
		     System.out.println("sqlMapper 생성실패 ㅜㅜ");
	    }
	  }
	  public static SqlMapClient getSqlMapper(){
		  return sqlMapper;
	  }
}



