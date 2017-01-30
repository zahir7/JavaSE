package ex1;
class Tv{
	final int A; //상수는 대문자로 나타낸다
	Tv(int a){
		A = a; //파이널 상수는 생성자를 통해서 한번 값을 넣을 수 있다.
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
