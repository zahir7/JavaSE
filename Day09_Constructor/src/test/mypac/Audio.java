package test.mypac;
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
		//cd ��ü�� �ɹ� �ʵ忡 ����� ����� ���´�.
		String songName=cd.getSongName();
		System.out.println(songName+" ��(��) ����ؿ�!");
	}
}














