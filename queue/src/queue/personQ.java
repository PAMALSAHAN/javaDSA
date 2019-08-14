package queue;

public class personQ {
	private person[] queue;
	private int front;
	private int rear;
	private int total;
	private int size;
	
	public personQ() {
		front=0;
		rear=0;
		total=0;
		size=10;
		queue=new person[size];
	}
	public personQ(int size) {
		this.size=size;
		front=0;
		rear=0;
		total=0;
		queue=new person[this.size];
		
		
	}
	public boolean isFull() {
		if(total==size) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean enqueue(person item) {
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
	public person dequeue() {
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
			queue[i].getperson();
		}
	}
	

}
