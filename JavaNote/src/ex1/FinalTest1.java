package ex1;
class Tv{
	final int A; //����� �빮�ڷ� ��Ÿ����
	Tv(int a){
		A = a; //���̳� ����� �����ڸ� ���ؼ� �ѹ� ���� ���� �� �ִ�.
	}
}
class FinalTest1 {
	public static void main(String[] args) {
		Tv t1 = new Tv(10);
		Tv t2 = new Tv(20);
		System.out.println(t1.A);
		System.out.println(t2.A);
		
	}

}
