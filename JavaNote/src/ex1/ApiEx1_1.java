package ex1;
class Tv1_1{
	public String toString(){
		return "Tv hello";
	}
}

public class ApiEx1_1 {
	public static void main(String[] args) {
		Tv1_1 t1 = new Tv1_1();
		Tv1_1 t2 = new Tv1_1();
		
		System.out.println(t1);
		System.out.println(t2.toString());
		
		System.out.println(t1 == t2);
		System.out.println(t1.equals(t2));
			// Object obj = t2;
			// Object는 모든 클래스와 다형성이 된다.
	}
}
