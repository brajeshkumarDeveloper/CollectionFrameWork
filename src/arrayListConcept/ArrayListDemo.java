package arrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		//default class
		//dynamic array
		//default generic
		
		ArrayList<Object> ar= new ArrayList<Object>(0);
		
		ar.add(100);//0
		ar.add(null);
		ar.add(100);//2
		ar.add("Brajesh");//2
		ar.add(true);//2
		ar.add(null);//2
		
		System.out.println(ar);
		System.out.println("100:"+ ar.get(2));
//		System.out.println("100:"+ ar.get(4));
		System.out.println("size:"+ ar.size());
		System.out.println("LI:"+ 0);
		System.out.println("HI:"+ (ar.size()-1));
		
		//list with other collection
		
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10,23,30,40));
		System.out.println(list);
		
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("Java", "C", "C++", "javascript"));
		System.out.println("names"+ names);
		System.out.println("Size: "+ names.size());
		
		
	}

}
