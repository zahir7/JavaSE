package ex1;

class Tv09{
	int x = 10;
	static int y = 20;
	void add(){
		System.out.println(x);
		System.out.println(y);
	}
}
public class Main09 {
	public static void main(String[] args) {
		Tv09 t1 = new Tv09();
		t1.add();
	}

}
