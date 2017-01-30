package study20120229;

import java.util.HashSet;
import java.util.Iterator;
class Test{
	private String name;
	Test(String name){
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test other = (Test) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Test [name=" + name + "]";
	}
	
	
}
public class SetDemo {
	public static void main(String[] args) {
		HashSet s = new HashSet();
		/*while(true){
			if(s.size() == 6) break;
			int random = (int)(Math.random()*45)+1;
			s.add(random);
		}
		
		Iterator iterator = s.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next()+" ");
		}*/
		s.add(new String("성영한"));
		s.add(new String("성영한"));
		s.add(new String("성영한"));
		s.add(new String("성영한"));
		
		Iterator iterator = s.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next()+" ");
		}
		
		
		
	}
}
