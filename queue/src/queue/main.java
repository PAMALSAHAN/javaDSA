package queue;

public class main {
	public static void main(String[] args) {
//		IntQ Q1=new IntQ(5);
//		Q1.enqueue(2);
//		Q1.enqueue(4);
//		Q1.enqueue(3);
//		Q1.enqueue(6);
//		System.out.println(Q1.dequeue());
//		System.out.println(Q1.dequeue());
//		Q1.enqueue(23);
//		Q1.enqueue(14);
//		Q1.enqueue(56);
//		Q1.enqueue(49);
//		System.out.println(Q1.isFull());
//		Q1.printQ();
		
		// this is use to initialize person objects
		person p1=new person("pamal", 23, "cs");
		person p2=new person("akitha", 25, "cs");
		person p3=new person("nuwan", 45, "cs");
		person p4=new person("mishan", 13, "cs");
		person p5=new person("asiri", 63, "cs");
		person p6=new person("chamath", 93, "cs");
		person p7=new person("nipuna", 33, "cs");
		person p8=new person("akila", 38, "cs");
		
		personQ Q1=new personQ(5);
		
		Q1.enqueue(p1);
		Q1.enqueue(p2);
		Q1.enqueue(p3);
		Q1.enqueue(p4);
		Q1.dequeue().getperson();
		Q1.dequeue().getperson();
		Q1.enqueue(p5);
		Q1.enqueue(p6);
		Q1.enqueue(p7);
		Q1.enqueue(p8);
		System.out.println(Q1.isFull());
		Q1.printQ();
		
		
		
	}
}
