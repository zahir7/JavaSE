package ex1;
import java.util.*;
import java.net.*;
public class InetAddress0 {
	public static void main(String[] args) throws Exception{
		String url = null;
		Scanner s = new Scanner(System.in);
		System.out.print("�� ����Ʈ �ּ� �Է� ==>");
		url = s.nextLine();
		InetAddress [] addr = InetAddress.getAllByName(url);
		System.out.println("==============================================");
		System.out.println(url+"��"+addr.length+"���� IP�ּҸ� ���� �ֽ��ϴ�.");
		for (int i = 0; i < addr.length; i++) {
			System.out.println("IP ��ȣ = " + addr[i].getHostAddress());
		}
	}
}
