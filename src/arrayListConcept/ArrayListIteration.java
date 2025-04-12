package arrayListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> studentList= new ArrayList<String>();
		studentList.add("Brajesh");
		studentList.add("Tom");
		studentList.add("Lisa");
		
		//typical for loop
		for(int i=0; i<studentList.size(); i++) {
			System.out.println(studentList.get(i));
		}
		
		System.out.println("++++++++++");
		//for each loop
		for (String s : studentList) {
			System.out.println(s);
			
		}
		
		System.out.println("++++++++++");
		
		//lamda function jdk8
		System.out.println("+++lamda function+++++++");
		studentList.stream().forEach(ele-> System.out.println(ele));
		
		//Iterator
		System.out.println("+++Iterator+++++++");
		Iterator<String> it = studentList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
			
		}
		
		
		

	}

}
