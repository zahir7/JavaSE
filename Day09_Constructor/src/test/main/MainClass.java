package test.main;

import java.util.Random;

import test.mypac.HandPhone;

public class MainClass {
	
	public static void main(String[] args){
		//Random 객체 생성하기
		Random ran=new Random();
		//HandPhone 객체 생성하기
		HandPhone myPhone=new HandPhone();
		HandPhone yourPhone=new HandPhone("*인자로 전달할 문자열*");
		
		HandPhone p=myPhone;
		
		p=yourPhone;
		
		p=null;
		
		p=new HandPhone();
	}
}















