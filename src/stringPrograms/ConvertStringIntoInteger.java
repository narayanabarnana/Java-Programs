package stringPrograms;

public class ConvertStringIntoInteger {

	public static void main(String[] args) {
		
		
		/*
		 There are two methods available in java to convert string to integer. 
		 One is Integer.parseInt() method and another one is Integer.valueOf() method. 
		 Both these methods are static methods of java.lang.Integer class. 
		 Both these methods throw NumberFormatException if input string is not a valid integer. 
		 The main difference between Integer.parseInt() and Integer.valueOf() method is that parseInt() method returns primitive int where as valueOf() method returns java.lang.Integer object.
		 */
		
		
		
		
		String s="2015";
		
		int i=Integer.parseInt(s);
		
		System.out.println(i);
		
		String s1="2018";
		
		int j=Integer.valueOf(s1);
		
		System.out.println(j);
				

	}

}
