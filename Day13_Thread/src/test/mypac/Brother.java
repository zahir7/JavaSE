package test.mypac;

public class Brother extends Thread{
	public Wallet wallet; //���� ��ü
	public int money; //�����ѵ��� ������ ����
	//�����ڿ��� ������ �������� �޾ƿͼ� �ʵ忡 �����Ѵ�.
	public Brother(Wallet wallet){
		this.wallet=wallet;
	}
	//������ ��ü
	@Override
	public void run() {
		while(true){
			//�������� ���� �����ؼ� �����Ѵ�.
			int returnedMoney=wallet.getMoney();
			if(returnedMoney==0)break;//������ ��� �ݺ��� ����
			money=money+returnedMoney;//�����ѵ� �ʵ忡 ����
		}
		System.out.println("Brother �� ���:"+money);
	}
}







