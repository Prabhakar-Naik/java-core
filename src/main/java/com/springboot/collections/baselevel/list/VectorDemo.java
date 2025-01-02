package com.springboot.collections.baselevel.list;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public class VectorDemo {

	public static void main(String[] args) {
		
		List<String> vlist=new Vector<>();
		
		vlist.add("prabha");
		vlist.add("venkat");
		vlist.add("laya");
		vlist.add("sudha");
		vlist.add("sandhya");
		vlist.add("kalidra");
		
		
		System.out.println("Vector elements: "+vlist);
		
		vlist.add(0, "Rama");
		System.out.println("After adding : "+vlist);
		
		vlist.remove(2);
		System.out.println("After removing 2 index: "+vlist);
		
		System.out.println("vlist contain laya: "+vlist.contains("laya"));
		
		System.out.println("vlist is Empty: "+vlist.isEmpty());
		
		System.out.println("vlist get index 0 value: "+vlist.get(0));
		
		System.out.println("Size of vlist: "+vlist.size());
		
		System.out.println("Find first element: "+vlist.stream().findFirst());
		
		System.out.println("Using for loop: ");
		for(int i=0;i<vlist.size();i++)
			System.out.println(vlist.get(i));
		
		System.out.println("Using ForEach loop: ");
		
		for(String a:vlist)
			System.out.println(a);
		
		System.out.println("Using Stream API");
		vlist.stream().forEach(n ->System.out.println(n));
		
		System.out.println("Using Iterator: ");
		
		Iterator itr=vlist.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Using Collectors: ");
		System.out.println(vlist.stream().collect(Collectors.toList()));
		
		System.out.println("Using ListIterator: ");
		vlist.listIterator().forEachRemaining(n ->System.out.println(n));
		
		vlist.clear();
		System.out.println(vlist); 		// remove all elements from the list
		
	}
}
