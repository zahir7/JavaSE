package test.mypac3;

public class Phone {
	//맴버필드(전역변수)
	private Usim usim;
	//public Phone(){}
	//생성자
	public Phone(Usim usim){
		//자식 생성자에서 전달받은 Usim 객체를 맴버 필드에 저장하기.
		this.usim=usim;
		System.out.println("Phone() 생성자");
	}
	//메소드
	public void call(){
		if(usim==null){
			System.out.println("Usim 객체가 없어서 전화를 걸수 없어요");
			return;//메소드를 끝내라
		}
		System.out.println("전화를 걸어요!");
	}
}
