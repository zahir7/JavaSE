package test.util;

import java.io.IOException;
import java.io.Reader;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class SqlMapLocator {
	 private static SqlMapClient sqlMapper;

	  static {
	    try {                                                 //ȯ�漳������ �о����~~
	      Reader reader = Resources.
	    	getResourceAsReader("test/util/SqlMapConfig.xml");
	      sqlMapper = SqlMapClientBuilder.buildSqlMapClient(reader);
	      reader.close(); 
	      System.out.println("sqlMapper ��������!");
	    } catch (IOException e) {
		     System.out.println(e.getMessage());	
		     System.out.println("sqlMapper �������� �̤�");
	    }
	  }
	  public static SqlMapClient getSqlMapper(){
		  return sqlMapper;
	  }
}



