package test.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import test.dto.BoardDTO;
import test.util.SqlMapLocator;

import com.ibatis.sqlmap.client.SqlMapClient;
public class IBoardDAO {
	SqlMapClient sqlMapper;
	//������
	public IBoardDAO(){
		//sqlMapper ��ü ������.
		sqlMapper=SqlMapLocator.getSqlMapper();
	}
	//�� ������ �Է��ϴ� �޼ҵ�
	public void insert(BoardDTO dto){
		try {
			//BoardDTO ��ü�� ��� ������ �����ϱ�.....~~!!!!!~!@!@!@!@!@!@!@!#!~
			sqlMapper.insert("board_insert", dto);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//�۸���� �����ϴ� �޼ҵ�
	public ArrayList<BoardDTO> getList(){
		ArrayList<BoardDTO> list=null;
		try{
			list=(ArrayList<BoardDTO>)
					sqlMapper.queryForList("board_getList");
		}catch(SQLException se){
			se.printStackTrace();
		}
		
		return list;
	}
}











