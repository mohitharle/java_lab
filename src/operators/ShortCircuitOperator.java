package operators;

public class ShortCircuitOperator {
	public static void main(String[] args) {
		
		int a=10;
		
		if(a++>10 && 20>a++) {
			System.out.println(a);
	}
		else {
			System.out.println(a);
		}		
		
		
	}

}
