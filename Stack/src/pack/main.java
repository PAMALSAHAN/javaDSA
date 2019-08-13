package pack;

public class main {
	public static void main(String[] args) {
		stack stack1=new stack(5);
		if(!stack1.isFull()) {
			stack1.push(10);
			stack1.push(20);
			stack1.push(30);
		}
		//System.out.println(stack1.pop());
		//System.out.println(stack1.pop());
		
		//this is about person stack
		personStack ps=new personStack(5);
		person p1=new person("pamal", 13,"cs");
		person p2=new person("asiri", 43,"is");
		person p3=new person("madupa", 53,"ss");
		
		ps.push(p1);
		ps.push(p2);
		ps.push(p3);
		
		//
		System.out.println(ps.pop());
		
		
	}

}
