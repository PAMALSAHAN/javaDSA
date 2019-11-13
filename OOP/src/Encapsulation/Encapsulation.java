package Encapsulation;

class A{
	public String name;
	public int age;
	
	public A(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
}
public class Encapsulation {
	
	public static void main(String[] args) {
		A a=new A("pamal",32);
		System.out.println(a.getAge());
		System.out.println(a.getName());
	}

}
