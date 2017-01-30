package test.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import test.dao.IBoardDAO;
import test.dao.JBoardDAO;
import test.dto.BoardDTO;

/*
 * �Խ��� �� �Է� �� ������ �� ����� ��ȸ�Ҽ� �ִ� ������ �����
 */
public class BoardFrame extends JFrame {
	//���Է� �� ��ư�� ��ġ�� ���
	JPanel panel=new JPanel();
	JTextField txtTitle=new JTextField(10);
	JTextField txtContent=new JTextField(10);
	JButton btnAdd=new JButton("���Է�");
	JButton btnList=new JButton("��Ϻ���");
	//�۳����� ����� TextArea
	JTextArea txtArea=new JTextArea(30,30);
	
	//������
	public BoardFrame(){
		//���̾ƿ� ����
		setLayout(new BorderLayout());
		//��ο� ������Ʈ �߰� �ϱ�
		panel.add(new JLabel("������"));
		panel.add(txtTitle);
		panel.add(new JLabel("�۳���"));
		panel.add(txtContent);
		panel.add(btnAdd);
		panel.add(btnList);
		//������ ����� �������� ���ʿ� ���̱�
		add(panel, BorderLayout.NORTH);
		add(txtArea, BorderLayout.CENTER);
		
		setBounds(100, 100, 600, 400);
		setVisible(true);
		//��ư�� �׼� ������ ����ϱ�
		btnAdd.addActionListener(listener);
		btnList.addActionListener(listener);
		
	}
	//���� �޼ҵ�
	public static void main(String[] args) {
		new BoardFrame();
	}
	//�͸��� InnerClass �� �̿��ؼ� ActionListener �������̽��� ������
	//��ü �����ϱ�
	ActionListener listener=new ActionListener() {
		//�� �����ʸ� ����� ��ư�� ���������� ȣ��Ǵ� �ݹ� �޼ҵ�
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btnAdd){ //�۵�� ��ư�� ��������
				insert();
			}else if(e.getSource() == btnList){ //��Ϻ��� ��ư
				showList();
			}
			
		}
	};
	//�� ����ϴ� �޼ҵ�
	public void insert(){
		//�Է��� ���� �� �� ������ �о�´�.
		String title=txtTitle.getText();
		String content=txtContent.getText();
		//�о�� ������ �̿��ؼ� DTO ��ü�� �����Ѵ�.
		BoardDTO dto=new BoardDTO(0, title, content, null);
		//DAO ��ü�� ���� ���� ���´�.
		//JBoardDAO dao=JBoardDAO.getInstance();
		IBoardDAO dao=new IBoardDAO();
		
		//DAO ��ü�� �̿��ؼ� DB �� �����Ѵ�.
		dao.insert(dto);
		//�Է�â �ʱ�ȭ
		txtTitle.setText("");
		txtContent.setText("");
	}
	//�� ��� �����ִ� �޼ҵ�
	public void showList(){
		//JDBC DAO ��ü
		//JBoardDAO dao=JBoardDAO.getInstance();
		//IBATIS DAO ��ü
		IBoardDAO dao=new IBoardDAO();
		
		ArrayList<BoardDTO> list=dao.getList();
		StringBuffer sBuff=new StringBuffer();
		//�ݺ��� ���鼭 �迭�� �ִ� ������ �о�ͼ� StringBuffer ��ü�� ����
		for(BoardDTO tmp : list){
			sBuff.append(tmp.getNum()+" / ");
			sBuff.append(tmp.getTitle()+" / ");
			sBuff.append(tmp.getContent()+" / ");
			sBuff.append(tmp.getRegdate()+"\r\n");
		}
		//StringBuffer ��ü������ִ� ���� ����ϱ�
		txtArea.setText(sBuff.toString());
	}
}












