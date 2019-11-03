package inheritance;
class Address{
	String lane;
	String city;
	String country;
	public Address(String l,String c,String con) {
		this.lane=l;
		this.city=c;
		this.country=con;
	}
	
	public String SetAddress() {
		String add=lane + city + country;
		return add;
	}
	
}
class person{
	String name;
	int age;
	Address address;
	
	public person(String name,int age,Address address) {
		this.name=name;
		this.age=age;
		this.address=address;
		
	}
	public void getperson() {
		String per="my name is "+name +"and "+age+"and "+address;
		System.out.println(per);
	}
}
public class Aggregation {
	public static void main(String[] args) {
		Address ad=new Address("Ananda Vidyala Mavatha","Elpitiya","Galle");
		person p=new person("pamal",23,ad);
		p.getperson();
	}
}
