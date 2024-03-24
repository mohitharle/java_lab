package controlFlow;

public class SelectionStatement {
	
	public boolean isElegble(int age,String citizen) {
		if (age >=18 && "indian".equals(citizen)){
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public boolean isElegblev2(int age) {
		if (age >=18)
			return true;
		
		else 
			return false;
		
		
	}
	
	public boolean isElegblev3(int age) {
		return age>=18;
		
	}
	public static void main(String[] args) {
		SelectionStatement sel=new SelectionStatement();
		boolean elegble = sel.isElegble(25,"indian");
		
		System.out.println(elegble);
		
	}

}
