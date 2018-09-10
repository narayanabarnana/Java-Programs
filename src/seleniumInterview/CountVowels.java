package seleniumInterview;

public class CountVowels {

	public static void main(String[] args) {
		
		String input="na13rayana";
		
		//convert the string into characters
		
		int len=input.length();
		System.out.println("Length of the sting is " + len);
		
		int vowels=0;
		int consonants=0;
		int digits=0;
		int spaces=0;
		for(int i=0;i<len;i++)
		{
			//charAt() to get the character at the given index (position).
			char ch = input.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') {
                ++vowels;
                System.out.println("vowels in a string are " + ch);
            }
            else if((ch >= 'a'&& ch <= 'z')) {
                ++consonants;
                System.out.println("consonants in a string are " + ch);
            }
            else if( ch >= '0' && ch <= '9')
            {
                ++digits;
                System.out.println("numbers in a string are " + ch);
            }
            else if (ch ==' ')
            {
                ++spaces;
            }
		}
		System.out.println("The number of vowels are " + vowels);
		System.out.println("The number of consonants are " + consonants);
		System.out.println("numbers in a string are " + digits);
		System.out.println("spaces in a string are " + spaces);

	}

}
