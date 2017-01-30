package test.main;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainClass01 {
	public static void main(String[] args) throws Exception {
		
		//c����̺긦 File ��ü�� �����Ѵ�.
		File f = new File("http://test.edupen.com/javajsp01/");
		
		//c ����̺� ������ �ִ� ��� ���丮 �� ������ ��ȯ�Ѵ�.
		String[] list = f.list();
		
		//Calendar ��ü�� ���� �ý��� ��¥�� �����Ѵ�.
		Calendar c = Calendar.getInstance();
		
		for(String temp : list){
			//c����̺��� ���� ���丮 �� ������ File ��ü�� �����Ѵ�.
			File f2 = new File(f,temp);
			
			//1970�� 1��1�� ���� ���� ������ ��¥�� �и������� ��ȯ 
			long lastMod = f2.lastModified();
			
			//���� ���� �Ǵ� ���丮�� ������ ������ ��¥�� Calendar
			//��ü�� �ٽ� �����Ѵ�.
			c.setTimeInMillis(lastMod);
			
			//SimpleDateFormat ��ü�� Ȱ���ؼ� ��¥ ������ ���Ѵ�.
			//yyyy - �⵵ , MM - ��(01), M-��(1), dd - ��
			//a - ����, ���� , hh - ��(0-12) , HH - ��(0-23)
			//mm - �� , ss - ��
			SimpleDateFormat s = new SimpleDateFormat(
					"yyyy��MM��dd��  a hh:mm");
			
			
			//format(Date d) : string
			//Calendar ��ü�� Date ��ü�� ��ȯ�ϴ� �޼��� getTime()
			
			String today1 = s.format(c.getTime());
			/*
			int year = c.get(Calendar.YEAR);
			int month = c.get(Calendar.MONTH)+1;
			int date = c.get(Calendar.DATE);
			
			int hour = c.get(Calendar.HOUR);
			int minute = c.get(Calendar.MINUTE);
			int second = c.get(Calendar.SECOND);
			String today = year+"��"+month+"��"+date+"�� "+
						hour+":"+minute+":"+second;
			*/
			
			//isDirectory() ���丮�̸� true, �����̸� false
			if(f2.isDirectory()){
				//f2 => c:\android-sdk_r16-windows
				//getName() :  ���ϸ� �Ǵ� ���丮
				//getPath() : c:\android-sdk_r16-windows
				
				System.out.print(f2.getName()+"(���丮) - ");
				System.out.println(today1);
			}
			
		}
		
		for(String temp : list){
			File f2 = new File(f,temp);
			long lastMod = f2.lastModified();
			c.setTimeInMillis(lastMod);
			SimpleDateFormat s = new SimpleDateFormat(
					"yyyy��MM��dd��  a hh:mm");
			String today1 = s.format(c.getTime());
			//isFile() ���ϰ�ü�� �����̸� true, ���丮�̸� false
			if(f2.isFile()){
				//���ڸ� ���ڿ��� ��ȯ���Ŀ� �޸��� �� ���ڿ��� ��ȯ
				//f2.legnth() => ������ ����(long)
				//���ڿ��� ���� => length()
				//�迭�� ���� => length
				//Collection�� ũ�� => size()
				String size = 
						String.format("%,d",f2.length());
				
				System.out.print(f2.getName()+
						"(����)-"+size+"byte - ");
				System.out.println(today1);
			}
		}
		
		
		File f3 = new File("c:\\","test.txt");
		//������ �����ϸ� true, �������� ���ϸ� false
		f3.createNewFile();
		//���丮 �� ������ �����ϸ� true, �������� ���ϸ� false
		//f3.delete();
		
		
		File f4 = new File("c:\\upload\\2012\\2\\1");
		//���� ���丮���� �����ϸ� true, �������� ���ϸ� false
		//���� ���丮�� �����Ѵ�.(mkdir())
		f4.mkdirs();
		
		File f5 = new File(f4,"v1.vset.test.txt");
		f5.createNewFile();
		
		//fileName => v1.vset.test.txt
		String fileName = f5.getName();
		
		//���� �ý��� ��¥�� Calendar ��ü�� �����Ѵ�.
		c = Calendar.getInstance();
		
		//1970�� 1��1�� ���� ���� �ý��� ��¥������ �ð��� �и�������� ��ȯ
		long mills = c.getTimeInMillis();
		
		//fileName => v1.vset.test.txt
		//name =>v1.vset.test
		//lastIndex(".") ���ڿ��� ���������� "."�� ã�Ƽ� ���ڿ� ó������
		//"."������ index�� ��ȯ�Ѵ�.
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
