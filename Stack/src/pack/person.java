package pack;

public class person {
	private String name;
	private int age;
	private String field;
	
	public person(String name,int age,String field) {
		this.name=name;
		this.age=age;
		this.field=field;
	}
	public String getPerson() {
		return ("My name is "+this.name+" age is "+this.age+" my field is "+this.field);
	}
	
	public int  getNum() {
		return 23;
	}

}
