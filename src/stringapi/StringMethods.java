package stringapi;

public class StringMethods {
public static void main(String[] args) {
	String name=" Mohit Harle ";
	System.out.println(name.length());
	System.out.println(name.isEmpty());
	System.out.println(name.charAt(10));
	System.out.println(name.toUpperCase());
	System.out.println(name.toLowerCase());
	
System.out.println(name.trim().length());
String str1="Mohit";
String str2="mohit";
System.out.println(str1.equals(str2));
System.out.println(str1.equalsIgnoreCase(str2));
System.out.println(str1.startsWith("Mo"));
System.out.println(str1.endsWith("t"));

}
}
