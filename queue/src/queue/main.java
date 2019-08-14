package queue;

public class main {
	public static void main(String[] args) {
		IntQ Q1=new IntQ(5);
		Q1.enqueue(2);
		Q1.enqueue(4);
		Q1.enqueue(3);
		Q1.enqueue(6);
		System.out.println(Q1.dequeue());
		System.out.println(Q1.dequeue());
		Q1.enqueue(23);
		Q1.enqueue(14);
		Q1.enqueue(56);
		Q1.enqueue(49);
		System.out.println(Q1.isFull());
		Q1.printQ();
	}
}
