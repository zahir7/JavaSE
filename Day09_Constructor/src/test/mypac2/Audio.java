package test.mypac2;
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
		//인자로 전달된 객체의 노래 목록(String[]) 얻어오기
		String[] songList = cd.getSongList();
		//반복문 돌면서 노래 재생하기.
		for(int i=0 ; i < songList.length ; i++){
			
			System.out.println( songList[i]+" 를(을) 재생해요! ");
		}
	}
}














