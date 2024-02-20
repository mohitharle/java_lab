package javabasics;
//hi
//helllo
//amit


  
 
public class Calculator {
	public static int add(int a , int b){
	return	a+b;
	}
	public static int substract(int a , int b) {
		return a-b;
	}
	public static int multiply(int a , int b) {
		return a*b;
	}
	public static double divide (double a , double b) {
		return a/b;
	
	}
	public static int add5(int a, int b, int c, int d, int e) {
		return a+b+c+d+e;
	}
	static String tellName() {
		return "mohit";
		
	
	}
	/**
	 * register method save student information
	 * @param sid
	 * @param name
	 * @param phNo
	 * @param city
	 */
	private static void register (int sid, String name, long phNo, String city){
		System.out.println(sid+ " " +name +" "+phNo+" "+city);
	}
	
	
	
	public static void main(String[] args) {
	int sum =	Calculator.add(10,20);
	System.out.println(sum);
	int substract= Calculator.substract(30, 10);
	System.out.println(substract);
	int multiply= Calculator.multiply(10, 5);
	System.out.println(multiply);
	double divide= Calculator.divide(20, 3);
	System.out.println(divide);
	System.out.println(20.0/3);
    String tellName = Calculator.tellName();
	System.out.println(tellName);
	int add5= Calculator.add5(10, 20, 30, 40, 50);
	System.out.println(add5);
	Calculator.register(1, "Mohit", 7775821318L, "Nagpur");
	
	}
	
	
}
