package test.mypack;

import java.util.ArrayList;

public class BoardMain {
	public static void main(String[] args) {
		BoardDao dao = BoardDao.getInstance();
		BoardVo bvo = new BoardVo(
			"�ۼ�60","����60","����60","1111");
		/*
		boolean isSuccess = dao.insert(bvo);
		
		if(isSuccess)
			System.out.println("Board Insert ����");
		else
			System.out.println("Board Insert ����");
		
		bvo = new BoardVo(
				"�ۼ�62","����62","����62","2222");
		bvo.setNum(46);
		
		boolean isSuccess = dao.update(bvo);
		
		if(isSuccess)
			System.out.println("Board update ����");
		else
			System.out.println("Board update ����");
		
		
		boolean isSuccess = dao.delete(43);
		
		if(isSuccess)
			System.out.println("Board delete ����");
		else
			System.out.println("Board delete ����");
		
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
