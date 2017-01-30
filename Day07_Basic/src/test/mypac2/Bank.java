package test.mypac2;

import java.util.HashMap;

/*
 * 가상의 은행 클래스 만들기.
 */
public class Bank {
	//final  상수 정의하기
	public final String NAME="신한은행";
	public String branch; //지점
	public int totalMoney; //전체 예치된 금액
	public HashMap<String,Integer> map=
							new HashMap<String,Integer>();
	//생성자 정의하기
	public Bank(String branch){
		//생성자에서 인자로 받아온 지점명을 자신의 맴버 필드에 저장하기
		this.branch=branch;
	}
	
}









