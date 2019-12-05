package Polymorphism;

class Mamal{
	String color="blue";
}
class dog extends Mamal{
	String color="red";
	
	void printColor() {
		System.out.println(color);
		System.out.println(super.color);
	}
}


public class SuperKeyWord {
	public static void main(String[] args) {
		dog di=new dog();
		di.printColor();
		
	}
}
