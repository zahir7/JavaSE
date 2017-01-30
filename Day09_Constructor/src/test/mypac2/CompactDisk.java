package test.mypac2;

public class CompactDisk {
	//노래 목록을 저장할 배열객체
	private String[] songList;
	//생성자
	public CompactDisk(String[] songList){
		//인자로 전달받은 노래목록을 맴버 필드에 저장한다.
		this.songList=songList;
	}
	//노래 제목을 리턴하는 메소드
	public String[] getSongList(){
		
		return songList; //노래 목록 리턴하기.
	}
}
