package test.main;

import test.mypac.Human;
import test.mypac.Man;
import test.mypac.Woman;

public class MainClass01 {
	//���α׷��� ������ �Ǵ� ���� �޼ҵ�
	public static void main(String[] args) {
		//Human Ŭ������ �̿��ؼ� ��ü �����ϱ�
		Human human=new Human();
		human.say();
		
		//Man Ŭ������ �̿��ؼ� ��ü �����ϱ�
		Man man=new Man();
		man.say();
		man.fight();
		
		//Woman Ŭ������ �̿��ؼ� ��ü �����ϱ�
		Woman woman=new Woman();
		woman.makeup();
	}
}















