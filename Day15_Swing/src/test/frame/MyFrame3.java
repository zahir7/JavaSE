package test.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame3 extends JFrame implements ActionListener{
	//전역 변수 정의하기
	JTextField x,y,result;
	JButton btn,btnClear;
	//생성자
	public MyFrame3(){
		//레이아웃 객체 생성하기
		BorderLayout border=new BorderLayout();
		//레이아웃 설정하기
		setLayout(border);
		//프레임의 초기 위치와 크기
		setBounds(100,100,500,500);
		//프레임에 배치할 객체 생성하기
		x=new JTextField(5); //앞의 숫자
		y=new JTextField(5); //뒤의 숫자
		result=new JTextField(5); //결과값 표시하기 위해
		JLabel label1=new JLabel(" + ");
		JLabel label2=new JLabel(" = ");
		
		btn=new JButton("계산");
		
		btnClear=new JButton("Clear");
		
		//패널 객체 생성하기
		JPanel panel=new JPanel();
		//패널에 컴포넌트들을 미리 붙인다.
		panel.add(x);
		panel.add(label1);
		panel.add(y);
		panel.add(label2);
		panel.add(result);
		panel.add(btn);
		panel.add(btnClear);
		//패널을 통채로 프레임에 붙인다.
		add(panel,BorderLayout.NORTH); //북쪽에 배치하기.
		
		//화면에 보이게 하기
		setVisible(true);
		
		//버튼에 리스너 등록하기
		btn.addActionListener(this); //객체 자신이 리스너이다.
		btnClear.addActionListener(this);
	}
	
	
	public static void main(String[] args) {
		new MyFrame3();
	}

	//버튼을 눌렀을때 실행되는 콜백 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btn ){ //계산 버튼을 눌렀을때
			//텍스트 필드에 입력한 문자열을 읽어온다.
			String strNum1=x.getText();
			String strNum2=y.getText();
			//읽어온 문자열을 숫자형태로 형변환 한다.
			int num1=Integer.parseInt(strNum1);
			int num2=Integer.parseInt(strNum2);
			//출력할 결과값을 계산한다.
			int sum=num1+num2;
			//정수값을 문자열로 변환
			String strSum=Integer.toString(sum);
			//결과 값을 텍스트 필드에 출력한다.
			result.setText(strSum);
		}else if(e.getSource()==btnClear ){ //clear 버튼을 눌렀을때
			x.setText("");
			y.setText("");
			result.setText("");
		}	
		
	}
}






















