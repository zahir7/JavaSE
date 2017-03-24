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
 * 회원정보를 입력 수정 삭제하는 MemberFrame 만들기.
 */
public class MemberFrame extends JFrame 
								implements ActionListener{
	//필요한 맴버 필드 정의하기
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel(); //주소 수정하기위한 페널
	//데이터를 입력 받을 TextField
	JTextField txt1 = new JTextField(10); //번호
	JTextField txt2 = new JTextField(10); //이름
	JTextField txt3 = new JTextField(10); //주소
	JTextField txt4 = new JTextField(10); //수정할 주소를 표시
	//버튼 객체
	JButton btnAdd = new JButton("추가"); //입력 버튼
	JButton btnList = new JButton("목록보기"); //목록보기 버튼
	JButton btnDelete = new JButton("삭제"); //삭제버튼
	JButton btnEdit = new JButton("수정");
	JButton btnSave = new JButton("저장");
	//회원 목록을 출력할 JTable 객체
	JTable table ;
	//테이블에 연결할 Modle 객체
	DefaultTableModel model;
	
	//생성자
	public MemberFrame(){
		//레이아웃 설정하기 (BorderLayout)
		setLayout(new BorderLayout());
		//페널에 컴포넌트 붙이기
		panel1.add(new JLabel("번호"));
		panel1.add(txt1);
		panel1.add(new JLabel("이름"));
		panel1.add(txt2);
		panel1.add(new JLabel("주소"));
		panel1.add(txt3);
		panel1.add(btnAdd);
		panel1.add(btnList); //페널에 버튼 추가
		panel1.add(btnDelete); //삭제
		//만든 페널을 프레임의 북쪽에 붙이기
		add(panel1, BorderLayout.NORTH);
		
		//페널 2 구성하기.
		panel2.add(new JLabel("수정할 주소"));
		panel2.add(txt4);
		panel2.add(btnEdit);  //수정버튼
		panel2.add(btnSave);  //저장버튼
		//만든 페널 2를 프레임의 남쪽에 붙이기
		add(panel2, BorderLayout.SOUTH);
		
		//출력할 테이블에 칼럼명 정하기
		String colNames[]={"번호","이름","주소"};
		//테이블에 연결할 모델객체 생성하기
		model = new DefaultTableModel(colNames, 0);

		//모델 객체를 생성자로 전달하면서 테이블 객체 생성하기
		table = new JTable(model);
		//데이터가 많으면 스크롤 되야함으로 스크롤 기능 추가하기
		JScrollPane sc=new JScrollPane(table);
		//스크롤 객체로 감싼 테이블을 화명의 가운데에 붙이기
		add(sc , BorderLayout.CENTER);
		
		//프레임의 위치와 크기 설정하기
		setBounds(100,100,700,500);
		//보이게 하기
		setVisible(true);
		//버튼을 동작하게 하기 위해서 리스너 객체 등록하기
		btnAdd.addActionListener(this);
		btnList.addActionListener(this);
		btnDelete.addActionListener(this);
		btnEdit.addActionListener(this);
		btnSave.addActionListener(this);
	}
	//리스너 객체를 등록한 버튼이 눌려 졌을때 호출되는 콜백 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnAdd){ //저장 버튼을 눌렀을때
			insert(); //저장하는 메소드 호출
			showList(); //목록보기 호출
		}else if(e.getSource() == btnList){ //목록보기 버튼을 눌렀을때
			showList();
		}else if(e.getSource() == btnDelete){ //삭제
			delete();
		}else if(e.getSource() == btnEdit){ //수정
			update();
		}else if(e.getSource() == btnSave){ //수정후 저장버튼
			save();
		}
	}
	//수정한 주소를 저장하는 메소드
	public void save(){
		//선택된 행
		int index=table.getSelectedRow();
		//수정할 정보의 primary key 값 읽어오기
		String strNum=(String)model.getValueAt(index, 0);
		int num=Integer.parseInt(strNum);
		//수정 입력한 주소 읽어오기
		String saveAddr=txt4.getText();
		//해당정보를 DTO 객체 생성하기.
		MemDTO dto=new MemDTO(num, null, saveAddr);
		//DB 에 반영하기
		MemDAO dao=new MemDAO();
		dao.update(dto);
		//목록보기
		showList();
		txt4.setText(""); //수정입력창 초기화
	}
	
	//삭제하는 메소드
	public void delete(){
		//선택된  row 의 인덱스값 얻어오기
		int index = table.getSelectedRow();
		
		if( index == -1 ){ //어느 row 도 선택하지 않았다면
			JOptionPane.showMessageDialog(this, "행을 선택!");
			return; //메소드를 끝내라
		}else{
			//삭제할 행의 primary key 값을 읽어온다.
			String strNum=(String)model.getValueAt(index, 0);
			int num = Integer.parseInt(strNum);
			//primary key 값을 가지고 가서 DB 에서 삭제한다.
			MemDAO dao=new MemDAO();
			dao.delete(num); //삭제
			showList();//목록보기 호출하기.
		}
	}
	//수정하는 메소드
	public void update(){
		//선택된 행을 읽어오기
		int index = table.getSelectedRow();
		if( index == -1){ //어떤행도 선택되지 않았다면
			return;//메소드를 끝내라
		}
		//선택된 행의 주소칼럼 읽어오기
		String addr=(String)model.getValueAt(index, 2);
		//모델에서 읽어온 데이터를 수정할 txt4 객체에 뿌려주기
		txt4.setText(addr);
	}
	
	//목록보기 버튼을 눌었을때 실행되는 메소드
	public void showList(){
		//DB 접속해서 회원 정보 얻어오기
		
		//MemDAO 객체 생성하기
		MemDAO dao=new MemDAO();
		
		ArrayList<MemDTO> list = dao.getList();
		
		//모델초기화 하기(내용 비우기)
		model.setRowCount(0); 
		//반복문 돌면서 배열의 내용을 모델객체에 넣어주기
		for(MemDTO tmp : list){
			int num = tmp.getNum();
			String name = tmp.getName();
			String addr = tmp.getAddr();
			//모델에 연결하기 위한 벡터 객체
			Vector<String> vec = new Vector<String>();
			vec.add(Integer.toString(num));
			vec.add(name);
			vec.add(addr);
			//모델에 연결한다.
			model.addRow(vec);
		}
	}
	
	
	//저장하는 메소드
	public void insert(){
		//입력한 내용 읽어오기
		int num = Integer.parseInt(txt1.getText());
		String name = txt2.getText();
		String addr = txt3.getText();
		//번호,이름,주소값을 MemDTO 형태로 포장하기
		MemDTO dto=new MemDTO(num, name, addr);
		//MemDAO 객체를 이용해서 DB 에 저장하기
		MemDAO dao=new MemDAO();
		//메소드 호출하면서 MemDTO 객체 전달하기.
		boolean result=dao.insert(dto); 
		if(result){
			JOptionPane.showMessageDialog(this, "저장성공!");
		}else{
			JOptionPane.showMessageDialog(this, "저장실패!");
		}
		//입력창 초기화 하기
		txt1.setText("");
		txt2.setText("");
		txt3.setText("");
		//포커스 주기
		txt1.requestFocus();
				
	}
	//프로그램의 시작이되는 메인 메소드
	public static void main(String[] args) {
		//객체를 생성해서 프레임이 보이도록 한다.
		new MemberFrame();
	}
}











