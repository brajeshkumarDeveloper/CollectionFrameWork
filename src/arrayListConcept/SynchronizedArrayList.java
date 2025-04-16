package arrayListConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {
	public static void main(String[] args) {
		
		
		List<String> namesList = Collections.synchronizedList(new ArrayList<String>());
		namesList.add("Java");
		namesList.add("Python");
		namesList.add("Ruby");
		
		//add, remove- we don't need explicit synchronization
		
		//to fetching the value from list - we have to use explisit synchronization
		
		synchronized (namesList) {
			
			Iterator<String> it = namesList.iterator();
			
			while (it.hasNext()) {
				System.out.println(it.next());
				
			}
			
		}
		
		//2 copyOnWriteArrayList - its a class
		
		CopyOnWriteArrayList<String> empList= new CopyOnWriteArrayList<String>();
		empList.add("Brajesh");
		empList.add("Rahul");
		empList.add("Rajesh");
		Iterator<String> it1 = empList.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
			
		}
		
		
		
		System.out.println(empList);//we don't need to any  explisit synchronization
		
		
		
	}
	

}
