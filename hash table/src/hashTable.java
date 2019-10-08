
public class hashTable {
	private LinkList[] arr; // this is because we use linklist type array
	private int size;
	private int totalStudents;
	
	public hashTable() {
		size=97;
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
	
	public student fetchStdInfo(String rollNo) {
		int key=toHashCode(rollNo);
		if(arr[key]==null) {
			return null;
		}else {
			student q=arr[key].fetchData(rollNo);
			if(q != null) {
				return q;
			}else {
				return null;
			}
		}
	}
	
	public boolean deleteStd(String rollNo) {
		boolean have=arr[toHashCode(rollNo)].haveRoleNo(rollNo); //haveRoleNo check whether role nomberis having or not
		if(have) {
			int key=toHashCode(rollNo);
			arr[key].deleteData(rollNo);
			totalStudents--;
			return true;
		}
		else {
			return false;
		}
	}
	
	public void showAllStd() {
		for(int i=0;i<arr.length ;i++) {
			
			if(arr[i]!=null) { // null pointer exeption ekak enawa meka ain karama 
				arr[i].selectAll(); 
			}
			
		}
	}
}
