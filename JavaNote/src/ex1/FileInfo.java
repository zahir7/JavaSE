package ex1;
import java.io.*;
import java.util.*;
public class FileInfo {
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		System.out.print("���ϰ��>>");
		String path = s.nextLine();
		File file = new File(path);
		System.out.println(path + "������ ������");
		System.out.println("������ :" + file.getAbsolutePath());
		System.out.println("������ : " + new Date(file.lastModified()));
		System.out.println("����ũ�� : " + file.length());
		System.out.println("�б�Ӽ� : " + file.canRead());
		System.out.println("����Ӽ� : " + file.canWrite());
		System.out.println("���ϰ�� : " + file.getParent());
		System.out.println("����Ӽ� : " + file.isHidden());				
	}

}
