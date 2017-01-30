package test.main;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import test.mypack.Customer;

public class MainClass02 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("c:\\object.ser");
			//IO Filtering ��ü�� ������ȭ ��Ű�� Ŭ����
			ois = new ObjectInputStream(fis);
			
			//readObject() ������ȭ �޼���
			Customer c = (Customer)ois.readObject();
			
			System.out.println(c);
			
		} catch (IOException e) {
			// TODO: handle exception
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(fis != null) fis.close();
				if(ois != null) ois.close();
			} catch (IOException e) {

			}
		}
	}
}
