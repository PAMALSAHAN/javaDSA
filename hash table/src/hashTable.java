
public class hashTable {
	private LinkList[] arr; // this is because we use linklist type array
	private int size;
	private int totalStudents;
	
	public hashTable() {
		size=1000;
		arr=new LinkList[size];
	}
	
	public int toHashCode(String rollNo) {
		int addasciis=0;
		int codevalue=0;
		for(int i=0;i<rollNo.length();i++) {
			addasciis=addasciis + (int)rollNo.charAt(i);
		}
		codevalue=addasciis %arr.length;
		return codevalue;
	}
}
