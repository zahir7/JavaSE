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
		jbtn = new JButton("����");
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
		
		
		//�̺�Ʈ ���  => Window(JFrame) => X�� ������ �� �̺�Ʈó��
		jframe.addWindowListener(
				new WindowAdapterDelegator());
		//�̺�Ʈ ���  => JTextField => ����Ű�� ������ �� �̺�Ʈó�� 
		jtf.addActionListener(this);
		//�̺�Ʈ ��� => JButton => Ŭ������ �� �̺�Ʈ ó��
		jbtn.addActionListener(this);
		
		//�����Ұ�
		jta.setEditable(false);
		//JFrame�� ����� �°� ũ�⸦ �ڵ����� ����.
		jframe.pack();
		//JFream ������ ���� �Ұ�
		jframe.setResizable(true);
		jframe.setVisible(true);
		
	}
	
	
	
	
	
	class WindowAdapterDelegator extends WindowAdapter{
		//Swing���� X�� ������ �� �߻��ϴ� �̺�Ʈ
		public void windowClosing(WindowEvent e){
			try {
				//client => server
				//���� �޼����� ������.(2#id)
				bw.write("2#"+id);
				bw.newLine();
				bw.flush();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
	}
	
	//JTextField���� ����Ű�� ������ ���� JButton�� Ŭ���� ��
	public void actionPerformed(ActionEvent e){
		//�̺�Ʈ�� ������ ��ü(JTextField,JButton)
		Object obj = e.getSource();
		//�ؽ��ʵ忡 �Է��� ���ڵ�
		String msg = jtf.getText();
		//�̺�Ʈ�� ������ ��ü�� �ؽ�Ʈ �ʵ�(jtf)���� ��ư(jbtn)������ ��
		if(obj == jtf || obj == jbtn){
			
			if(jtf.getText()==null || 
					jtf.getText().length()==0)
				return;
			
			try {
				// client => server
				// �Ϲݸ޼���(1#id#message)
				bw.write("1#"+id+ "#" + msg);
				bw.newLine();
				bw.flush();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			//�Է��� ���� ����.
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
		
		//�������� �޼����� �����ϱ����� �ʿ��� ������ Ŭ����
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


