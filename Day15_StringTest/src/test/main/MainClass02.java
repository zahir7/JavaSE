package test.main;
/*
 * ���ڿ�(String) ��  ��� ��ȭ��Ű�ų� ������ �����̰��� �Ҷ���
 * 
 * [[ StringBuilder , StringBuilder Class ]] �� ����Ѵ�.
 * 
 */
public class MainClass02 {
	public static void main(String[] args) {
		//StringBuilder ��ü �����ϱ�
		StringBuilder sBuff=new StringBuilder();
		//���ڿ� �߰��ϱ�
		sBuff.append("����ȣ");
		sBuff.append(" ������");
		sBuff.append("!");
		//����� ���ڿ� �о����
		String msg=sBuff.toString();
		//����غ���
		System.out.println(msg);
		
		//StringBuilder ��ü �����ϱ�.
		StringBuilder sbuilder=new StringBuilder();
		sbuilder.append(msg); //���ڿ� �߰�
		
		for(int i=0 ; i<100 ; i++){
			sbuilder.append(i);
		}
		//����� ���ڿ� ����غ���.
		System.out.println(sbuilder.toString());
	}
}











