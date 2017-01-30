package test.frame;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame2 extends JFrame{
	
	//생성자
	public MyFrame2(){
		//레이아웃 객체 생성하기
		BorderLayout border=new BorderLayout();
		//레이아웃 설정하기
		setLayout(border);
		//프레임의 초기 위치와 크기
		setBounds(100,100,500,500);
		//프레임에 배치할 객체 생성하기
		JLabel lable=new JLabel("이름");
		JTextField text=new JTextField(10);
		JButton  btn=new JButton("저장");
		//패널 객체 생성하기
		JPanel panel=new JPanel();
		//패널에 컴포넌트들을 미리 붙인다.
		panel.add(lable);
		panel.add(text);
		panel.add(btn);
		//패널을 통채로 프레임에 붙인다.
		add(panel,BorderLayout.NORTH); //북쪽에 배치하기.
		//화면에 보이게 하기
		setVisible(true);
	}
}






















