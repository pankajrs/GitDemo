package coreJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapexample {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "hello");
		hm.put(1, "GoodBye");
		hm.put(42, "Morning");
		hm.put(3, "Evening");
		hm.put(5, "Night");
		System.out.println(hm.get(42));
		hm.remove(42);
		System.out.println(hm.get(42));
		
		Set sn = hm.entrySet();
		
		Iterator it = sn.iterator();
		
		while(it.hasNext())
		{
			//Map.Entry
		}

	}

}
