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
			case RED : System.out.println("빨간색..");break;
			case GREEN : System.out.println("녹색..");break;
			case BLUE : System.out.println("파란색..");break;
		}
	}
	public static void main(String[] args) {
		
		new EnumDemo().switch1(Color.RED);
		
		for(Color c : Color.values()){
			System.out.println(c + " , "+c.ordinal()+","+
					c.getRbg());
		}
		
		// true => nothing
		// false => 실행시 에러 발생 AssertionEror 하고
		//"error 났어요..." 출력
		// java -ea EnumDemo => assert 활성화 시켜라.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

