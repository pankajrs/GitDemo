package coreJava;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetexample {

	public static void main(String[] args) {
		
		//HashSet treeset, LinkedHashSet implements Set interface
		//does not accept duplicate values
		//There is no guarantee elements stored in sequential order..Random Order
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("India");
		hs.add("UK");
		hs.add("China");
		hs.add("China");
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		Iterator<String> i = hs.iterator();
		//System.out.println(i.next());
		//System.out.println(i.next());
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
