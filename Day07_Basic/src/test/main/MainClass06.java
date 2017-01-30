package test.main;

public class MainClass06 {
	public static void main(String[] args) {
		final int SOUND_FIRE=0;
		final int SOUND_BOMB=1;
		final int SOUND_FLY=2;
		
		int effect=SOUND_FLY; //À½ÇâÈ¿°úÀÇ Á¾·ù Á¤ÇÏ±â
		
		if(effect==SOUND_FIRE){
			System.out.println("»ß¿ë»ß¿ë");
		}else if(effect==SOUND_BOMB){
			System.out.println("ÆãÆã");
		}else if(effect==SOUND_FLY){
			System.out.println("½¹½¹");
		}
	}
}
