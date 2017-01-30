package test.mypac;

public class ChanelBag {
	
	public String[] items=new String[5];
	int index=0; //배열의 인덱스를 지정하기 위해
	public String color="검정색";
	//가방의 기능(Method 만들기)
	public void setItem(){
		System.out.println("물품을 보관해요!");
	}
	public void setItem(String item){
		if(index==5){
			System.out.println("더이상 물품을 보관할수 없습니다.");
			return;
		}
		//인자로 전달받은 문자열을 배열에 저장하기.
		items[index]=item;
		index = index + 1;
		System.out.println(item+" 을 보관했습니다.");
	}
}









