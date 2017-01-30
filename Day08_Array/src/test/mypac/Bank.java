package test.mypac;
//가상의 은행 클래스
public class Bank {
	//맴버 필드 만들기
	public String name="신한은행";
	public static int count;
	//생성자
	public Bank(){
		count++; //카운트 올리기
		System.out.println("생성자가 호출되었습니다.");
	}
	//메소드 만들기
	public void setMoney(){
		System.out.println("예금을 했습니다.");
	}
	//static 멤버 메소드를 만들고 사용해보세요.
	public static void doSomething(){
		System.out.println("무언가를 해요!");
	}
}










