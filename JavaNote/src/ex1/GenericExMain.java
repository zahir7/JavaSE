package ex1;
class GenericEx<T>{
	T[] v;
	public void set(T[] n){
		v = n;
	}
	public void print(){
		for(T s : v)
			System.out.println(s);
	}
	
}

public class GenericExMain {
	public static void main(String[] args) {
		GenericEx t = new GenericEx();
		String [] ss = {"ÀÌ", "½Â", "Àç"};
		t.set(ss);
		t.print();
	}

}
