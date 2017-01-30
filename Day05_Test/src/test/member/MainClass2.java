package test.member;

import java.util.HashMap;
import java.util.Scanner;

public class MainClass2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		HashMap<String, String> map=
				new HashMap<String, String>();
		while(true){
			System.out.println("단어입력[0],단어검색[1] 입력");
			String select=scan.next();
			if(select.equals("0")){ //단어 입력
				System.out.println("입력할 단어:");
				String word=scan.next();
				System.out.println("단어의 뜻:");
				String mean=scan.next();
				map.put(word, mean); //map 에 단어 저장하기.
				System.out.println("저장 되었습니다");
			}else if(select.equals("1")){ //단어 검색
				System.out.println("찾을 단어:");
				String findWord=scan.next();
				String mean=map.get(findWord);
				System.out.println(findWord+" : "+mean);
			}//if
		}//while()
	}//main()
}//calss














