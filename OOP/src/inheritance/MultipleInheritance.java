package inheritance;
class Vehicle{
	void sound() {
		System.out.println("this is from vehicle sound");
	}
}
class Bike extends Vehicle{
	void bark() {
		System.out.println("this is from dog bark");
	}
}
class FootBike extends Bike{
	void barking() {
		System.out.println("this is from baby dog barking");
	}
}
public class MultipleInheritance {
	public static void main(String[] args) {
		FootBike b=new FootBike();
		b.barking();
		b.bark();
		b.sound();
		
	}
	

}
