package tree;

public class main {
	public static void main(String[] args) {
		
		person p1=new person("pamal",35,"cs");
		person p2=new person("sahan",32,"cs");
		person p3=new person("nuwan",36,"cs");
		person p4=new person("asiri",38,"cs");
		person p5=new person("senith",45,"cs");
		
		bst bst1=new bst();
		bst1.insert(p1);
		bst1.insert(p2);
		bst1.insert(p3);
		bst1.insert(p4);
		bst1.insert(p5);
		
		
		//bst1.showAll(bst1.findNode("pamal"));
		person c=bst1.getData(bst1.findParent("nuwan "));
		c.getperson();
		
	}
			
}
