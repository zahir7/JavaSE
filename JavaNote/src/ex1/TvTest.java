package ex1;

// �ϳ��� �߻�޼��尡 ������ �� Ŭ������ �߻�Ŭ������ �Ǿ�� �Ѵ�.
// �̿ϼ��� �߻�Ŭ������ ��ü�� ������ �� ����.
// �߻�Ŭ������ �̿ϼ��� ���赵.

abstract class Tv01{
	int x = 100;
	abstract void channelUp(); //�����
	/*
	void channelUp(){ //�����
		//.. ������  {} <-- �߰�ȣ ��ü�� �����ζ���Ѵ�. 
	}
	*/
}

// ��ӹ��� �ڼ�Ŭ������ ����Ŭ������ �������ִ� �߻�ż��带 �ݵ��!! �������̵� �ؾ��Ѵ�.
class VideoTv extends Tv01{
	@Override
	void channelUp() {
		
	}
}

public class TvTest {
	public static void main(String[] args) {		
	}
}