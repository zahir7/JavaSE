package test.main;

public class MusicPlayer {
	
	//음악을 재생하는 메소드 만들기
	public static void playMusic(){
		System.out.println("쇼팽 녹턴을 연주해요!");
	}
	public static void playMusic(String song){
		System.out.println(song+" 를(을) 연주해요!");
	}
	public static void playMusicLooped(String song,int num){
		System.out.println(song+"를(을) "+num+" 번 연주해요!");
	}
}
