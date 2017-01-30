package test.main;
/*
 * 반복문 while
 * 
 * while(조건문){
 * 	..반복 수행할 문장.
 * }
 */
public class MainClass10 {
	public static void main(String[] args) {
		//while 문을 이용해서 0~99 까지 출력해보기
		int count=0; //카운트를 세기 위한 변수.
		while(true){
			System.out.print(count+" ");
			count++; //카운트 증가
			if(count==100)break;
		}//while
		System.out.println();//개행하기
		/*
		 * 다른 형태로 사용을 한다면...
		 */
		count=0; //카운트 초기화
		boolean isRun=true;
		while(isRun){
			System.out.print(count+" ");
			count++;
			if(count==100)isRun=false;
		}
		System.out.println();//개행하기
		count=0;//카운트 초기화
		while( count<100 ){
			System.out.print(count+" ");
			count++;
		}
		
	}//main
}//class











