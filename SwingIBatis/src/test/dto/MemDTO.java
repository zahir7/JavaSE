package test.dto;
/*
 * ȸ���� ��ȣ,�̸�,�ּҰ��� ������ DTO ��ü
 * (Data Transfer Object) Ȥ��  (Value Object)
 */
public class MemDTO {
	private int num;
	private String name;
	private String addr;
	//����Ʈ ������
	public MemDTO(){}
	public MemDTO(int num, String name, String addr) {
		this.num = num;
		this.name = name;
		this.addr = addr;
	}
	//setter,getter �޼ҵ�
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








