package test.mypac;

public class Car {
	//������ �õ��� �ɷȴ��� �����ϴ� ����ʵ�
	private boolean isEngineStarted=false;
	//������ 
	public Car(){
		//�ʱ�ȭ �� �۾��� ������ �ʱ�ȭ�� �ϸ� �ȴ�.
		isEngineStarted=true;
	}
	//�ɹ� �޼ҵ�
	public void drive(){
		if(isEngineStarted){
			System.out.println("���� ��������!");
		}else{
			System.out.println("������ ���� �־ �����ϼ��� �����!");
		}
	}
	//������ ���� ��Ű�� �޼ҵ�
	public void stopEngine(){
		isEngineStarted=false;
		System.out.println("������ �������ϴ�.");
	}
	//������ �ٽ� �Ѵ� �޼ҵ� �� ����� ������.startEngine()
	public void startEngine(){
		isEngineStarted=true;
		System.out.println("������ �������ϴ�.");
	}
}

















