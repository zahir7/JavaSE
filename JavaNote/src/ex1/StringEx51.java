package ex1;

public class StringEx51 {
	public static void main(String[] args) {
		String s1 = "Wonnder Girls";
		
		int index = s1.indexOf('n');
		System.out.println("�� ó�� ���� n�� ��ġ : "+ index);
		
		index = s1.indexOf("der");
		System.out.println("���� der�� ��ġ : " + index);
		
		index = s1.lastIndexOf('n');
		System.out.println("������ ���� n�� ��ġ : " + index);
		
		char c = s1.charAt(index);
		System.out.println("������ ���� : " + c);
		
		index = s1.indexOf('G');
		String str = s1.substring(index);
		System.out.println("G�κ��� ������ �߶󳻱� : " + str);
		
		str = s1.substring(index, index+3);
		System.out.println("G�κ��� 3�ڱ��� �߶󳻱� : " + str);
		
		int length = s1.length();
		System.out.println("s1�� ���� : " + length);
		
		String[] arr = s1.split(" ");
		for(int i = 0; i < arr.length; i++){
			System.out.println("arr["+i+"] : "+arr[i]);
		}
	}
}
