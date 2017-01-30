package ex1;

public class StandardIOEx1 {
	public static void main(String[] args) {
		try {
			int input = 0;
			while((input = System.in.read())!= -1){ //read()리턴 타입은 int 아스키코드만 읽일 수 있다.
				System.out.println("input :" + input + ", (char)intput : " + (char)input);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
