import java.util.Objects;

public class Employee extends Person {
//	deptName: String
//	numEmployees: static int
//	employeeID: int		//generated 
//	Employee()			// deptName = “”, employeeID computed
//	Employee(String deptName)	// employeeID computed
//	Employee(String name, int birthYear, String deptName)	// employeeID computed
//	getDeptName(): String
//	static getNumEmployees(): int
//	getEmployeeID(): int
//	setDeptName(String deptName): void
//	equals(Object obj): boolean	//all attributes inherited+local must match for 2 Employee objects to be considered equal
//	toString(): String	//”<content of Person> Employee: Department: %20s | Employee Number: %3d”, deptName, employeeID
//	compareTo(Person p): int	//use the Comparable interface specification. Sort by employeeID

	private String deptName;
	private static int numEmployees = 1;
	private int employeeID;
	
	
	public Employee() {
		super();
		deptName = "";
		this.employeeID = numEmployees++;
	}
	
	public Employee(String deptName) {
		super();
		this.deptName = deptName;
		this.employeeID = numEmployees++;
	}
	Employee(String name, int birthYear, String deptName){
	super(name,birthYear);
	this.employeeID = numEmployees++;
	this.deptName = deptName;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public static int getNumEmployees() {
		return numEmployees;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(deptName, other.deptName) && employeeID == other.employeeID;
	}

	public String toString() {
		return String.format(super.toString() + " Employee: Department: %20s | Employee Number: %3d", getDeptName(), getEmployeeID());
	}
	
	public int compareTo(Person p) {
		if(p == null) throw new NullPointerException();
		
		if(p instanceof Person) {
			Employee e = (Employee) p;
		
		if(this.employeeID > e.employeeID){
	         return 1;
	        }
	        else if(this.employeeID < e.employeeID){
	            return -1;
	        }
	        else {
	        return 0;
	        }
		}
		 return super.compareTo(p);
		 
		 
	    }
		
	
	

}
