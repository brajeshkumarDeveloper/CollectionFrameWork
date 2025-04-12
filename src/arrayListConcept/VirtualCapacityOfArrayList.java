package arrayListConcept;

import java.util.ArrayList;

public class VirtualCapacityOfArrayList {
	public static void main(String[] args) {
		
		ArrayList<Object> arr= new ArrayList<Object>(20);//virtual capacity=20
		
		System.out.println(arr.size()); //pc=0 physical capacity
		arr.add(100);
		System.out.println(arr.size()); //pc=1
		
		arr.add(200);
		
		System.out.println(arr.size()); //pc=2
		
		
	}

}
