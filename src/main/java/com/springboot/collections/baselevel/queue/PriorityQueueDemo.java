package com.springboot.collections.baselevel.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collectors;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		Queue <String> qlist =new PriorityQueue<>();
		
		qlist.add("prabha");
		qlist.add("charan");
		qlist.add("dharma");
		qlist.add("sanjay");
		qlist.add("kaveri");
		qlist.add("laya");
		qlist.add("geetha");
		
		System.out.println("PriorityQueue elements: "+qlist);
		
		qlist.add("sudha");
		System.out.println("After add: "+qlist);
		
		qlist.remove(13);		// remove values
		qlist.poll();			// 1st element
		
		System.out.println("After  removing: "+qlist);
		
		System.out.println("list contain value 10: "+qlist.contains(10));// false BCZ of  previous step removing 4th index
		
		System.out.println("List Contain value 50: "+qlist.contains(50));// true
		
		System.out.println("get first value: "+qlist.peek());
		
		System.out.println("size of list: "+qlist.size());
		
		System.out.println("List is Empty: "+qlist.isEmpty());
		
		System.out.println("Count of elements in List: "+qlist.stream().count());
		System.out.println("Sorted Order: ");
		qlist.stream().sorted().forEach(n ->System.out.print(n+"  "));
		
		System.out.println("\nFirst Element in the List: "+qlist.stream().findFirst());
		
		System.out.println("Find Any element from list: "+qlist.stream().findAny());
		
		
		System.out.println("Using for loop: ");
		for(int i=0;i<qlist.size();i++)			// we can't access the next element from peek() method
			System.out.println(qlist.peek());
		
		System.out.println("Using ForEach loop: ");
		for(String a:qlist)
			System.out.println(a);
		
		System.out.println("Using Stream API");
		qlist.stream().forEach(n ->System.out.println(n));
		
		System.out.println("Using Iterator: ");
		Iterator itr=qlist.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Using Collectors: ");
		System.out.println(qlist.stream().collect(Collectors.toList()));
		
		System.out.println("Using ListIterator: ");
		qlist.iterator().forEachRemaining(n ->System.out.println(n));
		qlist.clear();
		System.out.println(qlist); 		// remove all elements from the list
		
	}
}
