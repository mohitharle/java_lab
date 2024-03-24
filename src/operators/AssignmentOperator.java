package operators;

public class AssignmentOperator {
	public static void main(String[] args) {
		int a=10;
		// chain assignment operator '='.
		int b,c,d;
		b=c=d=40;
		//compound assignment operator
		int p=10;
		p+=1;
		p-=1;
		p*=4;
		p/=2;
	 //p=p+1;
	System.out.println(p);
	System.out.println(b);
	}

}
