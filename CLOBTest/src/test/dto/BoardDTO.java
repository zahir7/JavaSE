package test.dto;

public class BoardDTO {
	private int num;
	private String title;
	private String content;
	private String regdate;
	//디폴트 생성자 만들기
	public BoardDTO(){}
	public BoardDTO(int num, String title, String content, String regdate) {
		
		this.num = num;
		this.title = title;
		this.content = content;
		this.regdate = regdate;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
}
