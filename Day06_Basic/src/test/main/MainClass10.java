package test.main;
/*
 * ��� �����ڸ� �̿��� ����
 */
public class MainClass10 {
	public static void main(String[] args) {
		int kor=100;//���� ����
		int eng=97; //��������
		int sum=kor+eng;
		
		//����� ���ϱ� ���ؼ��� �Ǽ��� ���������� �ʿ��ϴ�.
		double ave1 = sum / 2;
		double ave2 = sum / 2.0;
		double ave3 = ((double)sum) / 2;
		//����غ���
		System.out.println("����:"+sum);
		System.out.println("ave1:"+ave1);
		System.out.println("ave2:"+ave2);
		System.out.println("ave3:"+ave3);
	}
}






