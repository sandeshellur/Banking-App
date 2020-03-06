package student.database.app;

import java.util.Scanner;

public class Student {
	private String fname;
	private String lname;
	private int gradeyear;
	private String studentId;
	private String courses;
	private int tutionBalance=0;
	private static int costOfCourse = 600;
	private static int id = 1001;

	public Student() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter student first name ");
		this.fname = scan.nextLine();
		System.out.println("Enter student last name ");
		this.lname = scan.nextLine();
		System.out
				.println("1=Freshmen\n2=sophmore\n3=jonior\n4=senior\nEnter student class");
		this.gradeyear = scan.nextInt();
		System.out.println(fname + " " + lname + " " + gradeyear);
		setStudentId();
		System.out.println(fname + " " + lname + " " + gradeyear + " "
				+ studentId);
	}

	private void setStudentId() {
		id++;
		this.studentId = gradeyear + "" + id;
	}

	public void enroll() {
		System.out.println("Enter course to enroll(Q to Quit) :");
		Scanner a1 = new Scanner(System.in);
		String course = a1.nextLine();
		if (course != "Q") {
			courses = courses + "\n" + course;
			tutionBalance = tutionBalance + costOfCourse;
		}
		System.out.println("COURSE ENROLLED IS : "+course);
		System.out.println("TUTION BALANCE IS : "+tutionBalance);
	}

}
