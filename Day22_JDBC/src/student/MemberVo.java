package student;
public class MemberVo{
	private String name;
	private int  height;
	private int  age;
	private int weight;
	private String sex;


	public MemberVo()	{ }
	public MemberVo(String name , int height, int age, int weight, String sex) {
		this.name = name;
		this.height = height;
		this.age = age;
		this.weight = weight;
		this.sex = sex;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String toString(){
		return ( "            "+name + "             " + height + "                 " + age + "                  " + weight + "                  "  + sex );
	}
	
}