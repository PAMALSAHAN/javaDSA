package pack;

public class stack {
	private int[] stak;
	private int top;
	private int size;
	
	public stack(int size) {
		this.size=size;
		this.top=-1;
		stak=new int[this.size];
	}
	public stack() {
		this.size=20;
		this.top=-1;
		stak=new int[size];
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
	
	public void push(int a) {
		if(isFull()) {
			
			System.out.println("Out Of Memory");
		}
		else {
			stak[++top]=a;
		}
	}
	
	public int pop() {
		return stak[top--];
	}
	
}
