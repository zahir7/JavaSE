package test.main;

import test.mypac.Amp;
import test.mypac.Audio;
import test.mypac.CompactDisk;
import test.mypac.Speaker;

public class MainClass6 {
	//메인 메소드
	public static void main(String[] args) {
		//Audio 객체 1개를 생성해보세요.
		Audio audio=new Audio(new Amp(),new Speaker());
		String songName1="가요";
		String songName2="클래식";
		String songName3="팝";
		
		CompactDisk disk1=new CompactDisk(songName1);
		CompactDisk disk2=new CompactDisk(songName2);
		CompactDisk disk3=new CompactDisk(songName3);
		
		//playMusic() 메소드를 호출해보세요
		audio.playMusic(disk2);
	}
}









