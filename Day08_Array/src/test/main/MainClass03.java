package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		
		String[] names={"김구라","홍길동","나야나","차유람","원숭이"};
		
		//배열의 내용 출력해보기
		for(int i=0 ; i<names.length ; i++){
			System.out.println(names[i]);
		}
		//확장 for 문 
		for(String tmp:names){
			System.out.println(tmp);
		}
	}
}
