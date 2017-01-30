package ex1;

public class ExceptionEx2 {
	public static void main(String[] args) {
		int number = 10;
		int result = 0;
		for(int i = 0; i < 10; i++){
			try{
				result = number / (int)(Math.random()*10);
			}catch(Exception e){
				System.out.println("0 ¹ß»ý");
			}
			System.out.println(result);
		}		
	}
}
