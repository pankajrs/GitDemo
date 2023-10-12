package coreJava;

import java.util.ArrayList;

public class ArrayListexample {
//can accept duplicate values
//ArrayList,LinkedList,vector- Implementing List interface

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Vishal");
		a.add("Java");
		System.out.println(a);
		a.add(2, "student");
		System.out.println(a);
		//a.remove(1);
		//System.out.println(a);
		System.out.println(a.get(0));
		//testing
		System.out.println(a.contains("Java"));
		System.out.println(a.indexOf("student"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		System.out.println(a.iterator());

	}

}
