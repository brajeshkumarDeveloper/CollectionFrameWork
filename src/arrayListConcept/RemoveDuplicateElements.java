package arrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      ArrayList<Integer> numbers= new ArrayList<>(Arrays.asList(12,23,344,55,55,12,23,55,78));
      //1.LinkedHashset
      
      LinkedHashSet<Integer> linkedHashSet= new LinkedHashSet<Integer>(numbers);
      
      ArrayList<Integer> numbersListWithoutDuplicate= new ArrayList<>(linkedHashSet);
      
      System.out.println(numbersListWithoutDuplicate);
      
      //2. jdk8 stream
      
      ArrayList<Integer> makksList= new ArrayList<>(Arrays.asList(12,23,344,55,55,12,23,55,78));
      
    List<Integer> makesUnique = makksList.stream().distinct().collect(Collectors.toList());
      
    System.out.println("makesUnique"+ makesUnique);

      
      
      
      
      
      

	}

}
