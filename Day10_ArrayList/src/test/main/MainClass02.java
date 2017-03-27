package test.main;

import java.util.ArrayList;

import test.dto.Member;

public class MainClass02 {
	public static void main(String[] args) {
		//Member 객체를 담을수 있는 ArrayList 객체 생성하기.
		ArrayList<Member> list= new ArrayList<Member>();
		//Member 객체 생성하기
		Member mem1=new Member(1,"김태호","노량진");
		Member mem2=new Member(2,"홍길동","서울");
		Member mem3=new Member(3,"나야나","인천");
		//생성한 Member 객체를 배열에 저장하기
		list.add(mem1);
		list.add(mem2);
		list.add(mem3);
		
		//list 객체에 저장된 객체를 하나씩 불러와서 저장된 정보를 출력
		for(int i=0; i<list.size();i++){
			int num = list.get(i).getNum();
			String name=list.get(i).getName();
			String addr=list.get(i).getAddr();
			System.out.println("번호:"+num+" 이름:"+name+" 주소:"+addr);
		}
	}
}













