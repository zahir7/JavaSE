package test.main;
// �θ��� �̸��� ������ Ŀ�� Ŭ���� 
public class Couple {
	private String firstPerson;
	private String secondPerson;
	//������
	public Couple(){}
	public Couple(String firstPerson, String secondPerson) {
		super();
		this.firstPerson = firstPerson;
		this.secondPerson = secondPerson;
	}
	//setter,getter �޼ҵ�
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
