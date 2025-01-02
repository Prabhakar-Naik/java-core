
package com.springboot.collections.baselevel.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<Integer,String> map=new HashMap<>();
		
		map.put(1, "prabha");
		map.put(3, "sudha");
		map.put(10, "sandhya");
		map.put(30, "gandhi");
		map.put(21, "laya");
		map.put(13, "subham");
		map.put(18, "kamala");
		map.put(2, "jaggu");
		map.put(15, "preetham");
		map.put(25, "mohith");
		System.out.println("Normal map elements with pair: "+map); 		// it will not allow duplicates key
		
		// map don't allow stream BCZ of it's not a part of collection streams not applied....
		
		System.out.println("map contain key 10 : "+map.containsKey(10));	//true
		
		System.out.println("map contain value prabha: "+map.containsValue("prabha"));//true
		
		System.out.println("map contain value guru: "+map.containsValue("guru"));	//false
		
		System.out.println("map contain key 110: "+map.containsKey(110));		//false
		
		
		System.out.println("map is empty: "+map.isEmpty());
		
		System.out.println("Size of map: "+map.size());
		
		System.out.println("map get the 25 th key: "+map.get(25));
		
		System.out.println("map replace: "+map.replace(2, "laya"));
		
		System.out.println(map);
		
		map.remove(1);
		System.out.println(map);
		
		System.out.println("Using forEach loop: ");
		
		for(Integer obj:map.keySet()) {
			System.out.println("key: "+obj+"  value: "+map.get(obj));
		}
		
		System.out.println("Using Entry specified :");
		for(Entry<Integer,String> entry:map.entrySet())
		{
			System.out.println("key: "+entry.getKey()+"  value: "+entry.getValue());
		}
		
		System.out.println("By using ForEach loop and Lambda Expression:");
		map.forEach((k,v)->System.out.println("key: "+k+"  value: "+v));
		
		System.out.println("By using Iterator: ");
		Iterator<Entry<Integer,String>> itr=map.entrySet().iterator();
		
		while(itr.hasNext()) {
			Entry<Integer, String> entry=itr.next();
			System.out.println("key: "+entry.getKey()+"  value: "+entry.getValue());
		}
		
		System.out.println("Sorted order use of TreeMap: ");
		Map<Integer,String> tmap=new TreeMap<>(map);
		System.out.println(tmap);
		
	}
}
