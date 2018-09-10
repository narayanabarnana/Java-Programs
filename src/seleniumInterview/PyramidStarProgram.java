package seleniumInterview;

import java.util.Scanner;

public class PyramidStarProgram {

	public static void main(String[] args) {
		
		int k=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		int n=sc.nextInt();
		
		for(int i=0;i<=n;i++)
		{
			
			for(int j=1;j<=(n-1);j++)
			{
				System.out.print(" ");
					
			}
			
			while(k!=(2*i-1))
			{
				System.out.print("* ");
				k++;
			}
			
			k=0;
			System.out.println();
			
		}

	}

}
