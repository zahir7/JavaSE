package test.main;

public class MainCalss04 {
	//메인 메소드
	public static void main(String[] args) {
		//정수값을 저장할수 있는 방 10개짜리 배열객체 생성하기
		int[] myNums=new int[10];
		//메소드 호출하면서 배열의 참조값 전달하기
		readValue(myNums); //call by reference
		//확장 for 문을 이용해서 배열에 저장된 내용 출력해보기
		for(int tmp:myNums){
			System.out.println(tmp);
		}
	}
	
	//메소드 추가
	public static void readValue(int[] nums){
		for(int i=0 ; i<nums.length ;i++){
			nums[i]=999;
		}
	}
}








