package test.server;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class ZipcodeServerThread implements Runnable{
	private InputStreamReader isr;
	private OutputStreamWriter osw;
	private ZipcodeServer zs;
	public ZipcodeServerThread(ZipcodeServer zs){
		this.zs = zs;
	}
	public void run(){
		boolean isStop = false;
		try {
			isr =new InputStreamReader(
						zs.getSocket().getInputStream());
			osw = new OutputStreamWriter(
							zs.getSocket().getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
			isStop = true;
		}
		char[] c = new char[100];
		ZipcodeDao dao = new ZipcodeDao();
		while(!isStop){
			try {
				int readCharCnt = isr.read(c);       
				String dong = new String(c,0,readCharCnt);
				String result = dao.select(dong);
				
				osw.write(result);
				osw.flush();
			} catch (IOException e) {				
				isStop = true;
			}
		}
	}
}
