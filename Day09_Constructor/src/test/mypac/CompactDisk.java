package test.mypac;

public class CompactDisk {
	private String songName;
	//생성자
	public CompactDisk(String songName){
		//생성자로 전달 받은 곡명을 맴버 필드에 저장한다.
		this.songName=songName;
	}
	//노래 제목을 리턴하는 메소드
	public String getSongName(){
		
		return songName;
	}
}
