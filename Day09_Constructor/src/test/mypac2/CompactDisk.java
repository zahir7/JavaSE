package test.mypac2;

public class CompactDisk {
	//�뷡 ����� ������ �迭��ü
	private String[] songList;
	//������
	public CompactDisk(String[] songList){
		//���ڷ� ���޹��� �뷡����� �ɹ� �ʵ忡 �����Ѵ�.
		this.songList=songList;
	}
	//�뷡 ������ �����ϴ� �޼ҵ�
	public String[] getSongList(){
		
		return songList; //�뷡 ��� �����ϱ�.
	}
}
