package seleniumInterview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveElementFromCollectionUsingIterator {

	public static void main(String[] args) {
		
		String remove="Java";
		List<String> mylist=new ArrayList<String>();
		mylist.add("java");
		mylist.add("Oracle");
		mylist.add("Selenium");
		mylist.add("Appium");
		
		
		System.out.println("Before removing the list ");
		System.out.println(mylist);
		
		
		int size=mylist.size();
		System.out.println("Size of the array list is" + size);
		
		Iterator<String> itr=mylist.iterator();
		while(itr.hasNext())
		{
			if(remove.equalsIgnoreCase(itr.next()))
			{
				itr.remove();
			}
			
		}
		
		System.out.println("After removing , the list is ");
		System.out.println(mylist);

	}

}
