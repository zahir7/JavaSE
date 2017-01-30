package test.mypac5;

public class MainClass {
	public static void main(String[] args) {
		//Child 클래스를 이용해서 객체 생성하기
		Child child1=new Child();
		Parent child2=new Child();
		GrandParent child3=new Child();
		Object child4=new Child();
		child1.play();
		child1.eat();
		child2.eat();
		child3.eat();
		
		System.out.println(child1.name);
		System.out.println(child2.name);
		System.out.println(child3.name);
		
		Parent p=new Parent();
		p.eat();
		
	}
}





