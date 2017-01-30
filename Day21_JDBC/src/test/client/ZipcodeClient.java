package test.client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import test.server.ZipcodeDao;

public class ZipcodeClient extends JFrame {

	private JLabel l ;
	private JLabel ad1 ;
	private JTextField tf ;
	private JButton b ;
	private JTextArea ta ;
	private JPanel p1 ;
	private JPanel p2 ;
	private JPanel title ;
	private JPanel top ;
	private JScrollPane scrollPane ;
	//private ZipcodeDao dao;
	
	private Socket socket;
	private InputStreamReader isr;
	private OutputStreamWriter osw;
	
	public ZipcodeClient() throws  IOException{
		super("우편번호검색");
		l = new JLabel ( "읍/면/동을 입력하세요 :  " );
		ad1 = new JLabel ( "     우편번호    시/도    구/군    읍/면/동          번지" );
		
		tf = new JTextField ( 8 );
		b = new JButton ( "Search" );
		ta = new JTextArea ( 23, 60 );
		p1 = new JPanel ( );
		p2 = new JPanel ( );
		title = new JPanel (new FlowLayout(FlowLayout.LEFT));
		top = new JPanel ( );
		scrollPane = new JScrollPane( ta );
		//dao = new ZipcodeDao();
		
		
		setLayout(new BorderLayout());
		p1.setBackground( Color.yellow );
		p1.add ( l );
		p1.add ( tf );
		p1.add ( b );
		
		ad1.setForeground ( Color.blue );
		title.add ( ad1 ); 
		
		top.setLayout ( new GridLayout ( 2,1 ) );
		top.add ( p1 );
		top.add ( title );
		
		p2.add ( scrollPane );
		add ( top, BorderLayout.NORTH );
		add ( p2, BorderLayout.CENTER );
		
		setSize ( 700, 550 );
		setVisible ( true );
		b.addActionListener ( new ActionListenerDelegator());
		tf.addActionListener ( new ActionListenerDelegator());
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		initSocket();
	}
	private void initSocket() throws  IOException{
		socket = new Socket("localhost",3000);
		isr = new InputStreamReader(
						socket.getInputStream());
		osw = new OutputStreamWriter(
						socket.getOutputStream());
	}
	class ActionListenerDelegator implements ActionListener {
		public void actionPerformed ( ActionEvent e ) {
			ta.setText ( "" );
			String dong = tf.getText ( );
			//String value = dao.select(dong);
			String value = getSearch(dong);
			ta.append ( value );
		}
	}
	private String getSearch(String dong){
		String msg ="";
		try {
			osw.write(dong);
			osw.flush();
			
			char[] c = new char[10240];
			int readCharCnt = isr.read(c);   
			msg = new String(c,0,readCharCnt);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return msg;
	}
	public static void main(String[] args) throws IOException {
		JFrame.setDefaultLookAndFeelDecorated(true);
		new ZipcodeClient();
	}

}
