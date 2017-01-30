package ex1;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx2 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		//키값이 중복되면 덮어 씌우기가 된다.
		map.put("java", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");
		Scanner s = new Scanner(System.in);
		while(true){
			System.out.println("id와 password를 입력해주세요.");
			System.out.print("id :");
			String id = s.nextLine().trim();
			System.out.print("password :");
			String password = s.nextLine().trim();
			System.out.println();
			if(!map.containsKey(id)){
				System.out.println("id는 존재하지 않습니다. 다시 입력해주세요.");
				continue;
			} else {
				if(!(map.get(id).equals(password))){
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
				} else {
					System.out.println("id와 비밀번호가 일치합니다.");
					break;
				}
			}
		}
	}
}