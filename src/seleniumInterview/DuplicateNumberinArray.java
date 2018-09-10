package seleniumInterview;

public class DuplicateNumberinArray {

	public static void main(String[] args) {
		
		
		int numbers[]=new int[]{25,15,30,8,25,6,4,3,6,8};
		
		for(int i=0;i<numbers.length;i++)
		{
			for(int j=i+1;j<numbers.length;j++)
			{
				
				if(numbers[i]==numbers[j])
				{
					System.out.println("The duplicate numbers is " + numbers[j]);
				}
			}
			
			
		}

	}

}
