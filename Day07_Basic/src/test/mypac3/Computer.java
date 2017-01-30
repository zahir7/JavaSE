package test.mypac3;

public class Computer {
	
	public String cpu; //중앙처리 장치
	public String memory; //메모리
	//디폴트 생성자
	public Computer(){} 
	//생성자
	public Computer(String cpu,String memory){
		this.cpu=cpu;
		this.memory=memory;
	}
	//메소드
	public void calc(){
		if(cpu==null || memory==null){
			System.out.println("cpu 혹은 memory 가 없어요!");
			return; //메소드를 끝내라
		}
		System.out.println("계산을 해요");
	}
	
}









