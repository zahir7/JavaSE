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
 * 게시판 글 입력 및 간단히 글 목록을 조회할수 있는 프레임 만들기
 */
public class BoardFrame extends JFrame {
	//글입력 및 버튼을 배치할 페널
	JPanel panel=new JPanel();
	JTextField txtTitle=new JTextField(10);
	JTextField txtContent=new JTextField(10);
	JButton btnAdd=new JButton("글입력");
	JButton btnList=new JButton("목록보기");
	//글내용을 출력할 TextArea
	JTextArea txtArea=new JTextArea(30,30);
	
	//생성자
	public BoardFrame(){
		//레이아웃 설정
		setLayout(new BorderLayout());
		//페널에 컴포넌트 추가 하기
		panel.add(new JLabel("글제목"));
		panel.add(txtTitle);
		panel.add(new JLabel("글내용"));
		panel.add(txtContent);
		panel.add(btnAdd);
		panel.add(btnList);
		//구성한 페널을 프레임의 북쪽에 붙이기
		add(panel, BorderLayout.NORTH);
		add(txtArea, BorderLayout.CENTER);
		
		setBounds(100, 100, 600, 400);
		setVisible(true);
		//버튼에 액션 리스너 등록하기
		btnAdd.addActionListener(listener);
		btnList.addActionListener(listener);
		
	}
	//메인 메소드
	public static void main(String[] args) {
		new BoardFrame();
	}
	//익명의 InnerClass 를 이용해서 ActionListener 인터페이스를 구현한
	//객체 생성하기
	ActionListener listener=new ActionListener() {
		//이 리스너를 등록한 버튼이 눌려졌을때 호출되는 콜백 메소드
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btnAdd){ //글등록 버튼을 눌렀을때
				insert();
			}else if(e.getSource() == btnList){ //목록보기 버튼
				showList();
			}
			
		}
	};
	//글 등록하는 메소드
	public void insert(){
		//입력한 제목 과 글 내용을 읽어온다.
		String title=txtTitle.getText();
		String content=txtContent.getText();
		//읽어온 내용을 이용해서 DTO 객체를 생성한다.
		BoardDTO dto=new BoardDTO(0, title, content, null);
		//DAO 객체의 참조 값을 얻어온다.
		//JBoardDAO dao=JBoardDAO.getInstance();
		IBoardDAO dao=new IBoardDAO();
		
		//DAO 객체를 이용해서 DB 에 저장한다.
		dao.insert(dto);
		//입력창 초기화
		txtTitle.setText("");
		txtContent.setText("");
	}
	//글 목록 보여주는 메소드
	public void showList(){
		//JDBC DAO 객체
		//JBoardDAO dao=JBoardDAO.getInstance();
		//IBATIS DAO 객체
		IBoardDAO dao=new IBoardDAO();
		
		ArrayList<BoardDTO> list=dao.getList();
		StringBuffer sBuff=new StringBuffer();
		//반복문 돌면서 배열에 있는 내용을 읽어와서 StringBuffer 객체에 저장
		for(BoardDTO tmp : list){
			sBuff.append(tmp.getNum()+" / ");
			sBuff.append(tmp.getTitle()+" / ");
			sBuff.append(tmp.getContent()+" / ");
			sBuff.append(tmp.getRegdate()+"\r\n");
		}
		//StringBuffer 객체에들어있는 내용 출력하기
		txtArea.setText(sBuff.toString());
	}
}












