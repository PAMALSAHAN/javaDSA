package Abstraction;

interface bank {
	void draw();
}

class b1 implements bank{
	public void draw() {
		System.out.println("this is b1 drawing");
	}
}

class b2 implements bank{
	public void draw() {
		System.out.println("this is b2 drawing");
	}
}

public class interfaceWithClasses {

	public static void main(String[] args) {
		b2 c=new b2();
		c.draw();
	}
	

}
