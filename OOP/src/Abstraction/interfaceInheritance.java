package Abstraction;
//mekedi karanne interface ekak thawath interface ekakin
//inherit wena eka so ita passe class ekakin implements wenawa

interface dog{
	void bark();
}

interface cat extends dog{
	void talk();
	
}

class  B implements cat{

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("this is from the dog barking");
	}

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("this is from the cat talking");
		
	}

	

	
	
}
public class interfaceInheritance {
	public static void main(String[] args) {
		B b=new B();
		b.talk();
		b.bark();
		
	}

}
