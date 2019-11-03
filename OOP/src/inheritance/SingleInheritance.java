package inheritance;
 class Animal{
	
	public void eating() {
		System.out.println("this is from animal class eating");
	}
	
}

class Dog extends Animal { // meke public class ekak hadanna one nam karanna one class ekenma file ekak hadanna one.
	public void eat() {
		System.out.println("this is dog eating");
	}

}
public class SingleInheritance {
	
	
	public static void main(String[] args) {
		Dog d=new Dog();
		d.eat();
		d.eating();
	}
	

}


