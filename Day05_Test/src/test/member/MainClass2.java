package test.member;

import java.util.HashMap;
import java.util.Scanner;

public class MainClass2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		HashMap<String, String> map=
				new HashMap<String, String>();
		while(true){
			System.out.println("�ܾ��Է�[0],�ܾ�˻�[1] �Է�");
			String select=scan.next();
			if(select.equals("0")){ //�ܾ� �Է�
				System.out.println("�Է��� �ܾ�:");
				String word=scan.next();
				System.out.println("�ܾ��� ��:");
				String mean=scan.next();
				map.put(word, mean); //map �� �ܾ� �����ϱ�.
				System.out.println("���� �Ǿ����ϴ�");
			}else if(select.equals("1")){ //�ܾ� �˻�
				System.out.println("ã�� �ܾ�:");
				String findWord=scan.next();
				String mean=map.get(findWord);
				System.out.println(findWord+" : "+mean);
			}//if
		}//while()
	}//main()
}//calss














