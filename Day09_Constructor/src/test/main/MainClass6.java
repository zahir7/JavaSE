package test.main;

import test.mypac.Amp;
import test.mypac.Audio;
import test.mypac.CompactDisk;
import test.mypac.Speaker;

public class MainClass6 {
	//���� �޼ҵ�
	public static void main(String[] args) {
		//Audio ��ü 1���� �����غ�����.
		Audio audio=new Audio(new Amp(),new Speaker());
		String songName1="����";
		String songName2="Ŭ����";
		String songName3="��";
		
		CompactDisk disk1=new CompactDisk(songName1);
		CompactDisk disk2=new CompactDisk(songName2);
		CompactDisk disk3=new CompactDisk(songName3);
		
		//playMusic() �޼ҵ带 ȣ���غ�����
		audio.playMusic(disk2);
	}
}









