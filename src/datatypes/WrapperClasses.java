package datatypes;

public class WrapperClasses {
	/**
	 * byte Byte
	 * short Short
	 * int Integer
	 * long Long
	 * float Float
	 * double Double
	 * char Character
	 * boolean Boolean
	 */
	
	
	
	public static void main(String[] args) {
		//get min value from 70,20
		int min = Integer.min(70, 20);
		System.out.println(min);
        int max = Integer.max(70, 20);
        System.out.println(max);
        
        int sum= Integer.sum(1, 10);
        System.out.println(sum);
        int comp=Integer.compare(11, 10);
        System.out.println(comp);
        int mini= Integer.MIN_VALUE;
        System.out.println(mini);
        int maxi= Integer.MAX_VALUE;
        System.out.println(maxi);
      
        
	}

}
