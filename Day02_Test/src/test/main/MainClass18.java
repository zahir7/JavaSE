package test.main;

public class MainClass18 {
	//���α׷��� ������ �Ǵ� ���� �޼ҵ�
	public static void main(String[] args) {
		
		int result = getSum(1, 2);
		System.out.println("���:"+result);
		
		double result2 = getSum(10.9 , 10.1);
		
		System.out.println(result2);
	}
	//���ڷ� ���޵Ǵ� �� ������ ������ ��� ���� �����ϴ� �޼ҵ�
	public static int getSum(int a , int b){
		int sum = a+b;
		
		return sum;
	}
	//���ڷ� ���޵Ǵ� �� �Ǽ��� ������ ��� ���� �����ϴ� �޼ҵ带 ��������
	public static double getSum(double a,double b){
		double sum = a+b;
		return sum;
	}
}







