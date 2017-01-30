package test.mypack;

//Serializable를 구현한 클래스는 객체를 직렬화할 수 있는 대상이 될 수 있음
public class Customer implements java.io.Serializable{
	private String name;
	//transient 키워드는 직렬화 대상에서 제외
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
	// toString() overriding을 하는 이유는
	// 객체를 출력할 때 객체의 toString() 메서드를 호출하게 된다.
	// 만약 toString() 메서드를 overriding 하지 않으면 
	// Object 클래스의 toString() 메서드가 호출됨
	// Object 클래스의 toString() 메서드의 구조는
	
	// 패지키명.클래스명@해시코드를 16진수변경한 값
	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
