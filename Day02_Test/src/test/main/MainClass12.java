package test.main;
/*
 * while 문을 이용해서 1~100 까지 합을 구해서 출력하는 예제
 */
public class MainClass12 {
	
	public static void main(String[] args) {
		//카운트를 세기 위한 변수
		int count=0;
		//합을 저장할 변수
		int sum=0;
		//while 문을 제어하기 위한 boolean  변수
		boolean isCommit = true;
		//반복문 돌면서 숫자를 더해서 sum 이라는 변수에 누적 시키기
		while(isCommit){
			count = count + 1;
			sum = sum + count;
			if(count == 100) isCommit=false;
		}
	
		System.out.println("1~100까지의 합은: "+sum);
	}
}
