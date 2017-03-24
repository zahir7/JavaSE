package test.dto;

public class MemDTO {

	private int num;
	private String name;
	private String addr;
		
	// 디폴트 생성자
	public MemDTO() {}

	public MemDTO(int num, String name, String addr) {

		this.num = num;
		this.name = name;
		this.addr = addr;
	}

	public int getNum() {
		return num;
	}

	public String getName() {
		return name;
	}

	public String getAddr() {
		return addr;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
}