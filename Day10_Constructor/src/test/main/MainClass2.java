package test.main;

import test.mypac.Member;

/*
 * Member 클래스를 이용해서 객체 생성하고 값(회원정보) 저장해보기.
 */
public class MainClass2 {
	public static void main(String[] args) {
		//Member  객체 생성하기
		Member mem1=new Member();
		//객체의 필드에 값 넣어주기
		mem1.setNum(1);
		mem1.setName("김태호");
		mem1.setAddr("노량진");
		//객체에 저장된 값 출력해보기
		System.out.println("번호:"+mem1.getNum());
		System.out.println("이름:"+mem1.getName());
		System.out.println("주소:"+mem1.getAddr());
		
		//Member 객체 생성과 동시에 필요한 값 혹은 객체 넣어주기
		Member mem2=new Member(2,"홍길동","서울");
		//객체에 저장된값 출력하기.
		System.out.println("번호:"+mem2.getNum());
		System.out.println("이름:"+mem2.getName());
		System.out.println("주소:"+mem2.getAddr());
		
		//Member 객체를 담을수있는 방5개짜리 배열 만들기
		Member[] list=new Member[2];
		//배열의 0 번째 인덱스에 mem1 객체 저장하기
		list[0]=mem1;
		//배열의 1 번째 인덱스에 mem2 객체 저장하기.
		list[1]=mem2;
		
		//반복문 돌면서 회원정보 출력해보기
		for(int i=0 ; i<list.length ;i++){
			int num=list[i].getNum(); //번호 얻어오기
			String name=list[i].getName(); //이름 얻어오기
			String addr=list[i].getAddr(); //주소 얻어오기.
			//한줄씩 출력하기
			System.out.println("번호:"+num+" 이름:"+name+" 주소:"+addr);
		}
	}
}