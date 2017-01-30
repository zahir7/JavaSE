package study20120308;
class Color{
	public static final int RED=0xff0000;
	public static final int GREEN=0x00ff00;
}

public class EnumDemo {
	boolean stop;
	
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	enum Color{
		RED(0xff0000), GREEN(0x00ff00), BLUE(0x0000ff);
		private final int rgb;
		Color(int rgb){
			this.rgb = rgb;
		}
		public int getRbg(){
			return rgb;
		}
	}
	public void switch1(Color color){
		switch(color){
			case RED : System.out.println("������..");break;
			case GREEN : System.out.println("���..");break;
			case BLUE : System.out.println("�Ķ���..");break;
		}
	}
	public static void main(String[] args) {
		
		new EnumDemo().switch1(Color.RED);
		
		for(Color c : Color.values()){
			System.out.println(c + " , "+c.ordinal()+","+
					c.getRbg());
		}
		
		// true => nothing
		// false => ����� ���� �߻� AssertionEror �ϰ�
		//"error �����..." ���
		// java -ea EnumDemo => assert Ȱ��ȭ ���Ѷ�.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

