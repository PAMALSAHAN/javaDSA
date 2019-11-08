package Abstraction;

abstract class shapes{
	abstract public void draw();
}

class rectangle extends shapes {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("this is rectangle drawing");
	}
	
}

class circle extends shapes {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("this is circle");
		
	}
	
}	

public class abstracton {
	
	public static void main(String[] args) {
		circle c=new circle();
		c.draw();
	}
}

