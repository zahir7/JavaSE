package ex1;

import java.util.LinkedList;

public class QueueEx {
	public static void main(String[] args) {
		String[] item = {"�ҳ�Ÿ","������","���Ծ�"};
		LinkedList<String> q = new LinkedList<String>();
		for(String n : item)
			q.offer(n); //����߰�
		System.out.println("q�� ũ�� :" + q.size());
		String data ="";
		while((data = q.poll()) != null){
			System.out.println(data + " ����!");
			System.out.println("q�� ũ��:"+q.size());
		}
	}
}


