import java.util.Objects;

public class GeneralStaff extends Employee {

	private String duty;
	
	public GeneralStaff() {
		super();
		duty = "";
	}
	GeneralStaff(String duty){
		super();
		this.duty = duty;
	}
	public GeneralStaff(String deptName, String duty) {
		super(deptName);
		this.duty = duty;
	}
	GeneralStaff(String name, int birthYear, String deptName, String duty){
		super(name,birthYear,deptName);
		this.duty = duty;
	}
	public String getDuty() {
		return duty;
	}
	@Override
	public int hashCode() {
		return Objects.hash(duty);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		GeneralStaff other = (GeneralStaff) obj;
		return Objects.equals(duty, other.duty);
	}
	
	public String toString() {
		return String.format(super.toString() + " GeneralStaff: Duty: %10s", duty );
	}
	
	
	
}
