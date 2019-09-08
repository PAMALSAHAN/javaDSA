
public class student {
	private String name;
	private int age;
	private String school;
	
	public student(String n,int a,String s) {
		this.name=n;
		this.age=a;
		this.school=s;
	}
	
	public String  getName(String n) {
		return name;
	}
	public void setName(String n) {
		this.name=n;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int a) {
		this.age=a;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String s) {
		this.school=s;
	}
	public void getPersonInfo() {
		System.out.println("My name is "+this.name +"My age is "+this.age+"My school is "+this.school);
		
	}

}
