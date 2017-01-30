package ex1;

class AClass{
}
interface Cinter{	
}
class BClass extends AClass implements Cinter{	
}

public class ABCEx {
	public static void main(String[] args) {
		BClass bp = new BClass();
		System.out.println(bp instanceof Object);
		System.out.println(bp instanceof AClass);
		System.out.println(bp instanceof BClass);
		System.out.println(bp instanceof Cinter);
	}
}
