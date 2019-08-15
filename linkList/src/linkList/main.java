package linkList;

public class main {
	public static void main(String[] args) {
		linkList li= new linkList(12);
		li.createNode(23);
		li.createNode(25);
		//li.printList();
		li.deleteNode(23);
		//li.printList();
		li.deleteNode(25);
		//li.printList();
		li.createNode(19);
		li.createNode(24);
		//li.printList();
		li.deleteNode(24);
		li.createNode(24);
		li.insertLast(45);
		li.printList();
	}
}
