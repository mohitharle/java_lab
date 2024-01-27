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
System.out.println(emp.employeeId);
System.out.println(emp.name);
System.out.println(emp.section);
System.out.println(emp.age);
System.out.println(Employee.age);
System.out.println(Employee.company);
System.out.println(Employee.empName);
System.out.println(Employee.id);
}
}
