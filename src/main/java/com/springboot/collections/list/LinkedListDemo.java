package com.springboot.collections.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		List<Double> list=new LinkedList<>();
		
		list.add(20.30);
		list.add(12.23);
		list.add(24.34);
		list.add(3.43);
		list.add(77.53);
		list.add(2.19);
		list.add(64.4);
		list.add(20.8);
		System.out.println("LinkedList elements: "+list);
		
		System.out.print("Sorted order: ");
		list.stream().sorted().forEach(n ->System.out.print(n+"   "));
		
		list.remove(2);
		System.out.println("After removing 2 index: "+list);
		
		System.out.println("list contain laya: "+list.contains('A'));
		
		System.out.println("list is Empty: "+list.isEmpty());
		
		System.out.println("list get index 0 value: "+list.get(0));
		
		System.out.println("Size of vlist: "+list.size());
		
		System.out.println("Find first element: "+list.stream().findFirst());
		
		System.out.println("Using for loop: ");
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		
		System.out.println("Using ForEach loop: ");
		
		for(double a:list)
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
