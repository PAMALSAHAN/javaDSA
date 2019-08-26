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
				if(item.getName().compareTo(c.value.getName())>0) {
					c=c.right;
				}
				else {
					c=c.left;
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
			System.out.println(""+p.value);
			showAll(p.left);
			showAll(p.right);
			
		}
	}

}
