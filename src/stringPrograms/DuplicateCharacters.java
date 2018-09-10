package stringPrograms;

import java.util.Scanner;

public class DuplicateCharacters {

	public static void main(String[] args) {
		
		
		String input;
		int cnt=0;
		
		System.out.println("Enter the input string");
		Scanner sc=new Scanner(System.in);
		input=sc.nextLine();
		
		char [] character=input.toCharArray();
		
		for(int i=0;i<input.length();i++){
			
			for(int j=i+1;j<input.length();j++){
				
				if(character[i]==character[j])
				{
					System.out.println(character[j]);
					cnt++;
					break;
				}
				
			}
			
		}

	}

}
