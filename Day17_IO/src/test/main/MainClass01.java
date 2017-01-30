package test.main;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import test.mypack.Customer;

public class MainClass01 {
	public static void main(String[] args) {
		Customer c = new Customer(
				"����ȣ","zahir7@naver.com");
		
		ObjectOutputStream oos = null;
		FileOutputStream fos = null;
		try {
			//��ü�� ����ȭ�ϱ� ���� ������ �����Ѵ�.
			//�̶� ����ȭ�� Ȯ���ڴ�  ���������� ser�� �����Ѵ�. 
			fos = new FileOutputStream("c:\\object.ser");
			//IO Filtering => ��ü�� ����ȭ �ϱ����� Ŭ����
			oos = new ObjectOutputStream(fos);
			// ����ȭ �޼��� 
			// c�� �ݵ�� Serializable ������ Ŭ�����̾�� �Ѵ�.
			// Serializable �������� �ʰ� �Ǹ� NotSerializableException 
			// ���ܰ� �߻��Ѵ�.
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
