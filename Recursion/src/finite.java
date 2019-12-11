
public class finite {

	static int count=0;
	
	static void p() {
		count++;
		if(count<5) {
			System.out.println("help"+count);
			p();
		}
	}
	
	public static void main(String[] args) {
		p();
	}
}
