package operators;

public class RelationalOperator {
public static void main(String[] args) {
	// > , < , >= , <=   relational operators   it is applicable only for primitive data type except boolean
	// equality operators == , !=     it is applicable for all primitive data type and object type (custom data type) 
	// if == operator is applied on objects (o1,o2)then it will compare addresses of the objects 
	System.out.println(10>5); //true
	
	System.out.println(10<20); //true
	System.out.println(10>=10); //true
	System.out.println(10<=11); //true
	System.out.println(20==20);// true
	System.out.println(30!=35);//true
	System.out.println('a'>='a');
	

//  System.out.println(true>false);  
	System.out.println(true==true);
	String s1= "Mohit";
	String s2= new String("Mohit");
	
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));
}
	
}
