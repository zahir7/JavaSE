package ex1;

abstract class Diagram{
	abstract void draw();	
}

//private�� ���� �� �� ���� ���� :
//�ڽ��� �������̵� �ؾ��ϴµ� ���ϰ� �ȴ�.
//static���� ���� �� �� ���� ����:
//��ü ���̵� ȣ���� �Ǵ� �޼ҵ� �̹Ƿ� �ݵ�� body��
//���� �Ǿ�� Ŭ����.�޼���() �������� ȣ�� �� �� �ִ�.

class Triangle extends Diagram{
	void draw(){
		System.out.println("�ﰢ���� �׸���.");
	}
}
class Rectangle extends Diagram{
	void draw(){
		System.out.println("�簢���� �׸���.");
	}
}
class Circle extends Diagram{
	void draw(){
		System.out.println("���� �׸���.");
	}
}
public class UseDraw {
	public static void main(String[] args) {
		Diagram[] ref = new Diagram[3];
		ref[0] = new Triangle();
		ref[1] = new Circle();
		ref[2] = new Rectangle();
		for (int i = 0; i < ref.length; i++) {
			ref[i].draw();
		}
	}
}