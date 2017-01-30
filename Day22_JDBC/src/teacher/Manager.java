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
		/* 화면설계 */
		frame = new JFrame("회원 관리");
		
		panel = new JPanel[19];
		for(int i=0;i<panel.length;i++){
			panel[i] = new JPanel();
		}
		

		lbTitle = new JLabel("회   원  관  리");
		font = new Font("돋음",Font.BOLD,16);	
		lbTitle.setFont(font); 

		lbName = new JLabel("이름");
		lbHeight = new JLabel("키    ");
		lbSex = new JLabel("성별");
		lbWeight = new JLabel("            체중");	
		lbAge = new JLabel("            나이"); 
		lbDialog = new JLabel("");
		lbStatus = new JLabel("이름              신장              나이              체중              성별");
    	tfName = new JTextField(11); tfHeight = new JTextField(11); tfAge = new JTextField(11); tfWeight = new JTextField(11);
		

		//CheckboxGroup chgGroup = new CheckboxGroup();
		chMale = new JRadioButton("남자",true);
		chFemale = new JRadioButton("여자",false);
		ButtonGroup group = new ButtonGroup();
		group.add(chMale);
		group.add(chFemale);
		list = new JList();
		btnSave = new JButton("등록"); btnSearch=new JButton("검색"); btnDelete=new JButton("삭제"); 
		btnUpdate=new JButton("갱신"); btnReset=new JButton("지우개");
		btnDialog=new JButton("확인");

		// anonymous class 이용하여  윈도우 창을 closing 시킨다.
		
		// anonymous class 이용하여  윈도우 창을 closing 시킨다.
		
		frame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);			
			}
		});	

		
		

		// Frame, Dialog창 위치
        frame.setLocation(350,150);
		

		/* List  을 클릭하면 클릭한 내용이  텍스트 필드 및 체크박스에 반영.
		1.  우선은 클릭한 리스트의 index 을 구한다.
		2.  Member 클래스의 메소드를 이용하여 값을 구한다.
		3. 구한 값을 텍스트 필드에  넣어준다. */	

		list.addListSelectionListener(new ListSelectionListener (){
			 public void valueChanged(ListSelectionEvent e) {
				MemberVo mvo = (MemberVo)list.getSelectedValue(); 
			    if(mvo != null){
					String name = mvo.getName().trim();
					int height = mvo.getHeight();
					int age = mvo.getAge();
					int weight = mvo.getWeight();
					String sex =mvo.getSex().trim();
				
	
					if (sex.equals("남")){
						chMale.setSelected(true);	
					}else if(sex.equals("여")){
						chFemale.setSelected(true);
					}
					tfName.setText(name);
					tfHeight.setText(Integer.toString(height));
					tfAge.setText(Integer.toString(age));
					tfWeight.setText(Integer.toString(weight));
			    }
					
			}
		});	
		

		//	Reset 단추("지우개")를 클릭하면 화면 클리어.
		btnReset.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){		
				clearAll();
				list.removeAll();
				displayAll();
			}			
		});
		
		/* btnSave - 등록버튼
		1. 이름을 적지 않고 클릭하면  다이얼로그 창에 "이름을 적어주세요" 출력.
	    2. 모든 data 을 얻어와서 Database 클래스에 있는 addMember() 호출한다.
		-  Exception  발생하면  메시지를 Alert 다이얼로그 창에 출력
		3.  data을 리스트에 출력	*/

		btnSave.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){		
				String saveName = tfName.getText();
				String saveAge = tfAge.getText();
				String saveHeight = tfHeight.getText();
				String saveWeight = tfWeight.getText();
				if (saveName == null || saveName.trim().length()==0){
					openDialog("이름을 입력하세요.");
					tfName.requestFocus();
				}else if (saveAge == null || saveAge.trim().length()==0){
					openDialog("나이를 입력하세요.");
					tfAge.requestFocus();
				}else if (saveHeight == null || saveHeight.trim().length()==0){
					openDialog("키를 입력하세요.");
					tfHeight.requestFocus();
				}else if (saveWeight == null || saveWeight.trim().length()==0){
					openDialog("체중를 입력하세요");
					tfWeight.requestFocus();
					
				}else{
					String name = saveName.trim();
					String height = saveHeight.trim();
					String age = saveAge.trim();
					String weight = saveWeight.trim();
					if(!age.matches("[0-9]+")){
						openDialog("나이는 숫자를 입력해야 합니다.");
						tfAge.setText("");
						tfAge.requestFocus();
						return;
					}
					
					if(!height.matches("[0-9]+")){
						openDialog("키는 숫자를 입력해야 합니다.");
						tfHeight.setText("");
						tfHeight.requestFocus();
						return;
					}
					
					if(!weight.matches("[0-9]+")){
						openDialog("체중은 숫자를 입력해야 합니다.");
						tfWeight.setText("");
						tfWeight.requestFocus();
						return;
					}
					String sex;
					if (chMale.isSelected()){
						sex = "남";
					}else{
						sex = "여";
					}
					try{
						data.addMember(new MemberVo(name,Integer.parseInt(height),
								Integer.parseInt(age),Integer.parseInt(weight),sex));
					}catch(DuplicatedException de){
						openDialog("이미 존재하는 이름입니다.");
					}
					clearAll();
					list.removeAll();
					displayAll();
				}			
			}
		});

		/* btnDelete - 삭제 버튼
		1.해당 name 을 가지고 Database 클래스의 delMember() 메소드 호출
		-  Exception  발생하면  메시지를 Alert 다이얼로그 창에 출력
		2. 화면 클리어.
		3. data을 리스트에 출력. */

		btnDelete.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){		
				
				String delName = tfName.getText();
				if(delName==null || delName.trim().length()==0){
					openDialog("이름을 입력하세요.");
					tfName.requestFocus();
				}else{
					try{
						data.delMember(delName);
					}catch(RecordNotFoundException rnfe){
						openDialog("존재하지 않는 이름입니다.");
					}			
					clearAll();
					list.removeAll();
					displayAll();
				}
				
			}
		});	

		/* btnUpdate - 갱신 버튼
	   1. 변경된 data 값을 이용하여 Database 클래스의  updateMember() 메소드 호출.
		-  Exception  발생하면  메시지를 Alert 다이얼로그 창에 출력
		2. 모든 화면 클리어.
		3. data을 리스트에 출력. */	

		btnUpdate.addActionListener( new ActionListener(){
			public void actionPerformed(ActionEvent e){		
				
				String updateName = tfName.getText();
				if(updateName==null || updateName.trim().length()==0){ 
					openDialog("이름을 적어주세요.");
					tfName.requestFocus();
					
				}else{
					String name = tfName.getText().trim();
					String height = tfHeight.getText().trim();
					String age = tfAge.getText().trim();
					String weight = tfWeight.getText().trim();
					if(!age.matches("[0-9]+")){
						openDialog("나이는 숫자를 입력해야 합니다.");
						tfAge.setText("");
						tfAge.requestFocus();
						return;
					}
					
					if(!height.matches("[0-9]+")){
						openDialog("키는 숫자를 입력해야 합니다.");
						tfHeight.setText("");
						tfHeight.requestFocus();
						return;
					}
					if(!weight.matches("[0-9]+")){
						openDialog("체중은 숫자를 입력해야 합니다.");
						tfWeight.setText("");
						tfWeight.requestFocus();
						return;
					}
					String sex = null;
					if (chMale.isSelected()){ 
						sex = "남";
					}else{ 
						sex = "여";
					}
					try {
						data.updateMember(new MemberVo(name,Integer.parseInt(height),
								Integer.parseInt(age),Integer.parseInt(weight),sex));
					} catch(RecordNotFoundException rnfe) {
						openDialog("데이터를 찾을수 없습니다.");
					}
					clearAll();
					list.removeAll();
					displayAll();
				}
			}
		});

		/* btnSearch - 검색 버튼
		name 을 이용하여 Search  한다. Search  된 내용은 리스트에  반영.
		1. name 을 가지고 Database 클래스의 searchMember() 메소드 호출한다.
		-  Exception  발생하면  메시지를 Alert 다이얼로그 창에 출력 */	
		 
		btnSearch.addActionListener( new ActionListener (){
			 public void actionPerformed(ActionEvent e){		
				
				try{		
					String searchName = tfName.getText();
					if(searchName == null || searchName.trim().length()==0){
						openDialog("이름을 입력하세요.");
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
					openDialog("데이터를 찾을수 없습니다.");
				}catch(java.sql.SQLException sqle){
					System.err.println(sqle);
				}
			}
		});
	
	} // end Manager()

	public void launchFrame(){
		/* Panel에 setLayout 생성하고,add시킨다.	setSize method를 이용하여 크기결정 */

		// 전체 프레임의 사이즈 설정		
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
		
		// 프레임의 배경색 설정
		panel[5].setBackground(Color.yellow);
		panel[1].setBackground(new Color(215,238,249));
		panel[3].setBackground(new Color(215,238,249));
		panel[10].setBackground(new Color(215,238,249));
		panel[11].setBackground(new Color(215,238,249));
		panel[12].setBackground(new Color(215,238,249));
		panel[13].setBackground(new Color(215,238,249));
		panel[4].setBackground(new Color(215,238,249));
		panel[6].setBackground(new Color(215,238,249));

		// 프로그램 실행시 프레임이 display되도록 true설정
		frame.add(panel[0]);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
		
		connectDB();	
	} // end launchFrame()	
	
	public void connectDB(){
		//	1. Database 객체생성
		//    2. 연결되면  리스트에 모든 data 을 출력.
		System.out.println("connectDB메서드 호출");
		
		data = MemberDao.getInstance();
		displayAll();
		
		
    } //end connectDB()

	/* 리스트에 모든 data 를 출력시키는 메소드
	1. Database  클래스의 getAllMember() 이용하여  리스트에 add 시킨다.
	2. for 문 이용.	 */

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
			    "회원관리",
			    JOptionPane.ERROR_MESSAGE);	
	}
	public static void main(String [] args){
		JFrame.setDefaultLookAndFeelDecorated(true);
		Manager mem = new Manager();
		mem.launchFrame();
	} // end main()
} // end Manager class