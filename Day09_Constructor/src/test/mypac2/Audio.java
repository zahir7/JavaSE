package test.mypac2;
// CD �� ����Ҽ� �ִ� ������ ����� ��ü �����.
public class Audio {
	private Amp amp;
	private Speaker spk;
	//������ ���� �ϱ�
	public Audio(Amp amp,Speaker spk){
		//�����ڷ� ���� ���� ���ڸ� �ɹ� �ʵ忡 �����ϱ�
		this.amp=amp;
		this.spk=spk;
	}
	//�޼ҵ� �����
	public void playMusic(CompactDisk cd){
		//���ڷ� ���޵� ��ü�� �뷡 ���(String[]) ������
		String[] songList = cd.getSongList();
		//�ݺ��� ���鼭 �뷡 ����ϱ�.
		for(int i=0 ; i < songList.length ; i++){
			
			System.out.println( songList[i]+" ��(��) ����ؿ�! ");
		}
	}
}














