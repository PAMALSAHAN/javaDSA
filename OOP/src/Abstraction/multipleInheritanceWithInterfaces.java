package Abstraction;

interface printable{
	public void print();
	static int num=0;
	public void ambiguity();
}

interface showable{
	public void show();
	static int num=0;
	public void ambiguity();
	void print();
}

class A implements printable,showable{
	

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("this is class A and printing ");
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("this is class A and showing");
		
	}

	@Override
	public void ambiguity() {
		// TODO Auto-generated method stub
		System.out.println("in here there in no any ambiguity");
	}
	
	
}

public class multipleInheritanceWithInterfaces {

	public static void main(String[] args) {
		A a=new A();
		a.show();
		a.print();
		a.ambiguity();
		
		//class wala mutiple inheritance use karanna baha.ekata hethuwa thamai function body ekak ewala declare karana 
		// eka.
	}
}
