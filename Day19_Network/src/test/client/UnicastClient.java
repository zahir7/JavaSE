package test.client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class UnicastClient implements ActionListener{
	private Socket socket;
	private BufferedReader br;
	private BufferedWriter bw;
	private JFrame jframe;
	private JTextArea jta;
	private JTextField jtf;
	private JLabel jlb1,jlb2;
	private JPanel jp1,jp2;
	private String ip;
	private String id;
	private JButton jbtn;
	public UnicastClient(String ip, String id) 
			throws IOException{
		this.ip = ip;
		this.id = id;
		jframe = new JFrame("Unicast Chatting");
		
		jtf = new JTextField(30);
		jbtn = new JButton("전송");
		jp1 = new JPanel();
		jp1.setLayout(new BorderLayout());
		jp1.add(jtf, BorderLayout.CENTER);
		jp1.add(jbtn,BorderLayout.EAST);
		jframe.add(jp1,BorderLayout.SOUTH);
		
		
		jlb1 = new JLabel("Usage ID : ["+id+"]");
		jlb2 = new JLabel("IP : "+ip);
		jp2 = new JPanel();
		jp2.setLayout(new BorderLayout());
		jp2.add(jlb1,BorderLayout.WEST);
		jp2.add(jlb2,BorderLayout.EAST);
		jframe.add(jp2,BorderLayout.NORTH);
		
		
		jta = new JTextArea("",10,50);
		jta.setBackground(Color.pink);
		JScrollPane jsp = new JScrollPane(jta,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		jframe.add(jsp,BorderLayout.CENTER);
		
		
		//이벤트 등록  => Window(JFrame) => X을 눌렀을 때 이벤트처리
		jframe.addWindowListener(
				new WindowAdapterDelegator());
		//이벤트 등록  => JTextField => 엔터키를 눌렀을 때 이벤트처리 
		jtf.addActionListener(this);
		//이벤트 등록 => JButton => 클릭했을 때 이벤트 처리
		jbtn.addActionListener(this);
		
		//수정불가
		jta.setEditable(false);
		//JFrame의 사이즈에 맞게 크기를 자동으로 정함.
		jframe.pack();
		//JFream 사이즈 변경 불가
		jframe.setResizable(true);
		jframe.setVisible(true);
		
	}
	
	
	
	
	
	class WindowAdapterDelegator extends WindowAdapter{
		//Swing에서 X를 눌렀을 때 발생하는 이벤트
		public void windowClosing(WindowEvent e){
			try {
				//client => server
				//종료 메세지를 보낸다.(2#id)
				bw.write("2#"+id);
				bw.newLine();
				bw.flush();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
	}
	
	//JTextField에서 엔터키를 눌렀을 때와 JButton을 클릭할 때
	public void actionPerformed(ActionEvent e){
		//이벤트를 실행한 객체(JTextField,JButton)
		Object obj = e.getSource();
		//텍스필드에 입력한 문자들
		String msg = jtf.getText();
		//이벤트를 실행한 객체가 텍스트 필드(jtf)인지 버튼(jbtn)인지를 비교
		if(obj == jtf || obj == jbtn){
			
			if(jtf.getText()==null || 
					jtf.getText().length()==0)
				return;
			
			try {
				// client => server
				// 일반메세지(1#id#message)
				bw.write("1#"+id+ "#" + msg);
				bw.newLine();
				bw.flush();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			//입력한 내용 삭제.
			jtf.setText("");
		}
	}
	
	private void initSocket() throws  IOException{
		socket = new Socket(ip,3000);
		br = new BufferedReader(
				new InputStreamReader(
						socket.getInputStream()));
		bw = new BufferedWriter(
				new OutputStreamWriter(
						socket.getOutputStream()));
		
		//서버에서 메세지를 수신하기위해 필요한 쓰레드 클래스
		UnicastClientThread uct = 
				new UnicastClientThread(this);
		
		uct.start();
		
	}
	
	public void exit(){
		System.exit(0);
	}
	public void closeAll(){
		try {
			if(socket != null)socket.close();
			if(br != null) br.close();
			if(bw != null) br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public BufferedReader getBufferedReader(){
		return br;
	}
	public JTextArea getJTextArea(){
		return jta;
	}
	public String getId(){
		return id;
	}
	
	
	
	
	
	
	
	public static void main(String[] args) throws IOException {
		JFrame.setDefaultLookAndFeelDecorated(true);
		UnicastClient ucc = new UnicastClient(
				"192.168.0.157","syh2022");
		ucc.initSocket();
	}
	
	
	
	
}


