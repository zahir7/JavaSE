package test.hanbit;

import java.util.Random;
/*
 * 문자열이 같은지 비교 할때
 * if( name.equals("문자열")){
 * 	
 * }
 */
public class OurClass {
	String[] names={"박수혁","조정아","한봉수","박민수",
			"임정미","이재경","김슬기","김상규","노성일",
			"김태호","김연중","주용군","김용희","정정선",
			"정아람","이현진(방장)","조성훈","조강현","김효성","이준규"};
	
	String[] addr={"보문동","아현동","서울역","고양시",
			"파주","수원","용산","연신내","노원",
			"부천","인천","문정동","천호동","잠실",
			"군포","사당동","개봉동","목동","안산","동대문"};
	//임의로 한명의 이름을 리턴하는 메소드
	public String getRandomName(){
		//임의로 이름을 추출하기 위한 랜덤 객체
		Random ran=new Random();
		// 0 ~ 20 수중에서 랜덤한 수 추출하기
		int ranNum=ran.nextInt(21);
		// 추출된 인덱스에 해당하는 이름 얻어오기
		String name=names[ranNum];
		// 이름 리턴하기.
		return name;
	}
	//전달되는 인자에 해당되는 사람의 주소를 리턴하는 메소드를 만드세요
	public String getAddr(String name){
		String findedAddr = null; //주소를 담을 변수를 선언하고 null 로 초기화
		
		//반복문 돌면서 배열에서 인자로 전달된 name 의 인덱스 찾기
		for(int i=0 ; i < 21 ; i=i+1){
			//인자로 전달된 문자열이 배열에 저장된 이름과 같은지 확인하기
			if( name.equals(names[i]) ){ //만일 같다면
				//찾는 주소는 해당인덱스에 해당하는 주소 값이다.
				findedAddr = addr[i];
			}
		}
		return findedAddr;
	}
}




























