package Abstraction;
//meka java 8 walata witharai hariyanne

interface Drawable{
	 void draw();
	 static int cube(int x){
		 return x*x*x;
	 }
}

class C implements Drawable{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("this is drawing");
		
	}
	
}
public class staticInterface {
	public static void main(String[] args) {
		C c=new C();
		c.draw();
		System.out.println(Drawable.cube(3));
	}
	
}
// static method kiyanne eka object ekak hadanne natiwa call karanna puluwan.hama object ekatama use karana eka thamai 
//eke aramuna
