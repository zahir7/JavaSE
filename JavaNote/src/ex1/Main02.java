package ex1;

// ��ü������ ���ϰ� �Ѵ�... 
// �̷� ����� �̱� �ν��Ͻ���� �̶���Ѵ�
class TvTest02{
	int x = 100;
	private TvTest02(){}
	private static TvTest02 t = new TvTest02();
	public static TvTest02 getInstance(){
		return t;
	}	
}
class Main02 {
	public static void main(String[] args) {
//		TvTest02 t1 = new Test02(); //�����ڸ� ������ �� ����.	
		TvTest02 t1 = TvTest02.getInstance();
		TvTest02 t2 = TvTest02.getInstance();
		t1.x = 400;
		System.out.println(t1.x);
		System.out.println(t2.x);
	}
}
