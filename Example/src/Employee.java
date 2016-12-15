
public class Employee {
	
	Integer id;
	String name;
	String addr;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public static void main(String[] args) {
		EmployeeComparator empc= new EmployeeComparator();
		
	}

}
