package javabasics;

public class EmployeeTest {
public static void main(String[] args) {
	Employee emp=new Employee();
String name=	emp.tellName();
System.out.println(name);
int age= emp.tellAge();
System.out.println(age);
int salary= emp.tellSalary();
System.out.println(salary);
long phoneNumber= emp.tellPhoneNumber();
System.out.println(phoneNumber);
int rollNumber= emp.tellRollNumber();
System.out.println(rollNumber);
}
}
