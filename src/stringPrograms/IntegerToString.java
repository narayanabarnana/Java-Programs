package stringPrograms;

public class IntegerToString {

	public static void main(String[] args) {
		
		
		/*
		 * You are also often need to do the reverse conversion i.e converting from integer to string. 
		 * Java provides couple of methods to do that also.
		 *  one is Integer.toString() method and another one is String.valueOf() method. 
		 *  Both these methods return string representation of the given integer.
		 */
		
		
		int i = 2015;
        
        String s = Integer.toString(i);
         
        System.out.println(s);
        
        int j=2018;
        
       String s1=String.valueOf(j);
       
       System.out.println(s1);
        

	}

}
