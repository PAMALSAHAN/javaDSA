package Polymorphism;

class Bike{
	public void run() {
		System.out.println("bike riding...");
	}
}
public class methodOverLoading extends Bike {
	
	 public void run() {
		System.out.println("this methd running ");
	}
	 public void sound() {
		 System.out.println("in this method we are use sound method ");
	 }

	public static void main(String[] args) {
		
		methodOverLoading m=new methodOverLoading();
		m.run();
		m.sound();   //meke methodOverLOading kiyala dapu nisa thamai sound kiyana eka wada kranne.
					// nathnam wada karanne naha.bike kiyana eka damma nam meke sound kiyana function eka ganne 
					// naha.mokada eke variable ekata sound kiyana eka alla ganna baha.
		
		
	}
}
