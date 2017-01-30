package test.main;

import java.util.Stack;

/*
 *  [[ Stack Class ]] 
 *  
 *  -스텍의 구조 : 선입후출 형태
 */
public class MainClass01 {
	private int a;
	
	
	MainClass01(int a){
		this.a = a;
		String[] aaa = {"aa" , "bb"};
		
	}
	
	
	public static void main(String[] args) {
		//Stack 객체 생성하기
		Stack<String> stack=new Stack<String>();	
		
		
		//생성한 객체에 자료 저장하기
		stack.push("김태호");
		stack.push("홍길동");
		stack.push("나야나");
		
		//현재 저장하고 있는 데이터의 갯수를 출력하면
		System.out.println("데이터의 갯수:"+stack.size());
		
		//데이터 하나씩 빼오기
		System.out.println("1:"+stack.pop());
		System.out.println("2:"+stack.pop());
		System.out.println("3:"+stack.pop());
		//System.out.println("4:"+stack.pop());
		//현재 남은 데이터의 갯수는?
		System.out.println("데이터의 갯수:"+stack.size());
		//다시 데이터를 저장한후
		stack.push("김태호");
		stack.push("홍길동");
		stack.push("나야나");
		//가장위에 있는 데이터를 출력하려면
		System.out.println("가장 위에 있는 데이터:"+stack.peek());
		//저장된 모든 데이터를 pop() 하면서 출력해보기
		while(!stack.empty()){
			String name=stack.pop();
			System.out.println("pop 한 데이터:"+name);
		}
		
	}
}











