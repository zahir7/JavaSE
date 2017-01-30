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
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
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
	public UnicastClient(String ip, String id) throws IOException{
		this.ip = ip;
		this.id = id;
		jframe = new JFrame("Unicast Chatting");
		jtf = new JTextField(30);
		jta = new JTextArea("",10,50);
		jlb1 = new JLabel("Usage ID : ["+id+"]");
		jlb2 = new JLabel("IP : "+ip);
		jbtn = new JButton("Àü¼Û");
		jp1 = new JPanel();
		jp2 = new JPanel();
		jlb1.setBackground(Color.yellow);
		jlb2.setBackground(Color.green);
		jta.setBackground(Color.pink);
		jp1.setLayout(new BorderLayout());
		jp2.setLayout(new BorderLayout());
		jp1.add(jbtn,BorderLayout.EAST);
		jp1.add(jtf, BorderLayout.CENTER);
		
		jp2.add(jlb1,BorderLayout.CENTER);
		jp2.add(jlb2,BorderLayout.EAST);
		
		jframe.add(jp1,BorderLayout.SOUTH);
		jframe.add(jp2,BorderLayout.NORTH);
		
		JScrollPane jsp = new JScrollPane(jta,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		jframe.add(jsp,BorderLayout.CENTER);
		jframe.addWindowListener(new WindowAdapterDelegator());
		
		jtf.addActionListener(this);
		jbtn.addActionListener(this);
		
		jta.setEditable(false);
		jframe.pack();
		jframe.setResizable(false);
		jframe.setVisible(true);
		
	}
	class WindowAdapterDelegator extends WindowAdapter{
		public void windowClosing(WindowEvent e){
			try {
				bw.write("2#"+id+System.getProperty("line.separator"));
				bw.flush();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
	}
	public void actionPerformed(ActionEvent e){
		Object obj = e.getSource();
		String msg = jtf.getText();
		if(obj == jtf || obj == jbtn){
			if(jtf.getText()==null || jtf.getText().length()==0)
				return;
			try {
				bw.write("1#"+id+ "#" + msg+System.getProperty("line.separator"));
				bw.flush();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			jtf.setText("");
		}
	}
	
	public void exit(){
		System.exit(0);
	}
	
	private void initSocket() throws  IOException{
		socket = new Socket(ip,9898);
		br = new BufferedReader(
				new InputStreamReader(
						socket.getInputStream()));
		
		
		
		bw = new BufferedWriter(
				new OutputStreamWriter(
						socket.getOutputStream()));
		
		UnicastClientThread uct = 
				new UnicastClientThread(this);
		
		uct.start();
		
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
		InetAddress ia = InetAddress.getLocalHost();
		UnicastClient ucc = new UnicastClient(
				ia.getHostAddress(),"TaEHo");
		ucc.initSocket();
	}
}

