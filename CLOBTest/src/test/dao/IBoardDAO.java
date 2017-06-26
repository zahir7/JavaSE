package test.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import test.dto.BoardDTO;
import test.util.SqlMapLocator;

import com.ibatis.sqlmap.client.SqlMapClient;
public class IBoardDAO {
	SqlMapClient sqlMapper;
	//생성자
	public IBoardDAO(){
		//sqlMapper 객체 얻어오기.
		sqlMapper=SqlMapLocator.getSqlMapper();
	}
	//글 정보를 입력하는 메소드
	public void insert(BoardDTO dto){
		try {
			//BoardDTO 객체에 담긴 내용을 저장하기.....~~!!!!!~!@!@!@!@!@!@!@!#!~
			sqlMapper.insert("board_insert", dto);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//글목록을 리턴하는 메소드
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











