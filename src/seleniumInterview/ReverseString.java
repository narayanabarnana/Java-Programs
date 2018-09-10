package seleniumInterview;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		
		String input,reverse="";  //initializing the string reverse to null
		System.out.println("Enter the input string : ");
		//Scanner : used to take the input from the string
		Scanner sc=new  Scanner(System.in);
		input=sc.nextLine();
		
		int n=input.length();
		System.out.println("length of the string is " + n);
		
		
		//for loop is used to extract the last character from the string
		for(int i=input.length()-1;i>=0;i--){
			
			reverse=reverse+input.charAt(i);
			//charAt(i) --  return the char value at the specified index
			
		}
		
		System.out.println("The reverse string is " + reverse);


	}

}
