package ex1;

public class StandardIOEx1 {
	public static void main(String[] args) {
		try {
			int input = 0;
			while((input = System.in.read())!= -1){ //read()���� Ÿ���� int �ƽ�Ű�ڵ常 ���� �� �ִ�.
				System.out.println("input :" + input + ", (char)intput : " + (char)input);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
