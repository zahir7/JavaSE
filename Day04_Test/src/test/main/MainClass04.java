package test.main;

import test.mypac.Phone;

public class MainClass04 {
	public static void main(String[] args) {
		//���� 10���� ������ �ִ� �迭��ü �����ϱ�
		int[] nums = new int[10];
		
		//�Ǽ� 10���� ������ �ִ� �迭��ü �����ϱ�
		double[] dNums=new double[10];
		boolean[] bools=new boolean[10];
		//���ڿ� 10���� ������ �ִ� �迭��ü �����ϱ�
		String[] names=new String[10];
		
		System.out.println(nums[0]);
		System.out.println(dNums[0]);
		System.out.println(names[0]);
		System.out.println(bools[0]);
		//Phone ��ü 10���� ������ �ִ� �迭 ��ü�� �����غ�����.
		Phone[] phones=new Phone[10];
		//�迭�� ��ü �����ϱ�
		Phone p0=new Phone();
		phones[0]=p0;
	}
}










