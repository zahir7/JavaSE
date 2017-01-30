package test.frame;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Graphic User Interface (GUI) ȯ�� �����
 * 
 * -Swing �� ����ϸ� �ȴ�.
 * 
 */
public class MyFrame extends JFrame implements ActionListener{
	//��������(�ɹ��ʵ�) �����ϱ�
	JButton btn1,btn2,btn3,btn4,btn5;
	
	//�����ڿ��� �ʱ�ȭ �۾��� �Ѵ�.
	public MyFrame(){
		//���̾ƿ��� �����ϱ� ���ؼ�
		FlowLayout flow=new FlowLayout();//���̾ƿ� ��ü �����ϱ�
		//���̾ƿ� �����ϱ�
		setLayout(flow);
		
		//ȭ�鿡 ��ġ�� ��ư ��ü �����ϱ�
		btn1=new JButton("��ư1");
		btn2=new JButton("��ư2");
		btn3=new JButton("��ư3");
		btn4=new JButton("��ư4");
		btn5=new JButton("��ư5");
		
		//������ ��ư��ü�� �����ӿ� �߰��ϱ�
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		//��ư�� �׼� �����ʰ�ü ����ϱ�
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		
		//�������� �»���� ��ǥ�� ũ�⸦ �����Ѵ�.
		setBounds(100, 100, 500, 500);
		//ȭ�鿡 ���̵��� �����Ѵ�.
		setVisible(true);
	}//������
	
	//�׼� �����ʸ� ����� ��ư�� ���� ������ ����Ǵ� �ݹ� �޼ҵ�
	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("��ư�� ������??");
		if(e.getSource()==btn1){
			JOptionPane.showMessageDialog(this,"��ư1 �� ������?");
		}else if(e.getSource()==btn2){
			JOptionPane.showMessageDialog(this,"��ư2 �� ������?");
		}else if(e.getSource()==btn3){
			JOptionPane.showMessageDialog(this,"��ư3 �� ������?");
		}else if(e.getSource()==btn4){
			JOptionPane.showMessageDialog(this,"��ư4 �� ������?");
		}else if(e.getSource()==btn5){
			JOptionPane.showMessageDialog(this,"��ư5 �� ������?");
		}
	}
}















