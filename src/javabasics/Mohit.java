
//static method + non argue method
package javabasics;

public class Mohit {
public static String sing() {
	return "I can sing";
}
public static void main(String[] args) {
	String sing= Mohit.sing();
	System.out.println(sing);
	String dance= Mohit.dance();
    System.out.println(dance);
    String login=Mohit.login("mohit" ,"gaurav");
    System.out.println(login);
    
}

public static String dance() {
	return "i can dance";
	
}
public static String login (String userName, String password) {
	System.out.println(userName +" "+ password);
	return "sucess";
}


}
