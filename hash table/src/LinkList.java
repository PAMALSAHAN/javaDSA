
public class LinkList {
	private node n;
	
	class node{
		private  node next;
		private student value;
	}
	
	public LinkList() {
		n=new node();
		n.next=null;
		n.value=null;
	}
	
	public boolean insert(student s) {
		node p=new node();
		p.value=s;
		p.next=n.next;
		n.next=p;
		
		return true;
	}
	
	
}
