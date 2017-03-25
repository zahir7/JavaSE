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
	
	//������
	public MyFrame4(){
		//���̾ƿ� ��ü �����ϱ�
		BorderLayout border=new BorderLayout();
		//���̾ƿ� �����ϱ�
		setLayout(border);
		//�������� �ʱ� ��ġ�� ũ��
		setBounds(100,100,500,500);
		//�����ӿ� ��ġ�� ��ü �����ϱ�
		JLabel lable=new JLabel("�̸�");
		text=new JTextField(10);
		btn=new JButton("����");
		list=new JList();
		
		//����Ÿ�� �����ϴ� �� ��ü
		model=new DefaultListModel();
		model.addElement("����ȣ");
		list.setModel(model);
		//��ư�� �׼� ������ ����ϱ�
		btn.addActionListener(this);
		
		//�г� ��ü �����ϱ�
		JPanel panel=new JPanel();
		//�гο� ������Ʈ���� �̸� ���δ�.
		panel.add(lable);
		panel.add(text);
		panel.add(btn);
		//�г��� ��ä�� �����ӿ� ���δ�.
		add(panel,BorderLayout.NORTH); //���ʿ� ��ġ�ϱ�.
		JScrollPane scrollP=new JScrollPane(list);
		
		//JList ��ü�� ������  JScrollPane ��ü�� �����ӿ� ���δ�.
		add(scrollP,BorderLayout.CENTER); //�߾ӿ� ��ġ�ϱ�
		
		//ȭ�鿡 ���̰� �ϱ�
		setVisible(true);
		//ũ�� �����ϱ�
		setResizable(false);
	}
	public static void main(String[] args) {
		new MyFrame4(); //��ü �����ϱ�.
	}
	//�׼Ǹ����ʷ� ����� ��ư�� ���������� ����Ǵ� �ݹ� �޼ҵ�
	@Override
	public void actionPerformed(ActionEvent arg0) {
		String name=text.getText(); //�Է��� ���ڿ� �о����
		model.addElement(name); //�𵨿� ������ �߰�
		text.setText("");//�Է�â �ʱ�ȭ �ϱ�
		text.requestFocus(); //��Ŀ�� �ֱ�
	}
}






















