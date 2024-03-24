package operators;

public class TypeCasting {
public static void main(String[] args) {
	
	byte a=20;
	int b=a;//implicit type casting 
	System.out.println(b);
	
	int d=140;
	byte c=(byte)d;//explicit type casting
	System.out.println(c);
}
}
