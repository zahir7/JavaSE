package student;
// 생성자 인자값으로 문자열을 받아서 초기화
public class RecordNotFoundException extends Exception{
	public RecordNotFoundException(String message){
		super(message);
	}
}