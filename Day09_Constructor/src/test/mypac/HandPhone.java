package test.mypac;
/*
 * [[ 생성자 오버로딩 ]]
 * -생성자를 여러개 정의 해 놓는것
 */
public class HandPhone {
	//디폴트 생성자
	public HandPhone(){
		System.out.println("디폴트 생성자가 호출되었습니다.");
	}
	//인자로 전달되는 값혹은 객체가 있는 생성자
	public HandPhone(String name){
		System.out.println("생성자로 "+name+" 이 전달되었습니다.");
	}
}
