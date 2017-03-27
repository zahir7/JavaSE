package test.main;

import test.mypac.Member;

public class MainClass07 {
	public static void main(String[] args) {
		int num1=10;
		int num2=10;
		if( num1 == num2){
			System.out.println("num1 과 num2 는 같아요!");
		}
		if( num1 != num2){
			System.out.println("num1 과 num2 는 달라요!");
		}
		String name1="김태호";
		String name2="김태호";
		if( name1.equals(name2)){ //문자열을 비교하는 방법
			System.out.println("name1 과 name2는 같아요!");
		}
	}
}







