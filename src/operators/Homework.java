package operators;

public class Homework {
	public static void main(String[] args) {
		int a=21;
		int b=31;
		
		if (++a>b++ & a++<++b) {
			System.out.println(a);//
			System.out.println(b);
			
		}
		
		else {
			System.out.println(a);//value of a is 23
			System.out.println(b);//33
		}
		
		
		System.out.println("short circuit operator");
	if (++a>b++ && a++<++b) {
			System.out.println(a);
			System.out.println(b);
			
		}
		
		else {
			System.out.println(a);//24
			System.out.println(b);//34
		}
		
	}

}
