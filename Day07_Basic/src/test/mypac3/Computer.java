package test.mypac3;

public class Computer {
	
	public String cpu; //�߾�ó�� ��ġ
	public String memory; //�޸�
	//����Ʈ ������
	public Computer(){} 
	//������
	public Computer(String cpu,String memory){
		this.cpu=cpu;
		this.memory=memory;
	}
	//�޼ҵ�
	public void calc(){
		if(cpu==null || memory==null){
			System.out.println("cpu Ȥ�� memory �� �����!");
			return; //�޼ҵ带 ������
		}
		System.out.println("����� �ؿ�");
	}
	
}









