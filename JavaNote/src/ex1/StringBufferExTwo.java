package ex1;

public class StringBufferExTwo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("1234567890");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("ABCDEFGHIJKLMNOPQ");
	}

}
