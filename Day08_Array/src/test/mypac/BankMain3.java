package test.mypac;

public class BankMain3 {
	//���α׷��� ������ �Ǵ� ���� �޼ҵ�
	public static void main(String[] args) {
		//Bank ��ü �����ϱ�
		Bank bank1 = new Bank(); //����Ʈ ������ ȣ���ϸ鼭 ��ü �����ϱ�.
		Bank bank2 = new Bank();
		Bank bank3 = new Bank();
		Bank bank4 = new Bank();
		Bank bank5 = new Bank();
		//Bank ��ü�� �����Ҽ� �ִ� �迭 ��ü �����ϱ�. �� : 5
		Bank[] bankList=new Bank[5];
		//������ �迭�� Bank ��ü ���.
		bankList[0]=bank1;
		bankList[1]=bank2;
		bankList[2]=bank3;
		bankList[3]=bank4;
		bankList[4]=bank5;
		
		//�迭�� ����Ǿ� �ִ� Bank ��ü�� name �ʵ忡 ����� �� ����ϱ�.
		for(int i=0 ; i < bankList.length ; i++){
			
			String savedName = bankList[i].name;
			System.out.println(i+" ��° �ε��� name: "+savedName);
		}
		System.out.println("---------------------");
		
		//2��° �ε����� �ִ� ��ü�� name �ʵ� ���� �ٲ��� ����غ���
		bank3.name="����ȣ����";
		//�迭�� ����Ǿ� �ִ� Bank ��ü�� name �ʵ忡 ����� �� ����ϱ�.
		for(int i=0 ; i < bankList.length ; i++){
			
			String savedName = bankList[i].name;
			System.out.println(i+" ��° �ε��� name: "+savedName);
		}
		
		Bank myBank=new Bank();
		
		Bank yourBank = new Bank();
		
		yourBank.setMoney();
		
		//yourBank = myBank;
	}
}









