package ex1;

import java.util.Scanner;

class ScannerEx1 {
	public static void main(String[] args) {
		/*
		Scanner s = new Scanner(System.in);		
		String str = s.nextLine();
		System.out.println("ÀÔ·Â°ª  = "+str);
		*/
		Scanner s = new Scanner("aaa,bbb,ccc,ddd");
		s = s.useDelimiter(",");
		System.out.println(s.next());
		System.out.println(s.next());
		System.out.println(s.next());
		System.out.println(s.next());		
	}
}
