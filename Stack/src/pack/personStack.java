package pack;

public class personStack {
	private person[] stak;
	private int top;
	private int size;
	
	public personStack(int size) {
		this.size=size;
		this.top=-1;
		stak=new person[this.size];
	}
	public personStack() {
		this.size=20;
		this.top=-1;
		stak=new person[size];
	}
	
	public boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isFull() {
		if(top==stak.length-1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void push(person a) {
		if(isFull()) {
			
			System.out.println("Out Of Memory");
		}
		else {
			stak[++top]=a;
		}
	}
	
	public person pop() {
		return stak[top--];
	}

}
