package test.main;

public class MainClass16 {
	public static void main(String[] args) {
		int num=10;
		float f= 10.1f;
		double d= 99.9;
		String addr="노량진";
		boolean isWait=false;
		//아래에 두개의 메소드를 여기에서 호출해보세요.
		aaa(num, d, addr);
		bbb(f ,isWait ,d ,addr );
	}
	public static void aaa(int a,double b,String c){
		System.out.println("aaa메소드 가 호출되었습니다.");
	}
	public static void bbb(float a,boolean b,double c,String d){
		System.out.println("bbb메소드 가 호출되었습니다.");
	}
}
