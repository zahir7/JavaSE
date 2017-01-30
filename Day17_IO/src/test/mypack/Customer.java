package test.mypack;

//Serializable�� ������ Ŭ������ ��ü�� ����ȭ�� �� �ִ� ����� �� �� ����
public class Customer implements java.io.Serializable{
	private String name;
	//transient Ű����� ����ȭ ��󿡼� ����
	private transient String email;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	// toString() overriding�� �ϴ� ������
	// ��ü�� ����� �� ��ü�� toString() �޼��带 ȣ���ϰ� �ȴ�.
	// ���� toString() �޼��带 overriding ���� ������ 
	// Object Ŭ������ toString() �޼��尡 ȣ���
	// Object Ŭ������ toString() �޼����� ������
	
	// ����Ű��.Ŭ������@�ؽ��ڵ带 16���������� ��
	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
