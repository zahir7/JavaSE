package test.main;

import java.util.Random;

import test.mypac.HandPhone;

public class MainClass {
	
	public static void main(String[] args){
		//Random ��ü �����ϱ�
		Random ran=new Random();
		//HandPhone ��ü �����ϱ�
		HandPhone myPhone=new HandPhone();
		HandPhone yourPhone=new HandPhone("*���ڷ� ������ ���ڿ�*");
		
		HandPhone p=myPhone;
		
		p=yourPhone;
		
		p=null;
		
		p=new HandPhone();
	}
}















