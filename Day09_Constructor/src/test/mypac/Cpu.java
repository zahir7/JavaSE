package test.mypac;
/*
 * 컴퓨터의 부품 Cpu 라고 가정하자.
 */
public class Cpu {
	private String type;
	//생성자
	public Cpu(String _type){
		type = _type;
	}
	//메소드
	public String getType(){
		return type;
	}
}
