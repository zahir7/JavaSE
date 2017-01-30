package study20120229;

import java.util.ArrayList;

public class ArrayListDemo {
	public ArrayList getList(){
		ArrayList list = new ArrayList();
		list.add("1111");
		list.add("2222");
		list.add("3333");
		list.add("4444");
		return list;
	}
	public static void main(String[] args) {
		ArrayListDemo demo = new ArrayListDemo();
		ArrayList list = demo.getList();
		for(int i=0;i<list.size();i++){
			String temp = (String)list.get(i);
			System.out.println(temp);
		}
		
		
	}
}
