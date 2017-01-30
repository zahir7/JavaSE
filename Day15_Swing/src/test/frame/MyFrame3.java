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
	//���� ���� �����ϱ�
	JTextField x,y,result;
	JButton btn,btnClear;
	//������
	public MyFrame3(){
		//���̾ƿ� ��ü �����ϱ�
		BorderLayout border=new BorderLayout();
		//���̾ƿ� �����ϱ�
		setLayout(border);
		//�������� �ʱ� ��ġ�� ũ��
		setBounds(100,100,500,500);
		//�����ӿ� ��ġ�� ��ü �����ϱ�
		x=new JTextField(5); //���� ����
		y=new JTextField(5); //���� ����
		result=new JTextField(5); //����� ǥ���ϱ� ����
		JLabel label1=new JLabel(" + ");
		JLabel label2=new JLabel(" = ");
		
		btn=new JButton("���");
		
		btnClear=new JButton("Clear");
		
		//�г� ��ü �����ϱ�
		JPanel panel=new JPanel();
		//�гο� ������Ʈ���� �̸� ���δ�.
		panel.add(x);
		panel.add(label1);
		panel.add(y);
		panel.add(label2);
		panel.add(result);
		panel.add(btn);
		panel.add(btnClear);
		//�г��� ��ä�� �����ӿ� ���δ�.
		add(panel,BorderLayout.NORTH); //���ʿ� ��ġ�ϱ�.
		
		//ȭ�鿡 ���̰� �ϱ�
		setVisible(true);
		
		//��ư�� ������ ����ϱ�
		btn.addActionListener(this); //��ü �ڽ��� �������̴�.
		btnClear.addActionListener(this);
	}
	
	
	public static void main(String[] args) {
		new MyFrame3();
	}

	//��ư�� �������� ����Ǵ� �ݹ� �޼ҵ�
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btn ){ //��� ��ư�� ��������
			//�ؽ�Ʈ �ʵ忡 �Է��� ���ڿ��� �о�´�.
			String strNum1=x.getText();
			String strNum2=y.getText();
			//�о�� ���ڿ��� �������·� ����ȯ �Ѵ�.
			int num1=Integer.parseInt(strNum1);
			int num2=Integer.parseInt(strNum2);
			//����� ������� ����Ѵ�.
			int sum=num1+num2;
			//�������� ���ڿ��� ��ȯ
			String strSum=Integer.toString(sum);
			//��� ���� �ؽ�Ʈ �ʵ忡 ����Ѵ�.
			result.setText(strSum);
		}else if(e.getSource()==btnClear ){ //clear ��ư�� ��������
			x.setText("");
			y.setText("");
			result.setText("");
		}	
		
	}
}






















