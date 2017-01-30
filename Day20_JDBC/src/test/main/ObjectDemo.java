package test.main;

import java.util.ArrayList;

public class ObjectDemo extends Object{
	private String name;
	private String email;
	public ObjectDemo(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
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
		ObjectDemo other = (ObjectDemo) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	

	@Override
	public String toString() {
		return "ObjectDemo [name=" + name + ", email=" + email + "]";
	}


	public static void main(String[] args) {
		ObjectDemo o1 = new ObjectDemo("성영한1","syh@h.com");
		ObjectDemo o2 = new ObjectDemo("성영한","syh@h.com");
		System.out.println(o1==o2);
		//Object의 equals()메서드  == 같은 기능
		System.out.println(o1.equals(o2));
		
		
		ArrayList list = new ArrayList();
		list.add(new ObjectDemo("성영한1","syh@h.com"));
		list.add(new ObjectDemo("성영한2","syh@h.com"));
		list.add(new ObjectDemo("성영한3","syh@h.com"));
		list.add(new ObjectDemo("성영한4","syh@h.com"));
		list.add(new ObjectDemo("성영한1","syh@h.com"));
		list.add(new ObjectDemo("성영한6","syh@h.com"));
		list.add(new ObjectDemo("성영한7","syh@h.com"));
		list.add(new ObjectDemo("성영한8","syh@h.com"));
		
		int count =0;
		for(int i=0;i<list.size();i++){
			ObjectDemo temp = (ObjectDemo)list.get(i);
			if(o1.equals(temp)){
				count++;
			}
		}
		
		System.out.println(o1);
	}
}






