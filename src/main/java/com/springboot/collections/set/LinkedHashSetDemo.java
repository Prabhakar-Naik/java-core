package com.springboot.collections.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		Set<String> set=new LinkedHashSet<>();
		
		set.add("abc");
		set.add("ABC");
		set.add("DEF");
		set.add("def");
		//set.add(null);
		set.add("ghi");
		set.add("GHI");
		set.add("Prabha");
		
		System.out.println(set);
		
		set.remove("abc");
		System.out.println("After removing abc: "+set);
		System.out.println("Sorted order: ");
		set.stream().sorted().forEach(v ->System.out.print(v+"  "));	// null pointer Exception BCZ of null
		
		
		set.add("sandhya");
		System.out.println("\nAfter add sandhya : "+set);
		
		set.remove("Prabha");
		System.out.println("After 4 index removing: "+set);
		
		System.out.println("set contain value prabha: "+set.contains("Prabha"));// false BCZ of  previous step removing 4th index
		
		System.out.println("set Contain value sandhya: "+set.contains("sandhya"));// true
		
		//System.out.println("get 0 index value: "+set.get(0));
		
		System.out.println("size of set: "+set.size());
		
		System.out.println("set is Empty: "+set.isEmpty());
		
		System.out.println("Count of elements in set: "+set.stream().count());
		System.out.println("Sorted Order: ");
		set.stream().sorted().forEach(n ->System.out.print(n+"  "));
		
		System.out.println("\nFirst Element in the set: "+set.stream().findFirst());
		
		System.out.println("Find Any element from set: "+set.stream().findAny());
	
		System.out.println("Using ForEach loop: ");
		for(String a:set)
			System.out.println(a);
		
		System.out.println("Using Stream API");
		set.stream().forEach(n ->System.out.println(n));
		
		System.out.println("Using Iterator: ");
		Iterator itr=set.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Using Collectors: ");
		System.out.println(set.stream().collect(Collectors.toList()));
		
		System.out.println("Using iterator: ");
		set.iterator().forEachRemaining(n ->System.out.println(n));
		set.clear();
		System.out.println(set); 		// remove all elements from the list
		
		
	}
}
