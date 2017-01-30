package study20120223;

public class GarbageDemo {
	private int num;

	public GarbageDemo(int num) {
		super();
		this.num = num;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("garbage : "+num);
	}
	
	public static void main(String[] args) {
		GarbageDemo g1 = new GarbageDemo(1);
		g1 = new GarbageDemo(2);
		g1 = new GarbageDemo(3);
		g1 = new GarbageDemo(4);
		g1 = null;
		System.gc();
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
