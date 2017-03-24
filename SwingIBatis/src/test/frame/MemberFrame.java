package test.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.dao.MemDAO;
import test.dto.MemDTO;

/*
 * ȸ�������� �Է� ���� �����ϴ� MemberFrame �����.
 */
public class MemberFrame extends JFrame 
								implements ActionListener{
	//�ʿ��� �ɹ� �ʵ� �����ϱ�
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel(); //�ּ� �����ϱ����� ���
	//�����͸� �Է� ���� TextField
	JTextField txt1 = new JTextField(10); //��ȣ
	JTextField txt2 = new JTextField(10); //�̸�
	JTextField txt3 = new JTextField(10); //�ּ�
	JTextField txt4 = new JTextField(10); //������ �ּҸ� ǥ��
	//��ư ��ü
	JButton btnAdd = new JButton("�߰�"); //�Է� ��ư
	JButton btnList = new JButton("��Ϻ���"); //��Ϻ��� ��ư
	JButton btnDelete = new JButton("����"); //������ư
	JButton btnEdit = new JButton("����");
	JButton btnSave = new JButton("����");
	//ȸ�� ����� ����� JTable ��ü
	JTable table ;
	//���̺� ������ Modle ��ü
	DefaultTableModel model;
	
	//������
	public MemberFrame(){
		//���̾ƿ� �����ϱ� (BorderLayout)
		setLayout(new BorderLayout());
		//��ο� ������Ʈ ���̱�
		panel1.add(new JLabel("��ȣ"));
		panel1.add(txt1);
		panel1.add(new JLabel("�̸�"));
		panel1.add(txt2);
		panel1.add(new JLabel("�ּ�"));
		panel1.add(txt3);
		panel1.add(btnAdd);
		panel1.add(btnList); //��ο� ��ư �߰�
		panel1.add(btnDelete); //����
		//���� ����� �������� ���ʿ� ���̱�
		add(panel1, BorderLayout.NORTH);
		
		//��� 2 �����ϱ�.
		panel2.add(new JLabel("������ �ּ�"));
		panel2.add(txt4);
		panel2.add(btnEdit);  //������ư
		panel2.add(btnSave);  //�����ư
		//���� ��� 2�� �������� ���ʿ� ���̱�
		add(panel2, BorderLayout.SOUTH);
		
		//����� ���̺� Į���� ���ϱ�
		String colNames[]={"��ȣ","�̸�","�ּ�"};
		//���̺� ������ �𵨰�ü �����ϱ�
		model = new DefaultTableModel(colNames, 0);

		//�� ��ü�� �����ڷ� �����ϸ鼭 ���̺� ��ü �����ϱ�
		table = new JTable(model);
		//�����Ͱ� ������ ��ũ�� �Ǿ������� ��ũ�� ��� �߰��ϱ�
		JScrollPane sc=new JScrollPane(table);
		//��ũ�� ��ü�� ���� ���̺��� ȭ���� ����� ���̱�
		add(sc , BorderLayout.CENTER);
		
		//�������� ��ġ�� ũ�� �����ϱ�
		setBounds(100,100,700,500);
		//���̰� �ϱ�
		setVisible(true);
		//��ư�� �����ϰ� �ϱ� ���ؼ� ������ ��ü ����ϱ�
		btnAdd.addActionListener(this);
		btnList.addActionListener(this);
		btnDelete.addActionListener(this);
		btnEdit.addActionListener(this);
		btnSave.addActionListener(this);
	}
	//������ ��ü�� ����� ��ư�� ���� ������ ȣ��Ǵ� �ݹ� �޼ҵ�
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnAdd){ //���� ��ư�� ��������
			insert(); //�����ϴ� �޼ҵ� ȣ��
			showList(); //��Ϻ��� ȣ��
		}else if(e.getSource() == btnList){ //��Ϻ��� ��ư�� ��������
			showList();
		}else if(e.getSource() == btnDelete){ //����
			delete();
		}else if(e.getSource() == btnEdit){ //����
			update();
		}else if(e.getSource() == btnSave){ //������ �����ư
			save();
		}
	}
	//������ �ּҸ� �����ϴ� �޼ҵ�
	public void save(){
		//���õ� ��
		int index=table.getSelectedRow();
		//������ ������ primary key �� �о����
		String strNum=(String)model.getValueAt(index, 0);
		int num=Integer.parseInt(strNum);
		//���� �Է��� �ּ� �о����
		String saveAddr=txt4.getText();
		//�ش������� DTO ��ü �����ϱ�.
		MemDTO dto=new MemDTO(num, null, saveAddr);
		//DB �� �ݿ��ϱ�
		MemDAO dao=new MemDAO();
		dao.update(dto);
		//��Ϻ���
		showList();
		txt4.setText(""); //�����Է�â �ʱ�ȭ
	}
	
	//�����ϴ� �޼ҵ�
	public void delete(){
		//���õ�  row �� �ε����� ������
		int index = table.getSelectedRow();
		
		if( index == -1 ){ //��� row �� �������� �ʾҴٸ�
			JOptionPane.showMessageDialog(this, "���� ����!");
			return; //�޼ҵ带 ������
		}else{
			//������ ���� primary key ���� �о�´�.
			String strNum=(String)model.getValueAt(index, 0);
			int num = Integer.parseInt(strNum);
			//primary key ���� ������ ���� DB ���� �����Ѵ�.
			MemDAO dao=new MemDAO();
			dao.delete(num); //����
			showList();//��Ϻ��� ȣ���ϱ�.
		}
	}
	//�����ϴ� �޼ҵ�
	public void update(){
		//���õ� ���� �о����
		int index = table.getSelectedRow();
		if( index == -1){ //��൵ ���õ��� �ʾҴٸ�
			return;//�޼ҵ带 ������
		}
		//���õ� ���� �ּ�Į�� �о����
		String addr=(String)model.getValueAt(index, 2);
		//�𵨿��� �о�� �����͸� ������ txt4 ��ü�� �ѷ��ֱ�
		txt4.setText(addr);
	}
	
	//��Ϻ��� ��ư�� �������� ����Ǵ� �޼ҵ�
	public void showList(){
		//DB �����ؼ� ȸ�� ���� ������
		
		//MemDAO ��ü �����ϱ�
		MemDAO dao=new MemDAO();
		
		ArrayList<MemDTO> list = dao.getList();
		
		//���ʱ�ȭ �ϱ�(���� ����)
		model.setRowCount(0); 
		//�ݺ��� ���鼭 �迭�� ������ �𵨰�ü�� �־��ֱ�
		for(MemDTO tmp : list){
			int num = tmp.getNum();
			String name = tmp.getName();
			String addr = tmp.getAddr();
			//�𵨿� �����ϱ� ���� ���� ��ü
			Vector<String> vec = new Vector<String>();
			vec.add(Integer.toString(num));
			vec.add(name);
			vec.add(addr);
			//�𵨿� �����Ѵ�.
			model.addRow(vec);
		}
	}
	
	
	//�����ϴ� �޼ҵ�
	public void insert(){
		//�Է��� ���� �о����
		int num = Integer.parseInt(txt1.getText());
		String name = txt2.getText();
		String addr = txt3.getText();
		//��ȣ,�̸�,�ּҰ��� MemDTO ���·� �����ϱ�
		MemDTO dto=new MemDTO(num, name, addr);
		//MemDAO ��ü�� �̿��ؼ� DB �� �����ϱ�
		MemDAO dao=new MemDAO();
		//�޼ҵ� ȣ���ϸ鼭 MemDTO ��ü �����ϱ�.
		boolean result=dao.insert(dto); 
		if(result){
			JOptionPane.showMessageDialog(this, "���强��!");
		}else{
			JOptionPane.showMessageDialog(this, "�������!");
		}
		//�Է�â �ʱ�ȭ �ϱ�
		txt1.setText("");
		txt2.setText("");
		txt3.setText("");
		//��Ŀ�� �ֱ�
		txt1.requestFocus();
				
	}
	//���α׷��� �����̵Ǵ� ���� �޼ҵ�
	public static void main(String[] args) {
		//��ü�� �����ؼ� �������� ���̵��� �Ѵ�.
		new MemberFrame();
	}
}











