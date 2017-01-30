package test.main;

public class MainClass17 {
	public static void main(String[] args) {
		String name = getName();
		System.out.println(name);
		//getNumber() 라는 메소드를 호출한후 리턴되는 데이터를 받아서 출력
		//해 보세요!
		//int num = getNumber();
		//System.out.println(num);
		System.out.println(getNumber());
		
		System.out.println("메인 메소드가 종료 됩니다.");
	}
	
	//리턴되는 데이터가 있는 메소드
	public static String getName(){
		
		return "멍멍이!";
	}
	public static int getNumber(){
		
		return 100;
	}
}
