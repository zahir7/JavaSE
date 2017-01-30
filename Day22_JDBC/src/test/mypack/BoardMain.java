package test.mypack;

import java.util.ArrayList;

public class BoardMain {
	public static void main(String[] args) {
		BoardDao dao = BoardDao.getInstance();
		BoardVo bvo = new BoardVo(
			"작성60","제목60","내용60","1111");
		/*
		boolean isSuccess = dao.insert(bvo);
		
		if(isSuccess)
			System.out.println("Board Insert 성공");
		else
			System.out.println("Board Insert 실패");
		
		bvo = new BoardVo(
				"작성62","제목62","내용62","2222");
		bvo.setNum(46);
		
		boolean isSuccess = dao.update(bvo);
		
		if(isSuccess)
			System.out.println("Board update 성공");
		else
			System.out.println("Board update 실패");
		
		
		boolean isSuccess = dao.delete(43);
		
		if(isSuccess)
			System.out.println("Board delete 성공");
		else
			System.out.println("Board delete 실패");
		
		*/
		
		ArrayList<BoardVo> list = dao.select();
		
		for(BoardVo vo : list){
			int num = vo.getNum();
			String writer = vo.getWriter();
			String title = vo.getTitle();
			String content = vo.getContent();
			String pwd = vo.getPwd();
			int hit = vo.getHit();
			String regdate = vo.getRegdate();
			System.out.printf("%d,%s,%s,%s,%s,%d,%s %n",
				num,writer,title,content,pwd,hit,regdate);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
