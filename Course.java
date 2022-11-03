import java.util.Objects;

public class Course {
//	isGraduateCourse: boolean
//	courseNum: int
//	courseDept: String
//	numCredits: int
//	Course(boolean isGraduateCourse, int courseNum, String courseDept, int numCredits)
//	isGraduateCourse(): boolean
//	getCourseNum(): int
//	getCourseDept(): String
//	getNumCredits(): int
//	getCourseName: String 	//return String of “U” or “G” + courseDept + courseNum
//	equals(Object obj): boolean	//all attributes must match for 2 Course objects to be considered equal
//	toString(): String	//”Course: %3s-%3d | Number of Credits: %02d  | Graduate/Undergraduate”, courseDept, courseNum, numCredits, isGraduateCourse
//	compareTo(Course c): int      //use the Comparable interface specification. Sort by courseNum
//

	private boolean isGraduateCourse;
	private int courseNum;
	private String courseDept;
	private int numCredits;

	public Course(boolean isGraduateCourse, int courseNum, String courseDept, int numCredits) {
		this.isGraduateCourse = isGraduateCourse;
		this.courseNum = courseNum;
		this.courseDept = courseDept;
		this.numCredits = numCredits;
	}
	public boolean isGraduateCourse() {
		return isGraduateCourse;
	}
	public int getCourseNum() {
		return courseNum;
	}
	public String getCourseDept() {
		return courseDept;
	}
	public int getNumCredits() {
		return numCredits;
	}
	public String getCourseName() {
		if(isGraduateCourse == true) {
			return  "G" + courseDept + courseNum;
		}
		else {
			return "U" + courseDept + courseNum;
			
		}
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(courseDept, other.courseDept) && courseNum == other.courseNum
				&& isGraduateCourse == other.isGraduateCourse && numCredits == other.numCredits;
	}
	public String toString() {
		String typeOfGrad = "";
					if (isGraduateCourse() == true) {
						typeOfGrad = "Graduate";
					}
					else if(isGraduateCourse() == false) {
						typeOfGrad = "Undergraduate";
					}
		return String.format("Course: %3s-%3d | Number of Credits: %02d | " + typeOfGrad, courseDept, courseNum, numCredits, isGraduateCourse);
	}
	
	public int compareTo(Course c) {
		 if(this.courseNum > c.courseNum){
	         return 1;
	        }
	        else if(this.courseNum < c.courseNum){
	            return -1;
	        }
	        else {
	        return 0;
	        }
		
	}
	
}
