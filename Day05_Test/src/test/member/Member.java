package test.member;
// ȸ���� ��ȣ,�̸�,�ּҸ� �����Ҽ� �ִ� ��ü
// Data Transfer Object (DTO)
// Value Object (VO)
public class Member {
	private int num;
	private String name;
	private String addr;
	
	//setter�޼ҵ� getter �޼ҵ�
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
