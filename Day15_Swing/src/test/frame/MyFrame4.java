package test.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class MyFrame4 extends JFrame implements ActionListener{
	JTextField text;
	JList list;
	DefaultListModel model;
	JButton btn;
	
	//생성자
	public MyFrame4(){
		//레이아웃 객체 생성하기
		BorderLayout border=new BorderLayout();
		//레이아웃 설정하기
		setLayout(border);
		//프레임의 초기 위치와 크기
		setBounds(100,100,500,500);
		//프레임에 배치할 객체 생성하기
		JLabel lable=new JLabel("이름");
		text=new JTextField(10);
		btn=new JButton("저장");
		list=new JList();
		
		//데이타를 관리하는 모델 객체
		model=new DefaultListModel();
		model.addElement("김태호");
		list.setModel(model);
		//버튼에 액션 리스너 등록하기
		btn.addActionListener(this);
		
		//패널 객체 생성하기
		JPanel panel=new JPanel();
		//패널에 컴포넌트들을 미리 붙인다.
		panel.add(lable);
		panel.add(text);
		panel.add(btn);
		//패널을 통채로 프레임에 붙인다.
		add(panel,BorderLayout.NORTH); //북쪽에 배치하기.
		JScrollPane scrollP=new JScrollPane(list);
		
		//JList 객체를 포장한  JScrollPane 객체를 프레임에 붙인다.
		add(scrollP,BorderLayout.CENTER); //중앙에 배치하기
		
		//화면에 보이게 하기
		setVisible(true);
		//크기 고정하기
		setResizable(false);
	}
	public static void main(String[] args) {
		new MyFrame4(); //객체 생성하기.
	}
	//액션리스너로 등록한 버튼이 눌려졌을때 실행되는 콜백 메소드
	@Override
	public void actionPerformed(ActionEvent arg0) {
		String name=text.getText(); //입력한 문자열 읽어오기
		model.addElement(name); //모델에 데이터 추가
		text.setText("");//입력창 초기화 하기
		text.requestFocus(); //포커스 주기
	}
}






















