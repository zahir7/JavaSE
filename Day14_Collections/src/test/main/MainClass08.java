package test.main;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class MainClass08 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("����");		
		Calendar now = Calendar.getInstance();
		
		int week_yy = now.get(now.WEEK_OF_YEAR);
		int yy = now.get(now.YEAR);
		int mm = now.get(now.MONTH)+1; // 1���� 0�� ����Ѵ�.
		int dd = now.get(now.DAY_OF_MONTH);
		
		
		sb.append(week_yy);
		sb.append("��°��");
		sb.append(yy);
		sb.append("��");
		sb.append(mm);
		sb.append("��");
		sb.append(dd);		
		sb.append("��");
		
		SimpleDateFormat sdf = new SimpleDateFormat();
		System.out.println(sb);
		
	}

}
