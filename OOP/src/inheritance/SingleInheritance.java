package inheritance;

public class SingleInheritance {
	public class Animal{
		
		void eat() {
			System.out.println("this is from animal class eating");
		}
		
	}
	
	public class Dog extends Animal {
		void eat() {
			System.out.println("this is dog eating");
		}
		
	}
	

}


