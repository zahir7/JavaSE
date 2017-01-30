package day5_2;

public class CellPhone implements Phone{
	
	public void sendMsg(){
		System.out.println("문자를 보내요");
	}

	@Override
	public void call() {
		System.out.println("전화를 걸어요");
		
	}
	
}
