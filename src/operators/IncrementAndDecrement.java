package operators;
/**
 * pre increment
 * 1)increase the value by 1
 * 2)place the increased value
 * post increment 
 * 1)place the value
 * 2)increase the value by 1 
 * 
 * 
 * 
 * pre decrement
 * 1)decrease the value by 1
 * 2)place the decreased value
 * post decrement
 *1)place the value first
 *2)decrease the value by 1
 *
 */
public class IncrementAndDecrement {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		//a++;
		//++a;
		//int c=30++;
		//final int c=30; 
		//c++;
		int c=30;
		//c=(c++)++;
		//10+11+11+12=44
	System.out.println(b+b++ + --b+ ++b - --b);
		//int b=10;
	//	System.out.println(--b);
		System.out.println(--a+a++ +a+ a++ + --a);
		 
		
	}
	

}
