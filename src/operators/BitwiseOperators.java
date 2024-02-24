package operators;
/**
 * AND operators if both arguments are true then only true
 * OR operator if both arguments are false then only false 
 * X-OR operator if both arguments are different then only true
 * Bitwise operators :it is applicable for integral type(byte , short ,int , long ,char) and boolean type
 *  
 * 
 *
 */
public class BitwiseOperators {
public static void main(String[] args) {
	// &(AND) |(OR) ^(X-OR)
System.out.println(true & true);
System.out.println(true & false);
System.out.println(false & false);

System.out.println("Or Operator");
System.out.println(true | true);
System.out.println(true | false);
System.out.println(false | true);
System.out.println(false | false);

System.out.println("X-OR Operator");
System.out.println(true ^ true);
System.out.println(true ^ false);
System.out.println(false ^ true);
System.out.println(false ^ false);

System.out.println(4 & 5);
System.out.println(5 | 4);
System.out.println(4 ^ 5);
System.out.println(7 & 4);
System.out.println(7 | 4);
System.out.println(7 ^ 4);
System.out.println('a'& 'b');
}
}
