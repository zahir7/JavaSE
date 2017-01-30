package ex1;
import java.util.*;
import java.net.*;
public class InetAddress0 {
	public static void main(String[] args) throws Exception{
		String url = null;
		Scanner s = new Scanner(System.in);
		System.out.print("웹 사이트 주소 입력 ==>");
		url = s.nextLine();
		InetAddress [] addr = InetAddress.getAllByName(url);
		System.out.println("==============================================");
		System.out.println(url+"는"+addr.length+"개의 IP주소를 갖고 있습니다.");
		for (int i = 0; i < addr.length; i++) {
			System.out.println("IP 번호 = " + addr[i].getHostAddress());
		}
	}
}
