package test.dto;
/*
 * 회원의 번호,이름,주소값을 포장할 DTO 객체
 * (Data Transfer Object) 혹은  (Value Object)
 */
public class MemDTO {
	private int num;
	private String name;
	private String addr;
	//디폴트 생성자
	public MemDTO(){}
	public MemDTO(int num, String name, String addr) {
		this.num = num;
		this.name = name;
		this.addr = addr;
	}
	//setter,getter 메소드
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}








