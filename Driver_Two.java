import java.util.*;
public class Driver_Two {

	
	
	public static void main(String[] args) {
		String cName1;
		String cName2;
		String cName3;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Hello my name is Alvy I WAS MADE WHILE MY CREATER WAS IN A SUGAR RUSH!!! want to create some objects?");
		String s;
		s = keyboard.next();
	String	s1 = s;
		if (s == s1) {
		System.out.println("OKAY LETS GET STARTED");
			System.out.println("lets create some Course objects first okay!");
			System.out.print("How many course objects do you want to create??? :");
	int numC;
	numC = keyboard.nextInt();
			if(numC == 3) {
				System.out.println("okay were making " + numC + " objects :D  lets start with course");
				
		System.out.println("OKAY listen closley!!!!!!");
		System.out.println("I WANT YOU TO LET ME KNOW IF ITS UNDERGRAD or graduate course for each course  false/true");
		System.out.println("I WANT you to let me know the course NUMBER for each!!!");
		System.out.println("I want you to list 3 names of the COURSES,:");
		System.out.println("AND last but not least i want you to let me know how many credits does the COURSE GIVE!!");
		
		System.out.println("lets start with the first, give me the info");
		System.out.println("undergrad = false, grad = true, which one is yours");
		boolean cU1;
		boolean cU2;
		boolean cU3;
		cU1 = keyboard.nextBoolean();
		System.out.println("next courseNum");
		int cN1;
		int cN2;
		int cN3;
		cN1 = keyboard.nextInt();
		System.out.println("next name");
		cName1 = keyboard.next();
		System.out.println("next credit amount");
		int cc1;
		cc1 = keyboard.nextInt();
		Course Dc1 = new Course(cU1,cN1,cName1,cc1);
		int cc2;
		System.out.println("now for 2");
		System.out.println("undergrad = false, grad = true, which one is yours");
		cU2 = keyboard.nextBoolean();
		System.out.println("next courseNum");
		cN2 = keyboard.nextInt();
		System.out.println("next name");
		cName2 = keyboard.next();
		System.out.println("next credit amount");
		cc2 = keyboard.nextInt();
		Course Dc2 = new Course(cU2,cN2,cName2,cc2);
		int cc3;
		System.out.println("now for 3 ALMOST DONE");
		System.out.println("undergrad = false, grad = true, which one is yours");
		cU3 = keyboard.nextBoolean();
		System.out.println("next courseNum");
		cN3 = keyboard.nextInt();
		System.out.println("next name");
		cName3 = keyboard.next();
		System.out.println("next credit amount");
		cc3 = keyboard.nextInt();
		Course Dc3 = new Course(cU3,cN3,cName3,cc3);
	System.out.println("Now these is YOUR CREATIONNN!!!");
	Course[] course = {Dc1,Dc2,Dc3};
	for(int i = 0; i < numC; i++) {
		System.out.println(course[i]);
		}
	//course creation
			
			// faculty creation
			boolean isten1;
			boolean isten2;
			boolean isten3;
			String Fnam1;
			String Fnam2;
			String Fnam3;
			int bYear1;
			int bYear2;
			int bYear3;
			String dep1;
			String dep2;
			String dep3;
	System.out.println("wow... you Got the hang of it already");
	System.out.println("now lets conitnue with some Faculty this time ");
	System.out.println("3 again?");
	s = keyboard.next();
	System.out.println("okay");
	System.out.println("faculty 1 name");
	Fnam1 = keyboard.next();
	System.out.println("What year were they born");
	bYear1 = keyboard.nextInt();
	System.out.println("WHat department are they in");
	dep1 = keyboard.next();
	System.out.println("are they tenured?");
	isten1 = keyboard.nextBoolean();
	
	
	System.out.println("now for faculty 2");
	
	System.out.println("faculty 2 name");
	Fnam2 = keyboard.next();
	System.out.println("What year were they born");
	bYear2 = keyboard.nextInt();
	System.out.println("WHat department are they in");
	dep2 = keyboard.next();
	System.out.println("are they tenured?");
	isten2 = keyboard.nextBoolean();
	
	System.out.println("now for faculty 3... almost done");
	
	System.out.println("faculty 3 name");
	Fnam3 = keyboard.next();
	System.out.println("What year were they born");
	bYear3 = keyboard.nextInt();
	System.out.println("WHat department are they in");
	dep3 = keyboard.next();
	System.out.println("are they tenured?");
	isten3 = keyboard.nextBoolean();
	
	Faculty Df = new Faculty(Fnam1,bYear1,dep1,isten1);
	Faculty Df2 = new Faculty(Fnam2,bYear2,dep2,isten2);
	Faculty Df3 = new Faculty(Fnam3,bYear3,dep3,isten3);
	Faculty[] faculty = {Df,Df2,Df3};
	System.out.println("THe result isssss!!1");
	for(int i = 0; i < numC; i++) {
		System.out.println(faculty[i]);
		}
	System.out.println("WOW thats it you got the hang of it");
	System.out.println("");
		System.out.println("Lets create 3 generalStaffs this time okay :D");
		String gNam1; int gByear1; String role1; String duty1;
		String gNam2; int gByear2; String role2; String duty2;
		String gNam3; int gByear3; String role3; String duty3;
		System.out.println("name of staff 1");
		gNam1 = keyboard.next();
		System.out.println("year of birth");
		gByear1 = keyboard.nextInt();
		System.out.println("what department/role");
		role1 = keyboard.next();
		System.out.println("Whats their Duty?");
		duty1 = keyboard.next();
		System.out.println(" okay new for the next staff");
		
		
		System.out.println("name of staff 2");
		gNam2 = keyboard.next();
		System.out.println("year of birth");
		gByear2 = keyboard.nextInt();
		System.out.println("what department/role");
		role2 = keyboard.next();
		System.out.println("Whats their Duty?");
		duty2 = keyboard.next();
		
		System.out.println("now time for the last staff");
		System.out.println("name of staff 3");
		gNam3 = keyboard.next();
		System.out.println("year of birth");
		gByear3 = keyboard.nextInt();
		System.out.println("what department/role");
		role3 = keyboard.next();
		System.out.println("Whats their Duty?");
		duty3 = keyboard.next();
		
		GeneralStaff Dg1 = new GeneralStaff(gNam1,gByear1,role1,duty1);
		GeneralStaff Dg2 = new GeneralStaff(gNam2,gByear2,role2,duty2);
		GeneralStaff Dg3 = new GeneralStaff(gNam3,gByear3,role3,duty3);
		
		System.out.println("THis is what you made");
		GeneralStaff[] gen = {Dg1,Dg2,Dg3};
		for(int i = 0; i < numC; i++) {
			System.out.println(gen[i]);
			}
		System.out.println("Lets make some students now");
		String snam1; int sbYear1; String smaj1; boolean sStatus1;
		String snam2; int sbYear2; String smaj2; boolean sStatus2;
		String snam3; int sbYear3; String smaj3; boolean sStatus3;
		
		System.out.println("Eneter student 1 name");
		snam1 = keyboard.next();
		System.out.println("Enter their birth year");
		sbYear1 = keyboard.nextInt();
		System.out.println("Enter their major");
		smaj1 = keyboard.next();
		System.out.println("Enter graduation status, true = graduate, false = underGrad");
		sStatus1 = keyboard.nextBoolean();
		
		System.out.println("now for student 2");
		System.out.println("Eneter student 2 name");
		snam2 = keyboard.next();
		System.out.println("Enter their birth year");
		sbYear2 = keyboard.nextInt();
		System.out.println("Enter their major");
		smaj2 = keyboard.next();
		System.out.println("Enter graduation status, true = graduate, false = underGrad");
		sStatus2 = keyboard.nextBoolean();
		
		System.out.println("Now for student 3");
		System.out.println("Eneter student 3 name");
		snam3 = keyboard.next();
		System.out.println("Enter their birth year");
		sbYear3 = keyboard.nextInt();
		System.out.println("Enter their major");
		smaj3 = keyboard.next();
		System.out.println("Enter graduation status, true = graduate, false = underGrad");
		sStatus3 = keyboard.nextBoolean();
		
		System.out.println("these are your 3 students");
		
		Student sg1 = new Student(snam1,sbYear1,smaj1, sStatus1);
		Student sg2 = new Student(snam2,sbYear2,smaj2, sStatus2);
		Student sg3 = new Student(snam3,sbYear3,smaj3, sStatus3);
		Student[] stun = {sg1,sg2,sg3};
		for(int i = 0; i < numC; i++) {
			System.out.println(stun[i]);
			}
		System.out.println("");
		System.out.println("");
		System.out.println("Now that you did all that...");
		System.out.println("lets finish this while displaying everything :D");
		
		for(int i = 0; i < numC; i++) {
			System.out.println(course[i]);
			}
		System.out.println("****************************************************************");
		for(int i = 0; i < numC; i++) {
			System.out.println(faculty[i]);
			}
		System.out.println("****************************************************************");

		for(int i = 0; i < numC; i++) {
			System.out.println(gen[i]);
			}
		System.out.println("****************************************************************");

		for(int i = 0; i < numC; i++) {
			System.out.println(stun[i]);
			}
		System.out.println("****************************************************************");

		System.out.println("Goodbye");
				
	
		
		
		
		
			}
		
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
