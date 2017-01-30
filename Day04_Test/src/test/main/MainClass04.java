package test.main;

import test.mypac.Phone;

public class MainClass04 {
	public static void main(String[] args) {
		//정수 10개를 담을수 있는 배열객체 생성하기
		int[] nums = new int[10];
		
		//실수 10개를 담을수 있는 배열객체 생성하기
		double[] dNums=new double[10];
		boolean[] bools=new boolean[10];
		//문자열 10개를 담을수 있는 배열객체 생성하기
		String[] names=new String[10];
		
		System.out.println(nums[0]);
		System.out.println(dNums[0]);
		System.out.println(names[0]);
		System.out.println(bools[0]);
		//Phone 객체 10개를 담을수 있는 배열 객체를 생성해보세요.
		Phone[] phones=new Phone[10];
		//배열에 객체 저장하기
		Phone p0=new Phone();
		phones[0]=p0;
	}
}










