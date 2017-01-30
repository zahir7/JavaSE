package student;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Manager {
	private JFrame frame;
	private JPanel [] panel;	
	private JLabel lbTitle, lbName, lbHeight, lbSex, lbAge, lbWeight, lbDialog, lbStatus;
	private JTextField  tfName, tfHeight, tfAge, tfWeight;
	private JButton btnSave, btnSearch, btnDelete, btnReset, btnUpdate, btnDialog;
	
	private Font font;
	private JList list;
	private JRadioButton chMale, chFemale;
	
	private MemberDao data;
	private MemberVo [] member;
	int memSelect;

	public Manager() {		
		/* ȭ�鼳�� */
		frame = new JFrame("ȸ�� ����");
		// Dialog - dialog
				panel = new JPanel[19];
		for(int i=0;i<panel.length;i++){
			panel[i] = new JPanel();
		}
		

		lbTitle = new JLabel("ȸ   ��  ��  ��");
		font = new Font("����",Font.BOLD,16);	
		lbTitle.setFont(font); 

		lbName = new JLabel("�̸�");
		lbHeight = new JLabel("Ű    ");
		lbSex = new JLabel("����");
		lbWeight = new JLabel("            ü��");	
		lbAge = new JLabel("            ����"); 
		lbDialog = new JLabel("");
		lbStatus = new JLabel("�̸�              ����              ����              ü��              ����");
    	tfName = new JTextField(11); tfHeight = new JTextField(11); tfAge = new JTextField(11); tfWeight = new JTextField(11);
		

		chMale = new JRadioButton("����",true);
		chFemale = new JRadioButton("����",false);
		ButtonGroup group = new ButtonGroup();
		group.add(chMale);
		group.add(chFemale);
		list = new JList();
		btnSave = new JButton("���"); btnSearch=new JButton("�˻�"); btnDelete=new JButton("����"); 
		btnUpdate=new JButton("����"); btnReset=new JButton("���찳");
		btnDialog=new JButton("Ȯ��");

		// anonymous class �̿��Ͽ�  ������ â�� closing ��Ų��.
		
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);			
			}
		});	

		
		

		// Frame, Dialogâ ��ġ
        frame.setLocation(350,150);

		/* List  �� Ŭ���ϸ� Ŭ���� ������  �ؽ�Ʈ �ʵ� �� üũ�ڽ��� �ݿ�.
		1.  �켱�� Ŭ���� ����Ʈ��  ��ü�� ���Ѵ�.
		2.  Member Ŭ������ �޼ҵ带 �̿��Ͽ� ���� ���Ѵ�.
		3. ���� ���� �ؽ�Ʈ �ʵ忡  �־��ش�. */	
		
		
		list.addListSelectionListener(new ListSelectionListener (){
			 public void valueChanged(ListSelectionEvent e) {
				MemberVo mvo = (MemberVo)list.getSelectedValue(); 
			    System.out.println("selected member : "+mvo);
			   
					
			}
		});	
		
		//	Reset ����("���찳")�� Ŭ���ϸ� ȭ�� Ŭ����.
		btnReset.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){		
				
			}			
		});
		
		/* btnSave - ��Ϲ�ư
		1. �̸��� ���� �ʰ� Ŭ���ϸ�  ���̾�α� â�� "�̸��� �����ּ���" ���.
	    2. ��� data �� ���ͼ� MemberDao Ŭ������ �ִ� addMember() ȣ���Ѵ�.
		-  Exception  �߻��ϸ�  �޽����� Alert ���̾�α� â�� ���
		3.  data�� ����Ʈ�� ���	*/

		btnSave.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){		
				
			}});

		/* btnDelete - ���� ��ư
		1.�ش� name �� ������ MemberDao Ŭ������ delMember() �޼ҵ� ȣ��
		-  Exception  �߻��ϸ�  �޽����� Alert ���̾�α� â�� ���
		2. ȭ�� Ŭ����.
		3. data�� ����Ʈ�� ���. */

		btnDelete.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){		
				
			}
		});	

		/* btnUpdate - ���� ��ư
	   1. ����� data ���� �̿��Ͽ� MemberDao Ŭ������  updateMember() �޼ҵ� ȣ��.
		-  Exception  �߻��ϸ�  �޽����� Alert ���̾�α� â�� ���
		2. ��� ȭ�� Ŭ����.
		3. data�� ����Ʈ�� ���. */	

		btnUpdate.addActionListener( new ActionListener(){
			public void actionPerformed(ActionEvent e){		
				if (e.getActionCommand().equals("����")){ 
					
				}
		}});

		/* btnSearch - �˻� ��ư
		name �� �̿��Ͽ� Search  �Ѵ�. Search  �� ������ ����Ʈ��  �ݿ�.
		1. name �� ������ MemberDao Ŭ������ searchMember() �޼ҵ� ȣ���Ѵ�.
		-  Exception  �߻��ϸ�  �޽����� Alert ���̾�α� â�� ��� */	
		 
		btnSearch.addActionListener( new ActionListener () {
			 public void actionPerformed(ActionEvent e){		
				
		 }});
	
	} // end Manager()

	public void launchFrame(){
		/* Panel�� setLayout �����ϰ�,add��Ų��.	setSize method�� �̿��Ͽ� ũ����� */

		// ��ü �������� ������ ����		
		frame.setSize(400,340);
		

		panel[0].setLayout(new BorderLayout());
		panel[1].setLayout(new FlowLayout());
		panel[2].setLayout(new BorderLayout());
		panel[3].setLayout(new FlowLayout(1,22,0));
		panel[4].setLayout(new BorderLayout());	
		panel[5].setLayout(new FlowLayout());	
		panel[6].setLayout(new BorderLayout());	
		panel[7].setLayout(new BorderLayout());	
		panel[8].setLayout(new BorderLayout());	
		panel[9].setLayout(new FlowLayout());	
		panel[10].setLayout(new BorderLayout());
		panel[11].setLayout(new BorderLayout());
		panel[12].setLayout(new BorderLayout());
		panel[13].setLayout(new BorderLayout());
		panel[14].setLayout(new BorderLayout());
		panel[15].setLayout(new BorderLayout());
		panel[16].setLayout(new BorderLayout());
		panel[17].setLayout(new BorderLayout());
		panel[18].setLayout(new BorderLayout());

		panel[1].add(lbTitle);		

		panel[10].add(lbName,BorderLayout.WEST);
		panel[10].add(tfName,BorderLayout.CENTER);		
		panel[11].add(lbAge,BorderLayout.WEST);
		panel[11].add(tfAge,BorderLayout.CENTER);

		panel[12].add(lbHeight,BorderLayout.WEST);
		panel[12].add(tfHeight,BorderLayout.CENTER);		
		panel[13].add(lbWeight,BorderLayout.WEST);
		panel[13].add(tfWeight,BorderLayout.CENTER);

		panel[9].add(lbSex);  panel[9].add(chMale);  panel[9].add(chFemale); 
		panel[5].add(lbStatus);
		JScrollPane jsp = new JScrollPane(list);
		panel[6].add(jsp,BorderLayout.CENTER);

		panel[3].add(btnSave); panel[3].add(btnSearch); panel[3].add(btnDelete);
		panel[3].add(btnUpdate); panel[3].add(btnReset);

		panel[0].add(panel[1],BorderLayout.NORTH);
		panel[0].add(panel[2],BorderLayout.CENTER);
		panel[0].add(panel[3],BorderLayout.SOUTH);

		panel[2].add(panel[4],BorderLayout.NORTH);
		panel[2].add(panel[5],BorderLayout.CENTER);
		panel[2].add(panel[6],BorderLayout.SOUTH);		
	
		panel[4].add(panel[7],BorderLayout.NORTH);
		panel[4].add(panel[8],BorderLayout.CENTER);
		panel[4].add(panel[9],BorderLayout.SOUTH);

		panel[7].add(panel[10],BorderLayout.WEST);
		panel[7].add(panel[11],BorderLayout.CENTER);
		panel[8].add(panel[12],BorderLayout.WEST);
		panel[8].add(panel[13],BorderLayout.CENTER);

		panel[17].add(lbDialog,BorderLayout.CENTER);	
		panel[18].add(btnDialog,BorderLayout.CENTER);
		
		// �������� ���� ����
		panel[5].setBackground(Color.yellow);
		panel[1].setBackground(new Color(215,238,249));
		panel[3].setBackground(new Color(215,238,249));
		panel[10].setBackground(new Color(215,238,249));
		panel[11].setBackground(new Color(215,238,249));
		panel[12].setBackground(new Color(215,238,249));
		panel[13].setBackground(new Color(215,238,249));
		panel[4].setBackground(new Color(215,238,249));
		panel[6].setBackground(new Color(215,238,249));

		// ���α׷� ����� �������� display�ǵ��� true����
		frame.add(panel[0]);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
		connectDB();	
	} // end launchFrame()	
	
	public void connectDB() {
		//	1. MemberDao ��ü����
		//    2. ����Ǹ�  ����Ʈ�� ��� data �� ���.
		System.out.println("connectDB�޼��� ȣ��");
		
		data = MemberDao.getInstance();
		displayAll();
		
    } //end connectDB()

	/* ����Ʈ�� ��� data �� ��½�Ű�� �޼ҵ�
	1. MemberDao  Ŭ������ getAllMember() �̿��Ͽ�  ����Ʈ�� add ��Ų��.
	2. for �� �̿�.	 */

	public void displayAll(){
		try{	
			member = data.getAllMember();
			list.setListData(member);
			for(int i = 0 ; i < member.length ; i++) {
				System.out.println(member[i]);
			}		
		}catch(java.sql.SQLException sqle){
			System.err.println(sqle);
		}
		
	} //displayAll()

	public void clearAll() {
		tfName.setText("");
		tfAge.setText("");
		tfHeight.setText("");
		tfWeight.setText("");
		chMale.setSelected(true);		
		chFemale.setSelected(false);		
	}

	public static void main(String [] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		Manager mem = new Manager();
		mem.launchFrame();
	} // end main()
} // end Manager class