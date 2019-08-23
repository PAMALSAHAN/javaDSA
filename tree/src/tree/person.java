package tree;

public class person {
	private String name;
	private int age;
	private String qulity;
	
	public person(String name,int age,String qulity) {
		this.name=name;
		this.age=age;
		this.qulity=qulity;
	}
	public void getperson(){
		System.out.println("my name is :"+this.name+ "and my age is :"+this.age+"and i have qulity :"+this.qulity);
	}
}
