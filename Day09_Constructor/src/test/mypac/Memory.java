package test.mypac;

public class Memory {
	//�޸� ������ �� ������ �ʵ�
	private String company;
	private int size;
	//������
	public Memory(String _company, int _size){
		//���ڷ� ������ ���� �ڽ��� �ɹ� �ʵ忡 �����ϱ�.
		company=_company;
		size=_size;
	}
	//�޼ҵ�
	public String getCompany(){
		return company;
	}
	//�޸��� ũ�⸦ �����ϴ� �޼ҵ�
	public int getSize(){
		return size;
	}
}


