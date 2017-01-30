package test.dto;
/*	
 * DTO (Data Transfer Object) Bean
 * VO (Value Object) Bean
 * 
 * ȸ���� ��ȣ,�̸�,�ּҸ� �����ϴ� ��ü�� �����ϱ� ���� Member Ŭ����
 * 
 * Member mem=new Member();
 * new Member(100);
 */
public class Member {
	private int num; //ȸ���� ��ȣ
	private String name; //�̸� 
	private String addr; //�ּ�
	//����Ʈ ������
	public Member(){
		System.out.println("����Ʈ �����ڰ� ȣ��Ǿ����ϴ�.");
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













