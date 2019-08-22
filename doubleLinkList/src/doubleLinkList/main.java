package doubleLinkList;

public class main {
	public static void main(String[] args) {
		dList dl=new dList(10);
		dl.createNode(20);
		dl.printList();
		dl.deleteNode(20);
		dl.printList(); 
		dl.insertLast(28);
		dl.insertLast(25);
		dl.printList();
		
	}
}
