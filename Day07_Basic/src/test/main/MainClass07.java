package test.main;
/*
 * switch ~ case 문 사용하기.
 */
public class MainClass07 {
	public static void main(String[] args) {
		int num=3;
		switch(num){
		case 0 :
			System.out.println("0입니다.");
			break;
		case 1 :
			System.out.println("1입니다.");
			break;
		case 2 :
			System.out.println("2입니다.");
			break;
		case 3 :
			System.out.println("3입니다.");
			break;
		default : //디폴트로 실행할 내용이 있을때
			System.out.println("0,1,2,3 이 아닙니다.");
			break;
		}//switch
	}//main
}




