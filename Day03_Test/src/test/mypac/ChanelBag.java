package test.mypac;

public class ChanelBag {
	
	public String[] items=new String[5];
	int index=0; //�迭�� �ε����� �����ϱ� ����
	public String color="������";
	//������ ���(Method �����)
	public void setItem(){
		System.out.println("��ǰ�� �����ؿ�!");
	}
	public void setItem(String item){
		if(index==5){
			System.out.println("���̻� ��ǰ�� �����Ҽ� �����ϴ�.");
			return;
		}
		//���ڷ� ���޹��� ���ڿ��� �迭�� �����ϱ�.
		items[index]=item;
		index = index + 1;
		System.out.println(item+" �� �����߽��ϴ�.");
	}
}









