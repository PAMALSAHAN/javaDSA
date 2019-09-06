package tree;

public class bst {
	private node root;
	class node{
		private node left;
		private person value;
		private node right;
	}
	
	public bst() {
		root =null;
	}
	public boolean insert(person item) {
		node n=new node();
		n.value=item;
		n.left=null;
		n.right=null;
		if(root==null) {
			root=n;
		}
		else {
			node p=root;
			node c=root;
			while(c!=null) {
				p=c;
				if(item.getName().compareTo(c.value.getName())<0) {
					c=c.left;
				}
				else {
					c=c.right;
				}
			}
			if(item.getName().compareTo(p.value.getName())<0) {
				p.left=n;
			}
			else {
				p.right=n; 
			}
			
		}
		return true;
	}
	
	public void showAll(node n) {
		node p=n;
		if(p!=null) {
			p.value.getperson();
			showAll(p.left);
			showAll(p.right);
			
		}
	}
	
	public node findNode(String key) {
		node c;
		c=root;
		while(c!=null) {
			if(key.compareTo(c.value.getName())==0) {
				break;
			}
			if(key.compareTo(c.value.getName())<0){
				c=c.left;
			}
			else {
				c=c.right;
			}
		}
		
		return c;
	}
	
	public node findParent(String key) {
		node c=root;
		node p=root;
		while(c!=null) {
			
			if(key.compareTo(c.value.getName())==0) {
				break;
			}
			p=c;
			if(key.compareTo(c.value.getName())<0) {
				c=c.left;
			}
			else {
				c=c.right;
			}
			
		}
		if(c!=null) {
			return p;
		}
		else {
			return null;
		}
	}
	
	public person getData(node n) {
		return n.value;
	}
	
	


}
