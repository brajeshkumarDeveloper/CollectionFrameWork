package HashMapConcept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//no order - no indering
		//store value - key-value 
		//key don't be dublicate
		//can store n number of null value but only null key
		//hashmap is not thread-safe
		
		HashMap<String , String> capitaltMap= new HashMap<String, String>();
		
		capitaltMap.put("India", "New Delhi");
		capitaltMap.put("USA", "Washigton DC");
		capitaltMap.put("UK", "London");
		capitaltMap.put("UK", "London1");
		capitaltMap.put(null, "London1");
		capitaltMap.put(null, "LA");
		
		System.out.println(capitaltMap.get("UK"));
		System.out.println(capitaltMap.get(null));
		System.out.println(capitaltMap.get(null));
		System.out.println(capitaltMap);
		 
		capitaltMap.remove(null);
		//iterator over key: by using keySet()
		
		Iterator<String> it = capitaltMap.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			String value = capitaltMap.get(key);
			System.out.println(key + ":"+value );
		}
		
		//iterator : over the set (pair): by using entryset
		Iterator<Entry<String, String>> it1 = capitaltMap.entrySet().iterator();
		
		while(it1.hasNext()){
			Entry<String, String> entry = it1.next();
			
			System.out.println("key= "+ entry.getKey() + " and value ="+ entry.getValue());
		}
		 
		System.out.println("-----------");
		//iterator hashmap usinh java 8 for each and lamda
		capitaltMap.forEach((k,v)-> System.out.println("key="+ k+ "and value="+ v));
		
		
		
		
		
		

	}

}
