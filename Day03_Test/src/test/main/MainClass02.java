package test.main;

public class MainClass02 {
	
	public static void main(String[] args) {
		//우리가 만든 기능 사용하기
		MusicPlayer.playMusic();
		MusicPlayer.playMusic("베토벤 소나타");
		MusicPlayer.playMusicLooped("에튀드", 10);
		test();
	}
	
	public static void test(){
		
	}
}
