package test.main;

import test.mypac.AndroidPhone;
import test.mypac.HandPhone;

public class MainClass05 {
	
	public static void main(String[] args) {
		//HandPhone ��ü �����ϱ�.
		HandPhone phone = new HandPhone();
		HandPhone phone2 = phone; 
		//�޼ҵ� ����ϱ� 
		phone.call();
		phone2.call();
		//AndroidPhone ��ü �����ϱ�
		AndroidPhone aPhone=new AndroidPhone();
		aPhone.call();
		aPhone.doInternet();
	
	}
}
