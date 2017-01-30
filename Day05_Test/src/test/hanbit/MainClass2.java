package test.hanbit;

public class MainClass2 {
	public static void main(String[] args) {
		OurClass our=new OurClass();
		//주소 알아오기
		String addr = our.getAddr("이현진");
		System.out.println("검색된 주소:"+addr);
	}
}
