package test.main;

public class MainCalss04 {
	//���� �޼ҵ�
	public static void main(String[] args) {
		//�������� �����Ҽ� �ִ� �� 10��¥�� �迭��ü �����ϱ�
		int[] myNums=new int[10];
		//�޼ҵ� ȣ���ϸ鼭 �迭�� ������ �����ϱ�
		readValue(myNums); //call by reference
		//Ȯ�� for ���� �̿��ؼ� �迭�� ����� ���� ����غ���
		for(int tmp:myNums){
			System.out.println(tmp);
		}
	}
	
	//�޼ҵ� �߰�
	public static void readValue(int[] nums){
		for(int i=0 ; i<nums.length ;i++){
			nums[i]=999;
		}
	}
}








