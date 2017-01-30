package test.server;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
public class ZipcodeServer {
	private ServerSocket serverSocket;
	private Socket socket ;
	public ZipcodeServer(int port){
		try {
			serverSocket = new ServerSocket(port);
		} catch (IOException e) {
			// TODO: handle exception
		}
		while(true){
			System.out.println("Ŭ���̾�Ʈ ���� �����...");
			try {
				socket = serverSocket.accept();
				
				System.out.println("Ŭ���̾�Ʈ ����("+
				socket.getInetAddress().getHostAddress()+")");
				
				ZipcodeServerThread ust = 
						new ZipcodeServerThread(this);
				Thread t = new Thread(ust);
				t.start();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public Socket getSocket(){
		return socket;
	}
	public static void main(String[] args) {
		new ZipcodeServer(3000);
	}
}
