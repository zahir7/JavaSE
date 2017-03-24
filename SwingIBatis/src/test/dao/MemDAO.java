package test.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import test.dto.MemDTO;
import test.util.SqlMapLocator;

import com.ibatis.sqlmap.client.SqlMapClient;
/*
 * ȸ���� ��ȣ �̸� �ּ� ���� �Է�,����,����, ��� ���� �ϱ����� ��ü��
 * �����ϱ����� Ŭ���������.
 */
public class MemDAO {
	private SqlMapClient sqlMapper;
	//������
	public MemDAO(){
		//�����ڿ��� SqlMapClient ��ü�� ���´�.
		sqlMapper = SqlMapLocator.getSqlMapper();
	}
	//ȸ�� �Ѹ��� ������ DB �� �����ϴ� �޼ҵ�
	public boolean insert(MemDTO dto){
		//sqlMapper ��ü�� insert(SQL���� �̸� , �����Ұ�ü);
		//�޼ҵ带  ȣ���Ѵ�.
		try {
			sqlMapper.insert("insert",dto);
			return true;//�����̶��
		} catch (SQLException e) {
			e.printStackTrace();
			return false;//���ж��
		}
	}
	//��� ȸ���� ������ �����ϴ� �޼ҵ�
	public ArrayList<MemDTO> getList(){
		ArrayList<MemDTO> list=null;
		try {
		/*
		 * ibatis �� sql ���� �����ϰ� SELECT �� ����� �˾Ƽ� �����ؼ�
		 * �������ش�. 	
		 */
		list=(ArrayList<MemDTO>)
				sqlMapper.queryForList("getList");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	//�Ѹ��� ȸ�������� �����ϴ� �޼ҵ�
	public void delete(int num){
		try {
			//���ڷ� ���޵� num ���� �ش��ϴ� �����͸� ���̺��� �����ϱ�
			sqlMapper.delete("delete",num);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//ȸ���� �ּҸ� �����ϴ� �޼ҵ�
	public void update(MemDTO dto){
		try {
			//ȸ������ �����ϱ�.
			sqlMapper.update("update", dto);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}






























