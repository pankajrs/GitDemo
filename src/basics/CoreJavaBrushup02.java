package basics;

import java.util.ArrayList;

public class CoreJavaBrushup02 {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 7, 22, 15, 40 };

		// check if array has multiple of 2

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i] + " is multiple of 2");
			} else {
				System.out.println(arr[i] + " is not multiple of 2");
			}
		}

		// create object of the class - object.method
		ArrayList<String> a = new ArrayList<String>();

		a.add("Pankaj");
		a.add("Mahesh");
		a.add("Vishal");
		a.add("Prashant");
		System.out.println(a.get(2));

		System.out.println("********");
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		System.out.println("********");
		for (String val : a) {
			System.out.println(val);
		}

		System.out.println("********");
		ArrayList<String> names = new ArrayList();
		names.add("kiya");
		names.add("jubli");
		names.add("less");
		names.add("Tilok");

		for (int j = 0; j < names.size(); j++) 
		{
			System.out.println(names.get(j));
		}

	}

}
