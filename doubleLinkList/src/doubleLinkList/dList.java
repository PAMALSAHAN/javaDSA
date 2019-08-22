package doubleLinkList;

//import linkList.linkList.Node;

public class dList {
	private Node root;
	class Node{
		private Node left;
		private int value;
		private Node right;
	}
	
	public dList(int item) {
		root=new Node();
		root.value=item;
		root.left=null;
		root.right=null;
	}
	
	public boolean createNode(int item) {
		Node n=new Node();
		n.left=null;
		n.value=item;
		n.right=root;
		root.left=n;
		root=n;
		return true;
	}
	
	public void printList() {
		Node h=root;
		while(h!=null) {
			System.out.println(h.value);
			h=h.right;
			
		}
	}
	
	public boolean deleteNode(int item) {
		Node x=root;
		Node y=root;
		if(root.value==item) {
			root=root.right;
			return true;
		}
		
		while(x!=null) {
			while(x.value!=item) {
				y=x;
				x=x.right;
			}
			y.right=x.right;
			x.right=null;
			return true;
		}
		return false;
	}
	
	public boolean insertLast(int item) {
		Node n=new Node();
		n.value=item;
		Node x=root;
		while(x.right!=null) {
			x=x.right;
		}
		x.right=n;
		n.left=x;
		n.right=null;
		return true;
	}
	
	
	
}
