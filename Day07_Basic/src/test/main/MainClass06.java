package test.main;

public class MainClass06 {
	public static void main(String[] args) {
		final int SOUND_FIRE=0;
		final int SOUND_BOMB=1;
		final int SOUND_FLY=2;
		
		int effect=SOUND_FLY; //����ȿ���� ���� ���ϱ�
		
		if(effect==SOUND_FIRE){
			System.out.println("�߿�߿�");
		}else if(effect==SOUND_BOMB){
			System.out.println("����");
		}else if(effect==SOUND_FLY){
			System.out.println("����");
		}
	}
}
