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
			
		}
		return true;
	}

}
