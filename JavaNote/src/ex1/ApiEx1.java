package ex1;
public class ApiEx1 {
	public static void main(String[] args) {
		Boolean b1 = new Boolean(true); //객체 생성할때 기본생성자가 존재유무를 알아야한다..
		Boolean b2 = new Boolean("True");
		
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		Integer a1 = new Integer(100);
		try {
			Integer a2 = new Integer("200");
	
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
