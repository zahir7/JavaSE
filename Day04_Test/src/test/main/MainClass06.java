package test.main;

import java.util.ArrayList;

import test.mypac.Member;

public class MainClass06 {
	public static void main(String[] args) {
		//Member 객체 생성하고 객체에 자료 저장하기
		Member mem1 = new Member();
		mem1.num = 1 ;
		mem1.name = "김구라";
		mem1.addr = "노량진";
		
		Member mem2 = new Member();
		mem2.num = 2 ;
		mem2.name = "홍길동";
		mem2.addr = "서울";
		
		Member mem3 = new Member();
		mem3.num = 3 ;
		mem3.name = "홍야나";
		mem3.addr = "인천";
		
		Member mem4 = new Member();
		mem4.num = 4 ;
		mem4.name = "아무개";
		mem4.addr = "인천";
		
		//회원 정보를 저장할 가변 배열 객체 생성하기
		ArrayList<Member> list=new ArrayList<Member>();
		//Member 객체를 배열에 저장하기.
		list.add(mem1);
		list.add(mem2);
		list.add(mem3);
		list.add(mem4);
		for(int i=0 ; i < list.size() ; i=i+1){
			System.out.print(" 번호: "+list.get(i).num);
			System.out.print(" 이름: "+list.get(i).name);
			System.out.print(" 주소: "+list.get(i).addr);
			System.out.println();//개행하기
		}
		
	}
}














