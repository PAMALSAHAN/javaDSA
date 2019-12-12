// fix the error
public class finite {

	static int count=0;
	
	static void p() {
		
		if(count<5) {
			System.out.println("help"+count);
			count++;
			p();
			
		}
		
	}
	
	public static void main(String[] args) {
		p();
	}
}
