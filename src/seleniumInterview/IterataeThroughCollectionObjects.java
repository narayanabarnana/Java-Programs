package seleniumInterview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterataeThroughCollectionObjects {

	public static void main(String[] args) {
		
		
		List<String> mylist=new ArrayList<String>();
		
		mylist.add("Java");
		mylist.add("Oracle");
		mylist.add("ServiceNow");
		
		Iterator<String> itr=mylist.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
