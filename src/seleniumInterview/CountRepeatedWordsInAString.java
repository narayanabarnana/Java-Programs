package seleniumInterview;

public class CountRepeatedWordsInAString {

	public static void main(String[] args) {

		int wc=1;
		String s="Welcome to Java and Java and";
		String[] s1=s.split(" ");
		
		System.out.println("Number of words in a string are " + s1.length);
		
		for(int i=0;i<s1.length;i++)
		{
			for(int j=i+1;j<s1.length;j++){
				
				
				if(s1[i].equals(s1[j])){
					
					wc=wc+1;
					s1[j]="0";
					
				}
				
			}
			
			if(s1[i]!="0")
			{
				System.out.println(s1[i]  + "-----" + wc);
				wc=1;
			}
			
			
		}

	}

}
