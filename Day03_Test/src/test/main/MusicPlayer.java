package test.main;

public class MusicPlayer {
	
	//������ ����ϴ� �޼ҵ� �����
	public static void playMusic(){
		System.out.println("���� ������ �����ؿ�!");
	}
	public static void playMusic(String song){
		System.out.println(song+" ��(��) �����ؿ�!");
	}
	public static void playMusicLooped(String song,int num){
		System.out.println(song+"��(��) "+num+" �� �����ؿ�!");
	}
}
