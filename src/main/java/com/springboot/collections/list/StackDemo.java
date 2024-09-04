package com.springboot.collections.list;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class StackDemo {

	public static void main(String[] args) {
		
		List<Character> slist=new Stack<>();
		
		slist.add('G');
		slist.add('D');
		slist.add('Y');
		slist.add('C');
		slist.add('J');
		slist.add('W');
		slist.add('Z');
		slist.add('U');
		
		Stack<Integer> list = new Stack<>();
		list.push(28);
		list.push(20);
		System.out.println("Stack Integers:");
		System.out.println(list);
		System.out.println(list.peek());
		list.pop();
		System.out.println(list.empty());
		
		System.out.println(list);
		
		System.out.println("Stack elements: "+slist);
		
		System.out.println("Sorted elements: ");
		slist.stream().sorted().forEach(n->System.out.print(n+"  "));
		
		
		
		slist.remove(2);
		System.out.println("After removing 2 index: "+slist);
		
		System.out.println("vlist contain jaya: "+slist.contains('A'));
		
		System.out.println("vlist is Empty: "+slist.isEmpty());
		
		System.out.println("vlist get index 0 value: "+slist.get(0));
		
		System.out.println("Size of vlist: "+slist.size());
		
		System.out.println("Find first element: "+slist.stream().findFirst());
		
		System.out.println("Using for loop: ");
		for(int i=0;i<slist.size();i++)
			System.out.println(slist.get(i));
		
		System.out.println("Using ForEach loop: ");
		
		for(char a:slist)
			System.out.println(a);
		
		System.out.println("Using Stream API");
		slist.stream().forEach(n ->System.out.println(n));
		
		System.out.println("Using Iterator: ");
		
		Iterator itr=slist.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Using Collectors: ");
		System.out.println(slist.stream().collect(Collectors.toList()));
		
		System.out.println("Using ListIterator: ");
		slist.listIterator().forEachRemaining(n ->System.out.println(n));
		
		slist.clear();
		System.out.println(slist); 		// remove all elements from the list
		

		
	}
}
