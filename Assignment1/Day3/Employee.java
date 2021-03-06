package Day3;

public class Employee {

	////Assignment
	//Create Employee class with id,name,age,email
	//and Project(projectid,projectname,clientname)
	//and present and permanent Address(aid,streetname,city,state,zip)

	private int id;
	private String name;
	private int age;
	private String email;
	private String last;
	private String address;
	private permanentAdress perm;
	
	public Employee(int id) {
		this.id = id;
	}
	
	public Employee(int id, String name) {
		this(id);
		this.name = name;
	}
	
	public Employee(int id, String name, int age, String email) {
		this(id);
		this.name = name;
		this.age = age;
		this.email = email;
	}
	
	/// public Employee(int id, String name){
	//  this(id, name);              *** this will not work, this block needs to be in line 19 for it to
	//  chain construct              *** doesnt work because you are not adding anything new to the
	//                               *** constructor line 20
	
	public Employee(int id, String name, int age, String email, String last) {
		this( id, name, age, email);
		this.last=last;
	}
	
	

	public Employee(int id, String name, int age, String email, String last, String address) {
		this(id, name, age, email, last);
		this.address = address;
	}

	
	
	public Employee(int id, String name, int age, String email, String last, String address, permanentAdress perm) {
		this(id, name, age, email, last,address);
		this.perm = perm;
	}

	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", last=" + last
				+ ", address=" + address + ", perm=" + perm + "]";
	}

	public void name(String n) { // for those constructor that didnt get to add a name or etc. 
		this.name = n;
		
	}
	public void last(String l) {
		this.last = l;
	}
	public void address(String a) {
		this.address = a;
	}
	
	

}
