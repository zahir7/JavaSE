package test.mypac2;

public class MainClass {
	public static void main(String[] args) {
		
		//CompactDisk ��ü�� �����غ�����.
		String[] songList={"��1","��2","��3","��4","��5"};
		
		String[] songList2=new String[3];
		songList2[0]="�뷡1";
		songList2[1]="�뷡2";
		songList2[2]="�뷡3";
		
		CompactDisk cd1=new CompactDisk(songList);
		CompactDisk cd2=new CompactDisk(songList2);
		
		//Audio ��ü �����ϱ�
		Audio audio = new Audio(new Amp(), new Speaker());
		//�޼ҵ� ȣ���ϱ�.
		audio.playMusic(cd1);
		
	}
}


















