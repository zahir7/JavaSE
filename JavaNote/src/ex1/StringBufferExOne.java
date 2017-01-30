package ex1;

public class StringBufferExOne {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Java");
		sb.append("1.7");
		System.out.println(sb);
		sb.delete(3, 5);
		System.out.println(sb);
		sb.insert(3, "A1");
		System.out.println(sb);
		sb.replace(4, 7, "¿œ¡°¿∞");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}
}
