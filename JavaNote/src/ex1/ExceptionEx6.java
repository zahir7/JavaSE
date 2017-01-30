package ex1;

import javax.management.RuntimeErrorException;

public class ExceptionEx6 {
	public static void main(String[] args) {		
		try {
			throw new Exception(); //Exception을 강제로 발생
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
