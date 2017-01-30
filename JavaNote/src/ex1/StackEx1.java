package ex1;

import java.util.Stack;

class StackEx1 {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push("naver");
		s.push("google");
		s.push("daum");
		System.out.println(s);		
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.empty());
		
	}
}
