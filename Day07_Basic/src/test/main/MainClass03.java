package test.main;
/*
 * 여러가지 형태의 if 문 사용하기.
 */
public class MainClass03 {
	public static void main(String[] args) {
		int point=75;
		String str=null;
		
		if(point >= 90){
			str="수";
		}else if(point >= 80){
			str="우";
		}else if(point >= 70){
			str="미";
		}else if(point >= 60){
			str="양";
		}else{
			str="가";
		}//if
		System.out.println("성적:"+str);
	}//main()
}//class






