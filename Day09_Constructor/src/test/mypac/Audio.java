package test.mypac;
// CD 를 재생할수 있는 가상의 오디오 객체 만들기.
public class Audio {
	private Amp amp;
	private Speaker spk;
	//생성자 정의 하기
	public Audio(Amp amp,Speaker spk){
		//생성자로 전달 받은 인자를 맴버 필드에 저장하기
		this.amp=amp;
		this.spk=spk;
	}
	//메소드 만들기
	public void playMusic(CompactDisk cd){
		//cd 객체의 맴버 필드에 저장된 곡명을 얻어온다.
		String songName=cd.getSongName();
		System.out.println(songName+" 을(를) 재생해요!");
	}
}














