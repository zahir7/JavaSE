package test.mypac4;

public class Phone {
	//맴버 필드 정의하기
	Usim usim;
	//public Phone(){}
	//인자로 Usim 객체를 전달 받는 생성자 만들기
	public Phone(Usim usim){
		this.usim=usim;
		System.out.println("Usim 객체를 자식으로 부터 전달 받았습니다.");
	}
	//메소드
	public void call(){
		if(usim==null){
			System.out.println("통화가 불가능합니다 Usim 객체가 필요합니다.");
			return;//메소드를 끝내라
		}
		System.out.println("전화를 걸어요!");
	}
}
