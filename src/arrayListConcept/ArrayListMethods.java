package arrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {
	public static void main(String[] args) {

		ArrayList<String> ar1 = new ArrayList<>();
		ar1.add("Java");
		ar1.add("phython");
		ar1.add("ruby");
		ar1.add("Javascript");
		ArrayList<String> ar2 = new ArrayList<>();
		ar2.add("Testing");
		ar2.add("Devops");
//		ar1.addAll(ar2);

		System.out.println(ar1);

		ar1.addAll(1, ar2);

		System.out.println(ar1);

		// clear

//		ar1.clear();
//		System.out.println(ar1);

		// clone

		ArrayList<String> cloneList = (ArrayList<String>) ar1.clone();
		System.out.println("cloneList" + cloneList);

		// contain

		System.out.println(ar1.contains("phython"));
		
		//indexOf
		System.out.println(ar1.indexOf("ruby")>2);
		
		//lastIndexOf
		
		ArrayList<String> list = new ArrayList<>(Arrays.asList("Brajesh","Naveen" ,"Naveen", "Lisa","Naveen"));
		System.out.println(list);
		
		//lastIndexOf
		System.out.println(list.lastIndexOf("Naveen"));
		
		//remove
		
		System.out.println(list.remove(0));
		System.out.println(list.remove("Lisa"));
		System.out.println(list);
		
		//removeif
		
		ArrayList<Integer> integerList = new ArrayList<Integer>(Arrays.asList(10,20,39,40,50));
//		integerList.removeIf(num-> num>20);
//		System.out.println("integerList"+ integerList);
		
		integerList.removeIf(num -> num%2!=0);
		
		System.out.println("integerList"+ integerList);
		
		ArrayList<String> nameList = new ArrayList<>(Arrays.asList("Brajesh","Naveen" ,"Naveen", "Lisa","Naveen"));
		
		nameList.retainAll(Collections.singleton("Naveen"));
		System.out.println(nameList);
		
		
		ArrayList<Integer> number = new ArrayList<>(Arrays.asList(1,2,3,45,6,7,890));
		
		//subList
		ArrayList<Integer> subList= new ArrayList<Integer>(number.subList(2, 6));
		System.out.println(subList);
		
		
		//convert List to Array
		
		ArrayList<String> newList = new ArrayList<>(Arrays.asList("Brajesh","Naveen" ,"Naveen", "Lisa","Naveen"));
		
	Object arr[]=	newList.toArray();
		System.out.println(Arrays.toString(arr));
		
		for (Object o : arr) {
			
			System.out.println((String)o);
			
			
		}
		
		
		
		
		

	}

}
