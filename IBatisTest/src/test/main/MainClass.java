package test.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import test.dao.MemDAO;
import test.dto.MemDTO;

public class MainClass {

	public static void main(String[] args) {
		
		// MemDAO ��ü�� �����ؼ� ��� �޼ҵ带 �׽�Ʈ �غ�����.
		MemDAO dao = new MemDAO();
		
		MemDTO dto = dao.getData(1);
		
		System.out.println();
		System.out.println("getData");
		System.out.println("��ȣ : " + dto.getNum());
		System.out.println("�̸� : " + dto.getName());
		System.out.println("�ּ� : " + dto.getAddr());

		
		
		HashMap map = dao.getData2(1);
		
		System.out.println();
		System.out.println("getData2");
		System.out.println("��ȣ\t�̸�\t�ּ�");
		System.out.println(map.get("NUM") + "\t" + map.get("NAME") + "\t" + map.get("ADDR"));
		
		ArrayList<MemDTO> list = dao.getList();
		StringBuffer sBuff = new StringBuffer();

		for(MemDTO tmp : list){
			
			sBuff.append(tmp.getNum() + "\t");
			sBuff.append(tmp.getName() + "\t");
			sBuff.append(tmp.getAddr() + "\r\n");
		}
		
		
		
		System.out.println();
		System.out.println("getList");
		System.out.println(sBuff.toString());
		
		
		
		HashMap map3 = new HashMap();
		map3.put("num", "100");
		map3.put("name", "�Ż��Ӵ�");
		map3.put("addr", "���ϱ�");
		
		// dao.insert(map3);
		
		System.out.println("getList2");
		ArrayList<HashMap> list3 = dao.getList2();
		
		System.out.println("��ȣ\t�̸�\t�ּ�");
		for(HashMap tmp : list3){
			System.out.print(tmp.get("NUM") + "\t" + tmp.get("NAME") + "\t" + tmp.get("ADDR"));
			System.out.println();
		}
		
		String name = dao.getString(1);
		System.out.println();
		System.out.println("getString");
		System.out.println("�̸� : " + name);
		
		
		
		
		ArrayList<MemDTO> list2 = dao.getOneTOFive();
		StringBuffer sBuff2 = new StringBuffer();
		
		for(MemDTO tmp : list2){
			
			sBuff2.append(tmp.getNum() + " / ");
			sBuff2.append(tmp.getName() + " / ");
			sBuff2.append(tmp.getAddr() + "\r\n");
		}
		
		System.out.println();
		System.out.println("getOneTOFive");
		System.out.println(sBuff2.toString());

		// dao.insert(new MemDTO(10, "�̼���", "���α�"));
	}
}