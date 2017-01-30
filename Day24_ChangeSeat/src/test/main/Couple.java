package test.main;
// 두명의 이름을 저장할 커플 클래스 
public class Couple {
	private String firstPerson;
	private String secondPerson;
	//생성자
	public Couple(){}
	public Couple(String firstPerson, String secondPerson) {
		super();
		this.firstPerson = firstPerson;
		this.secondPerson = secondPerson;
	}
	//setter,getter 메소드
	public String getFirstPerson() {
		return firstPerson;
	}
	public void setFirstPerson(String firstPerson) {
		this.firstPerson = firstPerson;
	}
	public String getSecondPerson() {
		return secondPerson;
	}
	public void setSecondPerson(String secondPerson) {
		this.secondPerson = secondPerson;
	}
	
}
