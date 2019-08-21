package linkList;

public class main {
	public static void main(String[] args) {
//		linkList li= new linkList(12);
//		li.createNode(23);
//		li.createNode(25);
//		//li.printList();
//		li.deleteNode(23);
//		//li.printList();
//		li.deleteNode(25);
//		//li.printList();
//		li.createNode(19);
//		li.createNode(24);
//		//li.printList();
//		li.deleteNode(24);
//		li.createNode(24);
//		li.insertLast(45);
//		li.printList();
		
		//work with person objects
		
		person p1=new person("pamal", 22,"cs");
		person p2=new person("sahan", 24,"is");
		person p3=new person("mishan", 28,"cs");
		person p4=new person("madupa", 22,"is");
		person p5=new person("akitha", 21,"cs");
		person p6=new person("nethmal", 24,"is");
		person p7=new person("asiri", 26,"is");
		person p8=new person("seneth", 93,"cs");
		person p9=new person("nuwan", 43,"is");
		person p0=new person("danushka", 33,"cs");
		
		personLinkList pll=new personLinkList(p0);
		pll.createNode(p1);
		pll.createNode(p2);
		//pll.printList();
		pll.deleteNode(p1);
		pll.deleteNode(p2);
		pll.createNode(p3);
		pll.createNode(p4);
		pll.printList();
		pll.deleteNode(p4);
		pll.createNode(p4);
		pll.insertLast(p5);
		pll.printList();
		
		
	}
}
