package test.mypac2;

public class MainClass {
	public static void main(String[] args) {
		
		//CompactDisk °´Ã¼¸¦ »ý¼ºÇØº¸¼¼¿ä.
		String[] songList={"°î1","°î2","°î3","°î4","°î5"};
		
		String[] songList2=new String[3];
		songList2[0]="³ë·¡1";
		songList2[1]="³ë·¡2";
		songList2[2]="³ë·¡3";
		
		CompactDisk cd1=new CompactDisk(songList);
		CompactDisk cd2=new CompactDisk(songList2);
		
		//Audio °´Ã¼ »ý¼ºÇÏ±â
		Audio audio = new Audio(new Amp(), new Speaker());
		//¸Þ¼Òµå È£ÃâÇÏ±â.
		audio.playMusic(cd1);
		
	}
}


















