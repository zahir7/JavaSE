package ex1;

public class Warpper {
	public static void main(String[] args) {
		Integer one = new Integer("15");
		Integer two = new Integer(21);
		int total = one.intValue() + two.intValue();
		
		System.out.println(total);
		System.out.println(Integer.toBinaryString(total));
		System.out.println(Integer.toOctalString(total));
		System.out.println(Integer.toHexString(total));
	}
}
