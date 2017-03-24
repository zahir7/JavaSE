package test.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import test.dto.MemDTO;
import test.util.SqlMapLocator;

import com.ibatis.sqlmap.client.SqlMapClient;

public class MemDAO {

	SqlMapClient sqlMapper;

	// ������
	public MemDAO() {

		sqlMapper = SqlMapLocator.getSqlMapper();
	}
	
	// ��� ȸ���� ������ ������ �޼ҵ�
	public ArrayList<MemDTO> getList(){
		
		ArrayList<MemDTO> list = null;
		
		try {
			
			list = (ArrayList<MemDTO>)sqlMapper.queryForList("mem_getList");
			
		} catch (SQLException e) {

			e.printStackTrace();
		}

		
		return list;
	}
	
	// ��� ȸ���� ������ ������ �޼ҵ�
	public ArrayList<HashMap> getList2(){
		
		ArrayList<HashMap> list = null;
		
		try {
			list = (ArrayList<HashMap>)sqlMapper.queryForList("mem_getList2");
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return list;
	}
	
	// �Ķ���ͷ� �Ѿ���� ��ȣ�� ȸ�� �Ѹ��� ������ ������ �޼ҵ�
	public MemDTO getData(int num){
				
		MemDTO dto = null;
		try {
			dto = (MemDTO)sqlMapper.queryForObject("mem_getData", num);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return dto;
	}
	
	// �Ķ���ͷ� �Ѿ���� ��ȣ�� ȸ�� �Ѹ��� ������ ������ �޼ҵ�
	public HashMap getData2(int num){
		
		HashMap map = null;
		try {
			map = (HashMap)sqlMapper.queryForObject("mem_getData2", num);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return map;
	}
	
	// ȸ�� �Ѹ��� �����͸� �Է��ϴ� �޼ҵ�
	public void insert(MemDTO dto){
		
		try {
			sqlMapper.insert("mem_insert", dto);
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	
	// ȸ�� �Ѹ��� �����͸� �Է��ϴ� �޼ҵ� (�࿡ Ű �� num, name, addr)
	public void insert(HashMap map){
		
		try {
			sqlMapper.insert("mem_insert2", map);
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	
	// �Ķ���ͷ� �Ѿ���� ��ȣ�� ȸ�� �̸��� �����ϴ� �޼ҵ�
	public String getString(int num){
		
		String name = null;
		
		try {
			name = (String)sqlMapper.queryForObject("mem_getString", num);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return name;
	}
	
	// ���� ������ �����͸� select �ؼ� �����ϴ� �޼ҵ� (ȸ����ȣ 1-5)
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