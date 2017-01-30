package test.main;

public class MainClass15 {
	public static void main(String[] args) {
		//아래에 있는 3개의 맴버 메소드를 차례로 호출해 보세요.
		showMsg();
		showNumber(100);
		calc(10,"김태호",10.1);
	}
	
	public static void showMsg(){
		System.out.println("하이!!");
	}
	public static void showNumber(int number){
		System.out.println("인자로 전달된 숫자:"+number);
	}
	public static void calc(int num,String name,double d){
		System.out.println(num+" "+name+" "+d);
	}
}
