
public class LinkList {
	private node h;
	
	class node{
		private  node next;
		private student value;
	}
	
	public LinkList() {
		h=new node();
		h.next=null;
		h.value=null;
	}
	
	public boolean insert(student s) {
		node p=new node();
		p.value=s;
		p.next=h.next;  //mehtanadi wenne aluth node ekak mulata set wena eka thamai
		h.next=p;
		
		return true;
	}
	
	public boolean haveRoleNo(String rollno) {   //use to check whether student in that list
		node a=h.next;
		boolean have=false;
		while(a!=null) {
			if(rollno.equals(a.value.getRollNo())) {
				have=true;
			}
			a=a.next;
			
		}
		return have;
		
	}
	
	public student fetchData(String rollNo) {   //extract data when we use rollno as parameter
		student data=null;
		node p=h.next;
		while(p!=null) {
			if(p.value.getRollNo().equals(rollNo)){
				data=p.value;
				break;
			}
			p=p.next;
		}
		return data;
	}
	
    public void deleteData(String rollNo) {
    	node p=h;
    	node q=h.next;
    	while(q!=null && !(q.value.getRollNo().equals(rollNo))) {
    		p=q;
    		q=q.next;
    	}
    	if(q!=null) {
    		p.next=q.next;
    	}
    	else {
    		//no data;
    	}
    	
    }
    
    public void selectAll() {
    	node p=h.next;
    	while(p!=null) {
    		p.value.getPersonInfo();
    		p=p.next;
    	}
    }
}
