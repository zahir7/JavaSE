package ex1;
public class ApiEx1 {
	public static void main(String[] args) {
		Boolean b1 = new Boolean(true); //��ü �����Ҷ� �⺻�����ڰ� ���������� �˾ƾ��Ѵ�..
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
