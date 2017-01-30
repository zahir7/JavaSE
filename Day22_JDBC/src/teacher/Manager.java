package teacher;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
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

	public Manager(){		
		/* ȭ�鼳�� */
		frame = new JFrame("ȸ�� ����");
		
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
		

		//CheckboxGroup chgGroup = new CheckboxGroup();
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
		
		// anonymous class �̿��Ͽ�  ������ â�� closing ��Ų��.
		
		frame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);			
			}
		});	

		
		

		// Frame, Dialogâ ��ġ
        frame.setLocation(350,150);
		

		/* List  �� Ŭ���ϸ� Ŭ���� ������  �ؽ�Ʈ �ʵ� �� üũ�ڽ��� �ݿ�.
		1.  �켱�� Ŭ���� ����Ʈ�� index �� ���Ѵ�.
		2.  Member Ŭ������ �޼ҵ带 �̿��Ͽ� ���� ���Ѵ�.
		3. ���� ���� �ؽ�Ʈ �ʵ忡  �־��ش�. */	

		list.addListSelectionListener(new ListSelectionListener (){
			 public void valueChanged(ListSelectionEvent e) {
				MemberVo mvo = (MemberVo)list.getSelectedValue(); 
			    if(mvo != null){
					String name = mvo.getName().trim();
					int height = mvo.getHeight();
					int age = mvo.getAge();
					int weight = mvo.getWeight();
					String sex =mvo.getSex().trim();
				
	
					if (sex.equals("��")){
						chMale.setSelected(true);	
					}else if(sex.equals("��")){
						chFemale.setSelected(true);
					}
					tfName.setText(name);
					tfHeight.setText(Integer.toString(height));
					tfAge.setText(Integer.toString(age));
					tfWeight.setText(Integer.toString(weight));
			    }
					
			}
		});	
		

		//	Reset ����("���찳")�� Ŭ���ϸ� ȭ�� Ŭ����.
		btnReset.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){		
				clearAll();
				list.removeAll();
				displayAll();
			}			
		});
		
		/* btnSave - ��Ϲ�ư
		1. �̸��� ���� �ʰ� Ŭ���ϸ�  ���̾�α� â�� "�̸��� �����ּ���" ���.
	    2. ��� data �� ���ͼ� Database Ŭ������ �ִ� addMember() ȣ���Ѵ�.
		-  Exception  �߻��ϸ�  �޽����� Alert ���̾�α� â�� ���
		3.  data�� ����Ʈ�� ���	*/

		btnSave.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){		
				String saveName = tfName.getText();
				String saveAge = tfAge.getText();
				String saveHeight = tfHeight.getText();
				String saveWeight = tfWeight.getText();
				if (saveName == null || saveName.trim().length()==0){
					openDialog("�̸��� �Է��ϼ���.");
					tfName.requestFocus();
				}else if (saveAge == null || saveAge.trim().length()==0){
					openDialog("���̸� �Է��ϼ���.");
					tfAge.requestFocus();
				}else if (saveHeight == null || saveHeight.trim().length()==0){
					openDialog("Ű�� �Է��ϼ���.");
					tfHeight.requestFocus();
				}else if (saveWeight == null || saveWeight.trim().length()==0){
					openDialog("ü�߸� �Է��ϼ���");
					tfWeight.requestFocus();
					
				}else{
					String name = saveName.trim();
					String height = saveHeight.trim();
					String age = saveAge.trim();
					String weight = saveWeight.trim();
					if(!age.matches("[0-9]+")){
						openDialog("���̴� ���ڸ� �Է��ؾ� �մϴ�.");
						tfAge.setText("");
						tfAge.requestFocus();
						return;
					}
					
					if(!height.matches("[0-9]+")){
						openDialog("Ű�� ���ڸ� �Է��ؾ� �մϴ�.");
						tfHeight.setText("");
						tfHeight.requestFocus();
						return;
					}
					
					if(!weight.matches("[0-9]+")){
						openDialog("ü���� ���ڸ� �Է��ؾ� �մϴ�.");
						tfWeight.setText("");
						tfWeight.requestFocus();
						return;
					}
					String sex;
					if (chMale.isSelected()){
						sex = "��";
					}else{
						sex = "��";
					}
					try{
						data.addMember(new MemberVo(name,Integer.parseInt(height),
								Integer.parseInt(age),Integer.parseInt(weight),sex));
					}catch(DuplicatedException de){
						openDialog("�̹� �����ϴ� �̸��Դϴ�.");
					}
					clearAll();
					list.removeAll();
					displayAll();
				}			
			}
		});

		/* btnDelete - ���� ��ư
		1.�ش� name �� ������ Database Ŭ������ delMember() �޼ҵ� ȣ��
		-  Exception  �߻��ϸ�  �޽����� Alert ���̾�α� â�� ���
		2. ȭ�� Ŭ����.
		3. data�� ����Ʈ�� ���. */

		btnDelete.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){		
				
				String delName = tfName.getText();
				if(delName==null || delName.trim().length()==0){
					openDialog("�̸��� �Է��ϼ���.");
					tfName.requestFocus();
				}else{
					try{
						data.delMember(delName);
					}catch(RecordNotFoundException rnfe){
						openDialog("�������� �ʴ� �̸��Դϴ�.");
					}			
					clearAll();
					list.removeAll();
					displayAll();
				}
				
			}
		});	

		/* btnUpdate - ���� ��ư
	   1. ����� data ���� �̿��Ͽ� Database Ŭ������  updateMember() �޼ҵ� ȣ��.
		-  Exception  �߻��ϸ�  �޽����� Alert ���̾�α� â�� ���
		2. ��� ȭ�� Ŭ����.
		3. data�� ����Ʈ�� ���. */	

		btnUpdate.addActionListener( new ActionListener(){
			public void actionPerformed(ActionEvent e){		
				
				String updateName = tfName.getText();
				if(updateName==null || updateName.trim().length()==0){ 
					openDialog("�̸��� �����ּ���.");
					tfName.requestFocus();
					
				}else{
					String name = tfName.getText().trim();
					String height = tfHeight.getText().trim();
					String age = tfAge.getText().trim();
					String weight = tfWeight.getText().trim();
					if(!age.matches("[0-9]+")){
						openDialog("���̴� ���ڸ� �Է��ؾ� �մϴ�.");
						tfAge.setText("");
						tfAge.requestFocus();
						return;
					}
					
					if(!height.matches("[0-9]+")){
						openDialog("Ű�� ���ڸ� �Է��ؾ� �մϴ�.");
						tfHeight.setText("");
						tfHeight.requestFocus();
						return;
					}
					if(!weight.matches("[0-9]+")){
						openDialog("ü���� ���ڸ� �Է��ؾ� �մϴ�.");
						tfWeight.setText("");
						tfWeight.requestFocus();
						return;
					}
					String sex = null;
					if (chMale.isSelected()){ 
						sex = "��";
					}else{ 
						sex = "��";
					}
					try {
						data.updateMember(new MemberVo(name,Integer.parseInt(height),
								Integer.parseInt(age),Integer.parseInt(weight),sex));
					} catch(RecordNotFoundException rnfe) {
						openDialog("�����͸� ã���� �����ϴ�.");
					}
					clearAll();
					list.removeAll();
					displayAll();
				}
			}
		});

		/* btnSearch - �˻� ��ư
		name �� �̿��Ͽ� Search  �Ѵ�. Search  �� ������ ����Ʈ��  �ݿ�.
		1. name �� ������ Database Ŭ������ searchMember() �޼ҵ� ȣ���Ѵ�.
		-  Exception  �߻��ϸ�  �޽����� Alert ���̾�α� â�� ��� */	
		 
		btnSearch.addActionListener( new ActionListener (){
			 public void actionPerformed(ActionEvent e){		
				
				try{		
					String searchName = tfName.getText();
					if(searchName == null || searchName.trim().length()==0){
						openDialog("�̸��� �Է��ϼ���.");
						tfName.requestFocus();
					}else{
						MemberVo member1 = data.searchMember(searchName);
						//if (member1.getName().trim().equals(name)){
						if(member1 != null){
							list.removeAll();
							MemberVo[] memberVo = new MemberVo[1];
							memberVo[0]=member1;
							list.setListData(memberVo);
						}
					}
				}catch(RecordNotFoundException rnfe){
					openDialog("�����͸� ã���� �����ϴ�.");
				}catch(java.sql.SQLException sqle){
					System.err.println(sqle);
				}
			}
		});
	
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
	
	public void connectDB(){
		//	1. Database ��ü����
		//    2. ����Ǹ�  ����Ʈ�� ��� data �� ���.
		System.out.println("connectDB�޼��� ȣ��");
		
		data = MemberDao.getInstance();
		displayAll();
		
		
    } //end connectDB()

	/* ����Ʈ�� ��� data �� ��½�Ű�� �޼ҵ�
	1. Database  Ŭ������ getAllMember() �̿��Ͽ�  ����Ʈ�� add ��Ų��.
	2. for �� �̿�.	 */

	public void displayAll(){
		try{	
			member = data.getAllMember();
			list.setListData(member);
			for(int i = 0 ; i < member.length ; i++) {
//				System.out.println(data.member[i].getAll());	
				System.out.println(member[i]);	
				//list.setListData(member[i].toString());
			}	
		}catch(java.sql.SQLException sqle){
			System.err.println(sqle);
		}
		
	} //displayAll()

	public void clearAll(){
		tfName.setText("");
		tfAge.setText("");
		tfHeight.setText("");
		tfWeight.setText("");
		chMale.setSelected(true);		
		chFemale.setSelected(false);		
	}
	public void openDialog(String msg){
		JOptionPane.showMessageDialog(frame,
			    msg,
			    "ȸ������",
			    JOptionPane.ERROR_MESSAGE);	
	}
	public static void main(String [] args){
		JFrame.setDefaultLookAndFeelDecorated(true);
		Manager mem = new Manager();
		mem.launchFrame();
	} // end main()
} // end Manager class