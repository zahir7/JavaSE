package test.mypac2;

public class MainClass {
	public static void main(String[] args) {
		//WonderWoman ��ü �����ϱ�
		WonderWoman wWoman=new WonderWoman();
		//Man ��ü �����ϱ�
		Man man1=new Man(175);
		Man man2=new Man(180);
		
		wWoman.dance(man2);
		
		Woman w=new WonderWoman(); //�θ� ���·� ������ �ִ�.
		
	}
}
