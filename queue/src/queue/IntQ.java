package queue;

public class IntQ {
	private int[] queue;
	private int front;
	private int rear;
	private int total;
	private int size;
	
	public IntQ() {
		front=0;
		rear=0;
		total=0;
		size=10;
		queue=new int[size];
	}
	public IntQ(int size) {
		this.size=size;
		front=0;
		rear=0;
		total=0;
		queue=new int[this.size];
		
		
	}
	public boolean isFull() {
		if(total==size) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean enqueue(int item) {
		if(isFull()) {
			return false;
		}
		else {
			queue[front%size]=item;
			front++;
			total++;
			return true;
		}
	}
	public int dequeue() {
		total--;
		return queue[rear++];	
	}
	
	public boolean isEmpty() {
		if(rear==0 && front==0) {
			return true;
		}
		else if(rear==front+1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void printQ() {
		int i;
		for(i=0;i<size;i++) {
			System.out.println(queue[i]);
		}
	}
	
}
