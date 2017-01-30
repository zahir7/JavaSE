package test.mypac2;

public class MainClass {
	public static void main(String[] args) {
		//WonderWoman 객체 생성하기
		WonderWoman wWoman=new WonderWoman();
		//Man 객체 생성하기
		Man man1=new Man(175);
		Man man2=new Man(180);
		
		wWoman.dance(man2);
		
		Woman w=new WonderWoman(); //부모 형태로 받을수 있다.
		
	}
}
