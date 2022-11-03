import java.util.Arrays;
import java.util.Objects;

public class Student extends Person {

	private static int numStudents;
	private int studentID;
	private Course coursesTaken[];
	private int numCoursesTaken;
	private boolean isGraduate;
	private String major = "undeclared";
	//started
	//editi
	//now
	public Student() {	
		// / coursesTaken = [], numCoursesTaken = 0, isGraduate = false
		super();
		this.coursesTaken = new Course [50];
		numCoursesTaken = 0;
		isGraduate = false;
		numStudents++;
		this.studentID = numStudents;
	}
	public Student(boolean isGraduate) {
	super();
	this.isGraduate = isGraduate;
		this.numCoursesTaken = 0;
		this.coursesTaken = new Course [50];
		numStudents++;
		this.studentID = numStudents;
		
	}
	public Student(String major, boolean isGraduate) {
		super();
		this.major = major;
		this.isGraduate = isGraduate;
		this.numCoursesTaken = 0;
		this.coursesTaken = new Course [50];
		numStudents++;
		this.studentID = numStudents;
		

	}
	Student(String name, int birthYear, String major, boolean isGraduate){
		super(name,birthYear);
		this.major = major;
		this.isGraduate = isGraduate;
		this.numCoursesTaken = 0;
		this.coursesTaken = new Course [50];
		numStudents++;
		this.studentID = numStudents;


	
	}
	public boolean isGraduate() {
		return isGraduate;
	}
	public void setIsGraduate(boolean isGraduate) {
		this.isGraduate = isGraduate;
	}
	public int getNumCoursesTaken() {
		return numCoursesTaken;
	}
	public static int getNumStudents() {
		return numStudents;
	}
	public int getStudentID() {
		return studentID;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	public void addCourseTaken(Course course) {
	 if(numCoursesTaken < coursesTaken.length) {
			coursesTaken[numCoursesTaken] = course;
			numCoursesTaken++;
		}
//		if(this.numCoursesTaken < this.coursesTaken.length)// of this is less than the normal array continue
//			{
//			
//			this.coursesTaken[this.numCoursesTaken] = course; 
//			
//			this.numCoursesTaken++;
//		}
	}
	public void addCoursesTaken(Course [] course) {
		coursesTaken[numCoursesTaken] = course[numCoursesTaken++];
		//same as faculty add course
	}

	    
	
	public Course getCourseTaken(int index) {
//	if(index >= 0) {
//		return coursesTaken[index];
//	}
//	else
//		return null;
		if((index < 0  || index >= coursesTaken.length)){
			return null;
		}
		else {
			return coursesTaken[index];
		}
	}
	public String getCourseTakenAsString(int index) {
		String s = "";
	for(int i = 0; i< numCoursesTaken; i++) {
		s += coursesTaken[i].toString();
	}
	return s;
		
	//dog example
//		String s="";
//		for(int i=0; i<numTricks; i++){
//			s += tricks[i].toString();
//		}
//		return s;
			
	}
	public String getAllCoursesTakenAsString() {
		String s = "";
		for(int i = 0; i< numCoursesTaken; i++) {
			s += coursesTaken[i].toString();
		}
		return s; //continue
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(coursesTaken);
		result = prime * result + Objects.hash(studentID, isGraduate, major, numCoursesTaken);
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
		Student other = (Student) obj;
		return studentID == other.studentID && Arrays.equals(coursesTaken, other.coursesTaken)
				&& isGraduate == other.isGraduate && Objects.equals(major, other.major)
				&& numCoursesTaken == other.numCoursesTaken;
	}
	

	public String toString() {
		String isG;
		if(isGraduate == true) {
			isG = "Graduate";
		}
		else {
			isG = "Undergraduate";
		}
		
		return String.format(super.toString() + " Student: studentID: %04d | Major %20s | %14s | Number of Courses Taken: %3d | Courses Taken: %s", studentID, major, isG, numCoursesTaken, getAllCoursesTakenAsString() 
);
	}
	public int compareTo(Student p) {
//		 if(this.getClass() == p.getClass()) {
//			 Student comSt = (Student) p;
//			 if(this.numCoursesTaken == comSt.numCoursesTaken) {
//				 return 0;
//			 }
//			 else if(this.getNumCoursesTaken() > comSt.getNumCoursesTaken()) {
//				 return 1;
//			 }
//			 else {
//				 return -1;
//			 }
//		 }
//		 else {
//			 return super.compareTo(p);
//		
//	}
		if(p == null){return 0;}
		if(this.numCoursesTaken > p.numCoursesTaken){
			return 1;//calling object is taller
		}
		else if(this.numCoursesTaken < p.numCoursesTaken){
			return -1;
		}
		return 0;//not greater or less in height.. same height
	}
	
	
	
	public static void main(String [] args) {
		Student s = new Student();
		Student s1 = new Student(false);
		Student s2 = new Student("Math",false);
		Student s3 = new Student("Wonderwoman",1941,"JST",true);
		Student[] students = {s,s1,s2,s3};
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		
	
		
		
		
		
		
		
	}
	        
	}
	
	
	
	
	

