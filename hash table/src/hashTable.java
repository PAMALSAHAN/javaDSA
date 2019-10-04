
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
	
	public boolean insert(int key,student data) {
		if(arr[key]==null) {
			arr[key]=new LinkList(); //root eka set karaganna eka thmai karanne.
		}
		arr[key].insert(data);
		totalStudents++;
		return true;
	}
	
	public int getTotal() {
		return totalStudents;
	}
	
	public student 
	
	
}
