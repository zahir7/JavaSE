package test.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import test.dto.MemDTO;
import test.util.SqlMapLocator;

import com.ibatis.sqlmap.client.SqlMapClient;
/*
 * 회원의 번호 이름 주소 값을 입력,수정,삭제, 목록 보기 하기위한 객체를
 * 생성하기위한 클래스만들기.
 */
public class MemDAO {
	private SqlMapClient sqlMapper;
	//생성자
	public MemDAO(){
		//생성자에서 SqlMapClient 객체를 얻어온다.
		sqlMapper = SqlMapLocator.getSqlMapper();
	}
	//회원 한명의 정보를 DB 에 저장하는 메소드
	public boolean insert(MemDTO dto){
		//sqlMapper 객체의 insert(SQL문의 이름 , 저장할객체);
		//메소드를  호출한다.
		try {
			sqlMapper.insert("insert",dto);
			return true;//성공이라면
		} catch (SQLException e) {
			e.printStackTrace();
			return false;//실패라면
		}
	}
	//모든 회원의 정보를 리턴하는 메소드
	public ArrayList<MemDTO> getList(){
		ArrayList<MemDTO> list=null;
		try {
		/*
		 * ibatis 가 sql 문을 실행하고 SELECT 된 결과를 알아서 포장해서
		 * 리턴해준다. 	
		 */
		list=(ArrayList<MemDTO>)
				sqlMapper.queryForList("getList");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	//한명의 회원정보를 삭제하는 메소드
	public void delete(int num){
		try {
			//인자로 전달된 num 값에 해당하는 데이터를 테이블에서 삭제하기
			sqlMapper.delete("delete",num);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//회원의 주소를 수정하는 메소드
	public void update(MemDTO dto){
		try {
			//회원정보 수정하기.
			sqlMapper.update("update", dto);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}






























