package test.mypac;

public class Memory {
	//메모리 제조사 를 저장할 필드
	private String company;
	private int size;
	//생성자
	public Memory(String _company, int _size){
		//인자로 전달한 값을 자신의 맴버 필드에 저장하기.
		company=_company;
		size=_size;
	}
	//메소드
	public String getCompany(){
		return company;
	}
	//메모리의 크기를 리턴하는 메소드
	public int getSize(){
		return size;
	}
}


