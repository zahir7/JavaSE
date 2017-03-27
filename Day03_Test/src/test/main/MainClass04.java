package test.main;

public class MainClass04 {
	//프로그램의 시작점이 되는 메인 메소드
	public static void main(String[] args) {
		String[] names={"김태호","대머리","원숭이","덩어리","주뎅이"};
		
		//while 문을 이용해서 배열의 모든 내용 출력해보기
		int index=0; //배열에 인덱스를 지칭하기 위해서
		boolean isRun=true;
		
		while(isRun){
			System.out.println(names[index]);
			index = index + 1;
			if(index == 5)isRun=false;
		}
		System.out.println("--------");
		index=0;
		while(true){
			System.out.println(names[index]);
			index = index + 1;
			if(index == 5)break;
		}
		System.out.println("--------");
		
		//반복문 for 사용하기.
		for(int i=0 ; i < 5 ; i=i+1){
			System.out.println(names[i]);
		}
		//반복문 for 사용하기.
		for(int i=0 ; i < names.length ; i=i+1){
			System.out.println(names[i]);
		}
		
	}	
}



















