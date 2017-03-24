package test.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import test.dto.MemDTO;
import test.util.SqlMapLocator;

import com.ibatis.sqlmap.client.SqlMapClient;

public class MemDAO {

	SqlMapClient sqlMapper;

	// 생성자
	public MemDAO() {

		sqlMapper = SqlMapLocator.getSqlMapper();
	}
	
	// 모든 회원의 정보를 얻어오는 메소드
	public ArrayList<MemDTO> getList(){
		
		ArrayList<MemDTO> list = null;
		
		try {
			
			list = (ArrayList<MemDTO>)sqlMapper.queryForList("mem_getList");
			
		} catch (SQLException e) {

			e.printStackTrace();
		}

		
		return list;
	}
	
	// 모든 회원의 정보를 얻어오는 메소드
	public ArrayList<HashMap> getList2(){
		
		ArrayList<HashMap> list = null;
		
		try {
			list = (ArrayList<HashMap>)sqlMapper.queryForList("mem_getList2");
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return list;
	}
	
	// 파라미터로 넘어오는 번호의 회원 한명의 정보를 얻어오는 메소드
	public MemDTO getData(int num){
				
		MemDTO dto = null;
		try {
			dto = (MemDTO)sqlMapper.queryForObject("mem_getData", num);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return dto;
	}
	
	// 파라미터로 넘어오는 번호의 회원 한명의 정보를 얻어오는 메소드
	public HashMap getData2(int num){
		
		HashMap map = null;
		try {
			map = (HashMap)sqlMapper.queryForObject("mem_getData2", num);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return map;
	}
	
	// 회원 한명의 데이터를 입력하는 메소드
	public void insert(MemDTO dto){
		
		try {
			sqlMapper.insert("mem_insert", dto);
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	
	// 회원 한명의 데이터를 입력하는 메소드 (행에 키 값 num, name, addr)
	public void insert(HashMap map){
		
		try {
			sqlMapper.insert("mem_insert2", map);
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	
	// 파라미터로 넘어오는 번호의 회원 이름을 리턴하는 메소드
	public String getString(int num){
		
		String name = null;
		
		try {
			name = (String)sqlMapper.queryForObject("mem_getString", num);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return name;
	}
	
	// 일정 범위의 데이터를 select 해서 리턴하는 메소드 (회원번호 1-5)
	public ArrayList<MemDTO> getOneTOFive(){
				
		ArrayList<MemDTO> list = null;
		
		try {
			
			list = (ArrayList<MemDTO>)sqlMapper.queryForList("mem_getOneTOFive");
			
		} catch (SQLException e) {

			e.printStackTrace();
		}

		
		return list;
	}
}