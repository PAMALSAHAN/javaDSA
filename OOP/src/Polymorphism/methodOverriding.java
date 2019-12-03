package Polymorphism;

class Animal{
	public void run() {
		System.out.println("hellow this is from animal class ");
	}
}

class cat extends Animal{
	public void run() {
		System.out.println("this is from cat class");
	}
}

public class methodOverriding {
	
	public static void main(String[] args) {
		cat c =new cat();  //parent class eke thibba run eka cat eke tina run eken override wela tinne.
		c.run();
	}

}
