package com.springboot.collections.baselevel.set.treeset;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		Set<Integer> set=new TreeSet<>();
		
		set.add(20);
		set.add(40);
		set.add(80);
		set.add(200);
		set.add(100);
		set.add(10);
		set.add(52);
		System.out.println("Normal Treeset elements: "+set); 		//by default it is sorted.....
		
		set.remove(20);
		System.out.println("After removing 20: "+set);
		System.out.println("Sorted order: ");
		set.stream().sorted().forEach(v ->System.out.print(v+"  "));	// null pointer Exception BCZ of null
		
		
		set.add( 52);
		System.out.println("\nAfter add 52 : "+set);
		
		set.remove(100);
		System.out.println("After 4 index removing: "+set);
		
		System.out.println("set contain value 10: "+set.contains(10));// true
		
		System.out.println("set Contain value 50: "+set.contains(50));//false
		
		//System.out.println("get 0 index value: "+set.get(0));
		
		System.out.println("size of set: "+set.size());
		
		System.out.println("set is Empty: "+set.isEmpty());
		
		System.out.println("Count of elements in set: "+set.stream().count());
		System.out.println("Sorted Order: ");
		set.stream().sorted().forEach(n ->System.out.print(n+"  "));
		
		System.out.println("\nFirst Element in the set: "+set.stream().findFirst());
		
		System.out.println("Find Any element from set: "+set.stream().findAny());
		
		System.out.println("All elements matches Even numbers: "+set.stream().allMatch( n ->n%2==0));
		
		System.out.println("All elements matches odd numbers: "+set.stream().allMatch(n -> n%2!=0));
		
		System.out.println("Any element matches odd number: "+set.stream().anyMatch(n ->n%2!=0));
		
		System.out.println("Any element matches even number: "+set.stream().anyMatch(n ->n%2==0));
		
		
		
		System.out.println("Using ForEach loop: ");
		for(int a:set)
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
