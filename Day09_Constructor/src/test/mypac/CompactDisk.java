package test.mypac;

public class CompactDisk {
	private String songName;
	//������
	public CompactDisk(String songName){
		//�����ڷ� ���� ���� ����� �ɹ� �ʵ忡 �����Ѵ�.
		this.songName=songName;
	}
	//�뷡 ������ �����ϴ� �޼ҵ�
	public String getSongName(){
		
		return songName;
	}
}
