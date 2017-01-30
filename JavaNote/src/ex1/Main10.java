package ex1;

public class Main10 {
	public static void main(String[] args) {
		String a = "±èÅÂÈ£";
		char[] b = a.toCharArray();
		for (int i = b.length - 1; i >= 0 ; i--) {
			System.out.print(b[i]);
		}				
	}
}
