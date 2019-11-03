package inheritance;
class Anima{
	void eat() {
		System.out.println("this is from eat animal");
	}
}
class Do extends Anima{
	void bark() {
		System.out.println("this is from dog barking");
	}
	
}
class Cat extends Anima{
	void mew() {
		System.out.println("this is from cat mew");
	}
}
public class HirerarchicalInheritance {
	public static void main(String[] args) {
		Cat c=new Cat();
		c.eat();
		c.mew();
	}

}
