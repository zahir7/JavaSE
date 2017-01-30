package test.main;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainClass01 {
	public static void main(String[] args) throws Exception {
		
		//c드라이브를 File 객체로 생성한다.
		File f = new File("http://test.edupen.com/javajsp01/");
		
		//c 드라이브 하위에 있는 모든 디렉토리 및 파일을 반환한다.
		String[] list = f.list();
		
		//Calendar 객체를 현재 시스템 날짜로 생성한다.
		Calendar c = Calendar.getInstance();
		
		for(String temp : list){
			//c드라이브의 하위 디렉토리 및 파일을 File 객체로 생성한다.
			File f2 = new File(f,temp);
			
			//1970년 1월1일 부터 현재 수정한 날짜를 밀리세컨드 반환 
			long lastMod = f2.lastModified();
			
			//현재 파일 또는 디렉토리의 마지막 수정한 날짜를 Calendar
			//객체로 다시 설정한다.
			c.setTimeInMillis(lastMod);
			
			//SimpleDateFormat 객체를 활용해서 날짜 포맷을 정한다.
			//yyyy - 년도 , MM - 월(01), M-월(1), dd - 일
			//a - 오전, 오후 , hh - 시(0-12) , HH - 시(0-23)
			//mm - 분 , ss - 초
			SimpleDateFormat s = new SimpleDateFormat(
					"yyyy년MM월dd일  a hh:mm");
			
			
			//format(Date d) : string
			//Calendar 객체를 Date 객체로 변환하는 메서드 getTime()
			
			String today1 = s.format(c.getTime());
			/*
			int year = c.get(Calendar.YEAR);
			int month = c.get(Calendar.MONTH)+1;
			int date = c.get(Calendar.DATE);
			
			int hour = c.get(Calendar.HOUR);
			int minute = c.get(Calendar.MINUTE);
			int second = c.get(Calendar.SECOND);
			String today = year+"년"+month+"월"+date+"일 "+
						hour+":"+minute+":"+second;
			*/
			
			//isDirectory() 디렉토리이면 true, 파일이면 false
			if(f2.isDirectory()){
				//f2 => c:\android-sdk_r16-windows
				//getName() :  파일명 또는 디렉토리
				//getPath() : c:\android-sdk_r16-windows
				
				System.out.print(f2.getName()+"(디렉토리) - ");
				System.out.println(today1);
			}
			
		}
		
		for(String temp : list){
			File f2 = new File(f,temp);
			long lastMod = f2.lastModified();
			c.setTimeInMillis(lastMod);
			SimpleDateFormat s = new SimpleDateFormat(
					"yyyy년MM월dd일  a hh:mm");
			String today1 = s.format(c.getTime());
			//isFile() 파일객체가 파일이면 true, 디렉토리이면 false
			if(f2.isFile()){
				//숫자를 문자열로 변환한후에 콤마를 찍어서 문자열로 반환
				//f2.legnth() => 파일의 길이(long)
				//문자열의 길이 => length()
				//배열의 길이 => length
				//Collection의 크기 => size()
				String size = 
						String.format("%,d",f2.length());
				
				System.out.print(f2.getName()+
						"(파일)-"+size+"byte - ");
				System.out.println(today1);
			}
		}
		
		
		File f3 = new File("c:\\","test.txt");
		//파일을 생성하면 true, 생성하지 못하면 false
		f3.createNewFile();
		//디렉토리 및 파일을 삭제하면 true, 삭제하지 못하면 false
		//f3.delete();
		
		
		File f4 = new File("c:\\upload\\2012\\2\\1");
		//하위 디렉토리들을 생성하면 true, 생성하지 못하면 false
		//하위 디렉토리를 생성한다.(mkdir())
		f4.mkdirs();
		
		File f5 = new File(f4,"v1.vset.test.txt");
		f5.createNewFile();
		
		//fileName => v1.vset.test.txt
		String fileName = f5.getName();
		
		//현재 시스템 날짜로 Calendar 객체를 생성한다.
		c = Calendar.getInstance();
		
		//1970년 1월1일 부터 현재 시스템 날짜까지의 시간을 밀리세컨드로 반환
		long mills = c.getTimeInMillis();
		
		//fileName => v1.vset.test.txt
		//name =>v1.vset.test
		//lastIndex(".") 문자열중 마지막에서 "."을 찾아서 문자열 처음부터
		//"."까지의 index를 반환한다.
		String name = fileName.substring(
				0,fileName.lastIndexOf("."));
		
		//ext => .txt
		String ext = fileName.substring(
				fileName.lastIndexOf(".")+1);
		
		//rename =>12312312321.txt
		String rename = mills+"."+ext;
		
		
		//f5 : c:\\upload\\2012\\2\\1\\v1.vset.test.txt
		//f4 : c:\\upload\\2012\\2\\1
		//rename : 12312312321.txt
		f5.renameTo(new File(f4,rename));
		
		
		//f3.renameTo(new File("c:\\","test1.txt"));		
		
	}
}
