package ex1;
class Tv08{
	static int x = 10; 					// Ŭ���� �⺻�� ����
	static Video08 v1 = new Video08();  // Ŭ���� ������ ����
	int x2 = 20;						// �ν��Ͻ� �⺻�� ����
	String str = "hello"; 				// �ν��Ͻ� ������ ����
}
class Video08{
	int y = 100;
}
public class Main08 {
	public static void main(String[] args) {		
		System.out.println(Tv08.x);
		System.out.println(Tv08.v1.y);
		
		Tv08 t1 = new Tv08();
		System.out.println(t1.x2);
		
		try {
			int result = t1.str.codePointAt(100);
			System.out.println(result);
		} catch (Exception e) {		
			System.out.println("�ش� ������ ���� ����.");
			e.printStackTrace();
		}
		
		
	}

}
