import java.util.Arrays;
import java.util.Objects;

public class Faculty extends Employee {
private Course[] coursesTaught;
private int numCoursesTaught;
private boolean isTenured;

public Faculty() {
	super();
	numCoursesTaught = 0;
	isTenured = false;
	this.coursesTaught = new Course[100];
}
public Faculty(boolean isTenured) {
	super();
	this.isTenured = isTenured;
	numCoursesTaught = 0;
	this.coursesTaught = new Course[100];
}

public Faculty(String deptName, boolean isTenured) {
	super(deptName);
	this.isTenured = isTenured;
	this.numCoursesTaught = 0;
	this.coursesTaught = new Course[100];

}
public Faculty(String name, int birthYear, String deptName, boolean isTenured) {
	super(name,birthYear,deptName);
	this.isTenured = isTenured;
	this.numCoursesTaught = 0;
	this.coursesTaught = new Course[100];

}
//automated setters and getters
public boolean isTenured() {
	return isTenured;
}
public void setTenured(boolean isTenured) {
	this.isTenured = isTenured;
}
public int getNumCoursesTaught() {
	return numCoursesTaught;
}
	public void addCourseTaught(Course course) {
	if(this.numCoursesTaught < coursesTaught.length) {
		
		this.coursesTaught[numCoursesTaught] = course;
		
		numCoursesTaught++;
	}
}
public void addCoursesTaught(Course [] course) {
//	for (int i = 0; i < course.length; i++) {
//        addCourseTaught(course[i]);
//    }
//	int L = this.numCoursesTaught;
//	for(int i = 0; i < course.length; i++) {
//		if(course[i] == null) { 
//			continue;
//			}
//		if(L >= this.coursesTaught.length) {
//			break; // checking if its greater than course, cant fit anymore
//		}
//		this.coursesTaught[L] = course[i];
//				L++; // appending/ adding to it
//	}
//	this.numCoursesTaught = L; // void statement, no returns so made this.numCoursestaught the end result

coursesTaught[numCoursesTaught] = course[numCoursesTaught++];
}

public Course getCourseTaught(int index) {
//	 if((index >= coursesTaught.length) ||( index < 0) || (coursesTaught[index] == null)){
//         return null;
//     }
//     return coursesTaught[index];
	if(index >= 0 && index < this.numCoursesTaught && index < this.coursesTaught.length) {
		return this.coursesTaught[index];
	}
	else {
		return null;
	}
 }


public String getCourseTaughtAsString(int index) {
		String s = "";
		for(int i = 0; i< coursesTaught.length; i++) {
			s += coursesTaught[index].toString();
		}
		return s;
	}

public String getAllCoursesTaughtAsString(){
	String s = "";
	for(int i = 0; i < numCoursesTaught; i++) {
		s += getCourseTaughtAsString(i) + ",";
	}
	return s.trim();
 }

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + Arrays.hashCode(coursesTaught);
	result = prime * result + Objects.hash(isTenured, numCoursesTaught);
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!super.equals(obj))
		return false;
	if (getClass() != obj.getClass())
		return false;
	Faculty other = (Faculty) obj;
	return Arrays.equals(coursesTaught, other.coursesTaught) && isTenured == other.isTenured
			&& numCoursesTaught == other.numCoursesTaught;
}
@Override
public String toString() {
	String tenYear = "";
	if(isTenured() == true) {
		tenYear = "Is Tenured";
	}
	else if(isTenured() != true) {
		tenYear = "Not Tenured";
	}
	
return String.format("%s Faculty: %11s | " + "Number of Courses Taught: %3d | Courses Taught: %s", super.toString(), tenYear, getNumCoursesTaught(), getAllCoursesTaughtAsString());
}
// kotlin

public int compareTo(Person person) {
	if(person == null) throw new NullPointerException();
	
	if(person instanceof Faculty ) {
		Faculty p = (Faculty) person;
	
	if(this.numCoursesTaught > p.numCoursesTaught){
        return 1;
       }
       else if(this.numCoursesTaught < p.numCoursesTaught){
           return -1;
       }
       else {
       return 0;
       }
	}
    return super.compareTo(person);
      
	
//		 if(this.numCoursesTaught > person.numCoursesTaught){
//	         return 1;
//	        }
//	        else if(this.numCoursesTaught < person.numCoursesTaught){
//	            return -1;
//	        }
//	        else {
//	        return 0;
//	        
//}
}
	



public static void main(String []args) {
	//ShowDog sd1 = new ShowDog();
	Faculty f = new Faculty("jiro",1999,"Lunch Time", true);
	Faculty f1 = new Faculty("jim",2002,"Math", false);
	
	f1.numCoursesTaught = 3;
	f.numCoursesTaught = 2;
		System.out.print(f.compareTo(f1));
}
}
