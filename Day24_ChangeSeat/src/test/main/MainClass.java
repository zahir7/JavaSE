package test.main;

import java.util.ArrayList;
import java.util.Random;

/*
 * 우리반 학생 20명의 이름을 배열에 순서대로 넣은후
 * 무작위로 섞은 다음 두명씩 추출하는 프로그램 만들기
 */
public class MainClass {
	public static void main(String[] args) {
		//20명의 이름이 들어있는 배열객체 만들기
		String[] ourClass={"조정아","한봉수","김태호","노성일","김상규",
						"김슬기","이재경","임정미","정아람","정다솜",
						"정정선","김용희","주용군","김연중","이준규",
						"김효선","조강현","박수형","조성훈","이현진"};
		//Random 객체 생성하기
		Random ran=new Random();
		//반복문 돌면서 섞기(Shuffling)
		for(int i=0 ; i < 20 ; i++){
			//랜덤수 발생 시키기 (0 ~ 19 사이의 정수)
			int ranNum = ran.nextInt(20);
			//현재 인덱스에 있는 이름과 랜덤으로 발생한 인덱스의 이름 바꾸기
			String tmp = ourClass[i]; //바꿀이름을 임시변수에 저장
			ourClass[i] = ourClass[ranNum]; //현재 인덱스에 바꿀이름 저장
			ourClass[ranNum] = tmp ; //바꾼 이름에 임시변수에 있는 이름저장
		}
		//커플객체를 저장할 가변 배열 생성하기
		ArrayList<Couple> coupleList=new ArrayList<Couple>();
		//두명씩 커플링하기
		for(int i=0 ; i < 10 ; i++){
			//한 커플의 정보를 담을 객체 생성하기
			Couple c=new Couple();
			//커플의 맴버필드에 값 저장하기
			c.setFirstPerson(ourClass[i]);
			c.setSecondPerson(ourClass[i+10]);
			//생성한 커플객체를 배열에 저장하기
			coupleList.add(c);
		}
		//10 개의 커플객체를 반복문 돌면서 출력해보기
		for(int i=0 ; i < 10 ; i++){
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			String name1 = coupleList.get(i).getFirstPerson();
			String name2 = coupleList.get(i).getSecondPerson();
			System.out.println(i+1+" 번 커플: "+name1+" / "+name2);
		}
	}
}

















