package linkList;

import linkList.linkList.Node;

public class personLinkList {
private Node root;
	
	class Node {
		private person value;
		private Node link;
	}
	
	public personLinkList(person item) {
		root=new Node();
		root.value=item;
		root.link=null;
	}
	
	public boolean createNode(person val) {
		Node n=new Node();
		n.value=val;
		n.link=root;
		root=n;
		return true;
	}
	
	public void printList() {
		Node h=root;
		while(h!=null) {
			h.value.getperson();
			h=h.link;
			
		}
	}
	
	public boolean deleteNode(person item) {
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
	
	public boolean insertLast(person item) {
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
