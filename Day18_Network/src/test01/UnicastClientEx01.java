package test01;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class UnicastClientEx01 {
	Socket socket = null;
	BufferedReader br = null;
	BufferedWriter bw = null;
	BufferedReader keyboard = null;
	
	public UnicastClientEx01(){
		try {
			socket = new Socket("localhost", 3000);
		} catch (UnknownHostException e) {
			System.out.println("������ ã�� �� �����ϴ�.");
			System.exit(0);
		} catch (IOException e){
			System.out.println("������ ������ �� �����ϴ�.");
			System.exit(0);
		}
		
		try {
			// Keyboard �� ����� ��Ʈ�� ���
			keyboard = new BufferedReader(new InputStreamReader(System.in));
			// socket ���κ��� Stream ���
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// ������ �޼��� �ְ� �ޱ�
			while(true){
				// Ű���� �Է³��� �б�
				System.out.println("���� �޽��� : ");
				String msg = keyboard.readLine();
				// �޼��� ������ ���� 
				bw.write(msg + "\n"); 
				bw.flush();
				// ������ ������ �޼��� ����
				String getMsg = br.readLine();
				System.out.println("���� �޽��� : " + getMsg);
				
			}
			
		} catch (IOException e) {
			System.out.println("�������� ������ ���������ϴ�.");
			System.exit(0);
			
		}
	}
	public static void main(String[] args) {
		new UnicastClientEx01();
	}
}
