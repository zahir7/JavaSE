package test.frame;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame2 extends JFrame{
	
	//������
	public MyFrame2(){
		//���̾ƿ� ��ü �����ϱ�
		BorderLayout border=new BorderLayout();
		//���̾ƿ� �����ϱ�
		setLayout(border);
		//�������� �ʱ� ��ġ�� ũ��
		setBounds(100,100,500,500);
		//�����ӿ� ��ġ�� ��ü �����ϱ�
		JLabel lable=new JLabel("�̸�");
		JTextField text=new JTextField(10);
		JButton  btn=new JButton("����");
		//�г� ��ü �����ϱ�
		JPanel panel=new JPanel();
		//�гο� ������Ʈ���� �̸� ���δ�.
		panel.add(lable);
		panel.add(text);
		panel.add(btn);
		//�г��� ��ä�� �����ӿ� ���δ�.
		add(panel,BorderLayout.NORTH); //���ʿ� ��ġ�ϱ�.
		//ȭ�鿡 ���̰� �ϱ�
		setVisible(true);
	}
}






















