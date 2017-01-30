package test.mypac;

import java.util.Scanner;

/*
 * 가상의 은행 클래스 만들기.
 */
public class Bank {
	//final  상수 정의하기
	public final String NAME="신한은행";
	public String branch; //지점
	public int totalMoney; //전체 예치된 금액
	//생성자 정의하기
	public Bank(String branch){
		//생성자에서 인자로 받아온 지점명을 자신의 맴버 필드에 저장하기
		this.branch=branch;
	}
	//예금하는 메소드
	public void setMoney(int money){
		//totalMoney = totalMoney+money;
		totalMoney += money; //위의 표현을 줄여서
		System.out.println(money+" 을 예치 했습니다.");
		System.out.println(NAME+" "+branch+" 의 총예금:"+totalMoney);
	}
	//예금을 찾는 메소드
	public int getMoney(int requestMoney){
		totalMoney = totalMoney - requestMoney;
		if(totalMoney < 0){
			System.out.println("돈이 부족합니다.");
			totalMoney = totalMoney + requestMoney;
			return 0;
		}
		System.out.println(NAME+" "+branch+" 의 총예금:"+totalMoney);
		return requestMoney;
	}
}









