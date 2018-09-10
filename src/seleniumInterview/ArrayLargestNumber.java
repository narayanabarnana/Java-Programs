package seleniumInterview;

public class ArrayLargestNumber {

	public static void main(String[] args) {
		
		
		int numbers[] = new int[]{55,25,41,78,0};
		
		int largest=numbers[0];
		int smallest=numbers[0];
		
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]>largest)
			{
				largest=numbers[i];
					
			}
			else if (numbers[i]<smallest) 
			{
				smallest=numbers[i];
			}
			
		}
		
		System.out.println("The largest numbers is " + largest);
		System.out.println("The largest numbers is " + smallest);
	}

}
