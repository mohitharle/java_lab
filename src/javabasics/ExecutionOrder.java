package javabasics;

public class ExecutionOrder {
	ExecutionOrder() {
		System.out.println("constructor");
	}
	static int a=10;
	int b=20;
	int d=m2();
	
	static {
		System.out.println("static block2");
	}

	{
		System.out.println("instance block");
		
	}
	
	static {
		System.out.println("static block1");
	}

	{
		System.out.println("instance block2");
	
	}
	static int c=m1();
	
	public static int m1() {
		System.out.println(c);
		return 30;
		}
	
	public int m2() {
		System.out.println(d);
		return 40;
	}
	
	
	
	public static void main(String[] args) {
	System.out.println("main started");
		
	ExecutionOrder ex=new ExecutionOrder();
	
	System.out.println(ex.d);
	System.out.println(c);
	System.out.println("main method");
	/**
	 * static block2
	 * static block1
	 * 0
	 * main started
	 * 0
	 * instance block 
	 * instance block2
	 * constructor
	 * 40
	 * 30
	 * main method
	 */

	
	}
	
}

