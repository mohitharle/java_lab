package javabasics;

public class StudentTest {

public static void main(String[] args) {
	Student std=new Student();
	
	String name= std.tellName();
	System.out.println(name);

	int age= std.tellAge();
	System.out.println(age);

	int rollNumber= std.tellRollNumber();
	System.out.println(rollNumber);

	String schoolName= std.tellSchoolName();
	System.out.println(schoolName);

	char section= std.tellSection();
	System.out.println(section);
}	

}
