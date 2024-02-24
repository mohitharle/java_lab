package operators;
/**
 * max(int,type of a,type of b)
 * example max(int,byte,byte)=> int
 * @author Acer
 *
 */
public class ArthemeticOperator {
	public static void main(String[] args) {
		byte b=10;
		int i=20;
	  int d=b+i;
	  byte p=10;
	  byte q=20;
	  int  r= p+q;
	  byte m=10;
	  long n=20;
	  long o=m+n;
	  
	  char s='a';
	  int t=s;
	  char u='A';
	  int y= s+u;
	  System.out.println(s);
	  System.out.println(t);
	  System.out.println(y);
	  
	  System.out.println('A'+1);
	  boolean b1=true;
	  boolean b2=false;
	  
	 // int b3=b1+b2;
	  System.out.println("10"+20);
	  System.out.println(10+20+"30");
	  System.out.println(10+20+"30"+40+50);
	//  System.out.println(0/0);  Give ArthemeticException
	  System.out.println(-10/0.0);
	  System.out.println(5.6/0.0);
	  System.out.println(7.8/0);
	  System.out.println(0.0/0);
	  System.out.println(0/0.0);
	  System.out.println(0.0/0.0);
	  System.out.println(-0.0/0);
	  
	  int g=10;
	  double h=0.0;
	  System.out.println(h/0+g);
	}

}
