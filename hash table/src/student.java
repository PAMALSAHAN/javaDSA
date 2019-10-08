
public class student {
	private String name;
	private int age;
	private String school;
	private String roll_no;
	
	public student(String n,int a,String s) {
		this.name=n;
		this.age=a;
		this.roll_no=s;
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
	public String getRollNo() {
		return roll_no;
	}
	public void setRollNo(String s) {
		this.roll_no=s;
	}
	public void getPersonInfo() {
		System.out.println("My name is "+this.name +"My age is "+this.age+"My roll no is "+this.roll_no);
		
	}
	

}
