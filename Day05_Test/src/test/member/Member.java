package test.member;
// 회원의 번호,이름,주소를 저장할수 있는 객체
// Data Transfer Object (DTO)
// Value Object (VO)
public class Member {
	private int num;
	private String name;
	private String addr;
	
	//setter메소드 getter 메소드
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
