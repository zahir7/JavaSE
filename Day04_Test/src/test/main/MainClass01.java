package test.main;

import test.mypac.ChanelBag;
import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartHandPhone;

public class MainClass01 {
	
	//���α׷��� ������ �Ǵ� ���� �޼ҵ�
	public static void main(String[] args) {
		//SmartHandPhone ��ü �����ϱ�
		Object obj = new SmartHandPhone();
		Phone phone = new SmartHandPhone();
		HandPhone handphone = new SmartHandPhone();
		SmartHandPhone smart = new SmartHandPhone();
		
		SmartHandPhone smart2 = (SmartHandPhone)obj;
		smart.mobileCall();
	}
}







