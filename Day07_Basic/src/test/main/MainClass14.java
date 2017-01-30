package test.main;

public class MainClass14 {
	//프로그램의 시작이 되는 메인 메소드
	public static void main(String[] args) {
		String[] names={"박수혁","백지원","조정아","한봉수","박민수",
				"임정미","이재경","김슬기","김상규","노성일",
				"김태호","김연중","주용군","김용희","정정선",
				"정아람","이현진","조성훈","조강현","김효성","이준규"};
		//반복문 돌면서 모든 학생의 이름을 출력해보세요!
		for(int i=0 ; i < 21 ; i++){
			System.out.print( names[i]+" " );
		}
		System.out.println();//개행하기
		
		for(int i=0 ; i < names.length ; i++){
			System.out.print( names[i]+" " );
		}
		System.out.println();
		//확장 for 문을 이용해서 출력하기
		//for(배열에 저장되어 있는 데이터 형 tmp : 배열객체)
		for(String tmp : names){
			System.out.print(tmp+" ");
		}
		
	}
}





















