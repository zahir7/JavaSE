package test.main;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import test.mypack.Customer;

public class MainClass01 {
	public static void main(String[] args) {
		Customer c = new Customer(
				"김태호","zahir7@naver.com");
		
		ObjectOutputStream oos = null;
		FileOutputStream fos = null;
		try {
			//객체를 직렬화하기 위한 파일을 생성한다.
			//이때 직렬화할 확장자는  관례적으로 ser로 생성한다. 
			fos = new FileOutputStream("c:\\object.ser");
			//IO Filtering => 객체를 직렬화 하기위한 클래스
			oos = new ObjectOutputStream(fos);
			// 직렬화 메서드 
			// c는 반드시 Serializable 구현한 클래스이어야 한다.
			// Serializable 구현하지 않게 되면 NotSerializableException 
			// 예외가 발생한다.
			oos.writeObject(c);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos != null) fos.close();
				if(oos != null) oos.close();
			} catch (IOException e) {

			}
		}
	}
}
