package linkList;

public class linkList {
	private Node root;
	
	class Node {
		private int value;
		private Node link;
	}
	
	public linkList(int item) {
		root=new Node();
		root.value=item;
		root.link=null;
	}
	
	public boolean createNode(int val) {
		Node n=new Node();
		n.value=val;
		n.link=root;
		root=n;
		return true;
	}
	
	public void printList() {
		Node h=root;
		while(h!=null) {
			System.out.println(h.value);
			h=h.link;
			
		}
	}
	
	public boolean deleteNode(int item) {
		Node x=root;
		Node y=root;
		if(root.value==item) {
			root=root.link;
			return true;
		}
		
		while(x!=null) {
			while(x.value!=item) {
				y=x;
				x=x.link;
			}
			y.link=x.link;
			x.link=null;
			return true;
		}
		return false;
	}
	
	public boolean insertLast(int item) {
		Node n=new Node();
		n.value=item;
		Node x=root;
		while(x.link!=null) {
			x=x.link;
		}
		x.link=n;
		return true;
	}

}
