package test.mypack;

public class BoardVo {
	private int num;
	private String writer;
	private String title;
	private String content;
	private String pwd;
	private int hit;
	private String regdate;
	private String flag;
	private String ip;
	public BoardVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public BoardVo(String writer, String title, String content, String pwd) {
		super();
		this.writer = writer;
		this.title = title;
		this.content = content;
		this.pwd = pwd;
	}

	
	public BoardVo(int num, String writer, String title, String content,
			String pwd, int hit, String regdate) {
		super();
		this.num = num;
		this.writer = writer;
		this.title = title;
		this.content = content;
		this.pwd = pwd;
		this.hit = hit;
		this.regdate = regdate;
	}

	public BoardVo(int num, String writer, String title, String content,
			String pwd, int hit, String regdate, String flag, String ip) {
		super();
		this.num = num;
		this.writer = writer;
		this.title = title;
		this.content = content;
		this.pwd = pwd;
		this.hit = hit;
		this.regdate = regdate;
		this.flag = flag;
		this.ip = ip;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
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
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	
	
	
	
}
