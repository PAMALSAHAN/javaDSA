
public class main {

	public static void main(String[] args) {
		hashTable h=new hashTable(); // implement hash table
		
		student s1=new student("pamal", 13,"12-2344" );
		student s2=new student("akitha", 14,"13-9834" );
		student s3=new student("nuwan", 15,"14-3534" );
		student s4=new student("mishan", 16,"15-6134" );
		student s5=new student("sakun", 17,"16-7934" );
		student s6=new student("anushka", 18,"17-8534" );
		
		int s1key=h.toHashCode(s1.getRollNo()); // in here the key value is the hash value of the function
		int s2key=h.toHashCode(s2.getRollNo());
		int s3key=h.toHashCode(s3.getRollNo());
		int s4key=h.toHashCode(s4.getRollNo());
		int s5key=h.toHashCode(s5.getRollNo());
		int s6key=h.toHashCode(s6.getRollNo());
			
		h.insert(s1key, s1);
		h.insert(s2key, s2);
		h.insert(s3key, s3);
		h.insert(s4key, s4);
		h.insert(s5key, s5);
		h.insert(s6key, s6);
		
		//h.showAllStd();
		
		System.out.println(" ");
		h.deleteStd(s1.getRollNo());
	//	h.showAllStd();
		
		System.out.println(" ");
		h.fetchStdInfo(s2.getRollNo()).getPersonInfo(); 
		
		System.out.println(h.getTotal());
		
		
	
		
	}
}
