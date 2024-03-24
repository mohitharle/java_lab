package controlFlow;

public class PlacementCr {
	public boolean isElegble(int tenth,int twelth,int graduation) {
		if(tenth>=60)
		{
			if(twelth>=60) {
				if(graduation>=60) {
					return true;
				}
				else {
					return false;
				}
			
			}
			else {
				return false;
			}
		
		}
		else {
			return false;
		}
		
		
	}
	public boolean isElegblev2(int tenth,int twelth,int graduation) {
		if(tenth>=60 && twelth>=60 && graduation>=60) {
		return true	;
		}
		else 
			return false;
	}
	
	public boolean isElegblev3(int tenth,int twelth,int graduation) {
		return (tenth>=60 && twelth>=60 && graduation>=60) ;
	}
	public static void main(String[] args) {
		PlacementCr plc=new PlacementCr();
		boolean elegble = plc.isElegblev3(55, 90, 60);
		
		System.out.println(elegble);
		
		if(true); //it is a valid statement but no use
		//if (ture)
		//int a =10;//compilation error because it is a declarative statement 
		if (true);
		System.out.println("mohit"); //no compilation error
	}

}
