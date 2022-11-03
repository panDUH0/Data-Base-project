
public class Driver_SchoolDB {

	public static void main(String [] args) {
		
		//normal print
		System.out.println("Course: true, 771, MAT, 4\r\n"
				+ "Faculty:\r\n"
				+ "Faculty: true\r\n"
				+ "Faculty: MAT,false\r\n"
				+ "Faculty: Superman,1938,PHY,true\r\n"
				+ "\r\n"
				+ "Student:\r\n"
				+ "Student: false\r\n"
				+ "Student: Math,false\r\n"
				+ "Student: Wonderwoman,1941,JST,true\r\n"
				+ "\r\n"
				+ "GeneralStaff:\r\n"
				+ "GeneralStaff: advise students\r\n"
				+ "GeneralStaff: Sanitation,clean\r\n"
				+ "GeneralStaff: Flash Gordon,1934,Security,safety\r\n"
				+ "\r\n"
				+ "Course: true,777,CMP,4\r\n"
				+ "Course: true,711,CMP,4\r\n"
				+ "Course: true,723,MAT,4\r\n"
				+ "Course: false,168,CMP,4\r\n"
				+ "Course: false,338,CMP,4\r\n");
		
		System.out.println("**************************************************************\r\n"
				+ "SCHOOL DATABASE INFO:\r\n");
		
		System.out.println("************************************************\r\n"
				+ "COURSES:");
		
		
		
	//___________________________________________________________________________________________
		Course c = new Course(true, 771,"MAT",4);
		Course c1 = new Course(true, 777,"CMP",4);
		Course c2 = new Course(true, 711,"CMP",4);
		Course c3 = new Course(true, 723,"MAT",4);
		Course c4 = new Course(false, 168,"CMP",4);
		Course c5 = new Course(false, 338,"CMP",4);
		Course[] course = {c,c1,c2,c3,c4,c5};
		for(int i = 0; i < course.length; i++) {
			System.out.println(course[i]);
		
		}
		System.out.println("************************************************\r\n"
				+ "************************************************\r\n"
				+ "PERSONS:");
		System.out.println(
				 "************************************************\r\n"
				+ "************************************************\r\n"
				+ "EMPLOYEES:\r\n"
				+ "************************************************\r\n"
				+ "************************************************\r\n"
				+ "GENERAL STAFF:");
		
		
	
		// ___________________________________________
		//Dog[] sdogs = {sd1,sd2,sd3,sd4,sd5, d1, d2,bsd1,bsd2,d3};
		//for(int i=0; i<sdogs.length; i++){ using dog class that we did in class as an example..
		Faculty f = new Faculty();
		Faculty fP = new Faculty(true);
		Faculty f1 = new Faculty("MAT",false);
		Faculty f2 = new Faculty("Superman",1938,"PHY",true);
		Faculty[] faculty = {f,fP,f1,f2};
		
		
		GeneralStaff g = new GeneralStaff();
		GeneralStaff g1 = new GeneralStaff("advise students");
		GeneralStaff g2 = new GeneralStaff("Sanitation","clean");
		GeneralStaff g3 = new GeneralStaff("Flash Gordon",1934,"Security","safety");
		GeneralStaff[] gen = {g,g1,g2,g3};
		for(int i = 0; i < gen.length; i++) {
			System.out.println(gen[i]);
		}
		System.out.println("************************************************\r\n"
				+ "************************************************\r\n"
				+ "FACULTY:");
		
		for(int i = 0; i < faculty.length; i++) {
			System.out.println(faculty[i]);
		}
		System.out.println("************************************************\r\n"
				+ "************************************************\r\n"
				+ "STUDENTS:");
		// _________________________________________________
		
		Student s = new Student();
		Student s1 = new Student(false);
		Student s2 = new Student("Math",false);
		Student s3 = new Student("Wonderwoman",1941,"JST",true);
		Student[] students = {s,s1,s2,s3};
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		// _________________________________________________
		System.out.println("************************************************\r\n"
				+ "**************************************************************\r\n"
				+ "");

		
	
	
	
		
	
	}
	// SECOND PART OF THE PROJECT________________________________________________________________________
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}


