package test.main;

public class MainClass01 {
	
	public static void main(String[] args) {
		String name=new String("김태호");
		System.out.println(name);
		//새로운 String 객체가 생성된다.
		name = name +" 선생님";
		
		System.out.println(name);
		
		for(int i=0 ; i<100 ; i++){
			//반복문 돌때마다 새로운 String 객체가 생성된다.
			//비효율적! 
			name = name+i;
		}
		System.out.println(name);
	}
}
















