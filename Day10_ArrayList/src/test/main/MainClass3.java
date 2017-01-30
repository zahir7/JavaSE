package test.main;

import java.util.ArrayList;
import java.util.Scanner;
import test.dto.Member;
/*
 * 회원 추가 , 전체 회원 목록보기 가 되는 프로그램 만들기.
 */
public class MainClass3 {
	public static void main(String[] args) {
		//Scanner 객체 생성하기
		Scanner scan=new Scanner(System.in);
		//회원정보를 담을 ArrayList 객체 생성하기
		ArrayList<Member> list=new ArrayList<Member>();
		int select=0;
		boolean isRun=true;
		int memberCount=0;//회원번호.
		//반복문을 만든다.
		while(isRun){
			System.out.print("회원추가[1]목록보기[2]종료[0]:"); 
			//사용자로 부터 정수값 입력받기.
			select=scan.nextInt();
			switch(select){
			case 1: //회원 가입
				memberCount++; // 회원번호 증가 시키기.
				System.out.print("이름입력:");
				String name=scan.next(); //이름 입력받기
				System.out.print("주소입력:");
				String addr=scan.next(); //주소 입력 받기
				//현재 입력된 정보를 이용해서  Member 객체 생성하기
				Member mem=new Member(memberCount,name,addr);
				//생성된 객체를 ArrayList 객체에 담기
				list.add(mem);
				break;
			case 2: //목록보기
				System.out.println("------------------------");
				//list 객체에 저장된 객체를 하나씩 불러와서 저장된 정보를 출력
				for(int i=0; i<list.size();i++){
					int num1 = list.get(i).getNum();
					String name1=list.get(i).getName();
					String addr1=list.get(i).getAddr();
					System.out.println("번호:"+num1+" 이름:"+name1+" 주소:"+addr1);
				}
				System.out.println("------------------------");
				break;
			case 0: //종료
				isRun=false; //반복문 빠져 나가기.
				break;
			}//switch()
		}//while()
	}//main()
}//class




















