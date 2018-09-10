package seleniumInterview;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int number = 1234;
		  int reversedNumber = 0;
		  int temp = 0;

		  while (number > 0) {
		   //modulus operator used to strip off the last digit
		   temp = number % 10;

		   //create reversed number
		   reversedNumber = reversedNumber * 10 + temp;
		   number = number / 10;
		   System.out.println("number/10 is " + number);
		  }

		  //output
		  System.out.println("Reversed Number is: " + reversedNumber);

	}

}
