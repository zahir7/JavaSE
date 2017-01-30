package test.main;
/*
 * [[ Exception 의 종류 ]]
 * 
 * 1.Checked Exception
 * -컴파일시에 반드시 try~catch 로 처리해야한다.
 * 2.UnChecked Exception
 * -try~catch 로 처리하지 않아도 컴파일시에 에러가 발생하지 않음
 * -선택적으로 처리하면된다.
 */
public class MainClass04 {
	public static void main(String[] args) {
		//0~9 까지 순서대로 출력하기
		
		for(int i=0; i<10 ; i++){
			System.out.println(i);
			try{
				Thread.sleep(2000);
			}catch(InterruptedException ie){
				System.out.println("익셉션발생!");
			}
		}//for
	}//main()
}//class
