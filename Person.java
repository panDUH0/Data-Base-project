import java.util.Objects;

public class Person {
//	name: String
//	birthYear: int
//	Person()			// name = “”, birthYear = 0
//	Person(String name, int birthYear)
//	getName():String
//	getBirthYear():int
//	setName(String name): void
//	setBirthYear(int year): void
//	equals(Object obj): boolean	//all attributes must match for 2 Course objects to be considered equal
//	toString(): String	//”Person: Name: %30s | Birth Year: %4d”, name, birthYear
//	compareTo(Person p): int	//use the Comparable interface specification. Sort by birthYear.

	private String name;
	private int birthYear;
	
	public Person() {
		name = "";
		birthYear = 0;
	}
	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return birthYear == other.birthYear && Objects.equals(name, other.name);
	}
	
	public String toString(){
		return String.format("Person: Name: %30s | Birth Year: %4d", name, birthYear);
	}
	public int compareTo(Person person) {
		
		if(person instanceof Person) {
			Person p = (Person) person;
		
		if(this.birthYear > p.birthYear){
	         return 1;
	        }
	        else if(this.birthYear < p.birthYear){
	            return -1;
	        }
	        else {
	        return 0;
	        }
		}
		 throw new NullPointerException();
	    }
		
		
	}
	
	


