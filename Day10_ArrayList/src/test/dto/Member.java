package test.dto;
/*	
 * DTO (Data Transfer Object) Bean
 * VO (Value Object) Bean
 * 
 * 회원의 번호,이름,주소를 저장하는 객체를 생성하기 위한 Member 클래스
 * 
 * Member mem=new Member();
 * new Member(100);
 */
public class Member {
	private int num; //회원의 번호
	private String name; //이름 
	private String addr; //주소
	//디폴트 생성자
	public Member(){
		System.out.println("디폴트 생성자가 호출되었습니다.");
	}
	public Member(int num, String name, String addr) {
		
		this.num = num;
		this.name = name;
		this.addr = addr;
	}
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













