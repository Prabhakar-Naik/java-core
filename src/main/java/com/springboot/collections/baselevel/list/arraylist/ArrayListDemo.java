package com.springboot.collections.baselevel.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		list.add(30);
		list.add(50);
		list.add(60);
		list.add(10);
		list.add(20);
		list.add(100);
		System.out.println("Normal List Elements: "+list);
		
		list.add(0, 80);
		System.out.println("After add index 0: "+list);
		
		list.remove(4);
		System.out.println("After 4 index removing: "+list);
		
		System.out.println("list contain value 10: "+list.contains(10));// false BCZ of  previous step removing 4th index
		
		System.out.println("List Contain value 50: "+list.contains(50));// true
		
		System.out.println("get 0 index value: "+list.get(0));
		
		System.out.println("size of list: "+list.size());
		
		System.out.println("List is Empty: "+list.isEmpty());
		
		System.out.println("Count of elements in List: "+list.stream().count());
		System.out.println("Sorted Order: ");
		
		list.stream().sorted().forEach(n ->System.out.print(n+"  "));
		
		System.out.println("\nFirst Element in the List: "+list.stream().findFirst());
		
		System.out.println("Find Any element from list: "+list.stream().findAny());
		
		System.out.println("All elements matches Even numbers: "+list.stream().allMatch( n ->n%2==0));
		
		System.out.println("All elements matches odd numbers: "+list.stream().allMatch(n -> n%2!=0));
		
		System.out.println("Any element matches odd number: "+list.stream().anyMatch(n ->n%2!=0));
		
		System.out.println("Any element matches even number: "+list.stream().anyMatch(n ->n%2==0));
		
		System.out.println("Using for loop: ");
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		
		System.out.println("Using ForEach loop: ");
		for(int a:list)
			System.out.println(a);
		
		System.out.println("Using Stream API");
		list.stream().forEach(n ->System.out.println(n));
		
		System.out.println("Using Iterator: ");
		Iterator itr=list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Using Collectors: ");
		System.out.println(list.stream().collect(Collectors.toList()));
		
		System.out.println("Using ListIterator: ");
		list.listIterator().forEachRemaining(n ->System.out.println(n));
		list.clear();
		System.out.println(list); 		// remove all elements from the list
	}
}
