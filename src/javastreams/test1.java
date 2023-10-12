package javastreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class test1 {

	//@Test
	public void regular() {

		ArrayList<String> names = new ArrayList<String>();
		names.add("Pankaj");
		names.add("Vishal");
		names.add("Prashant");
		names.add("Deepak");
		names.add("Mahesh");
		int count = 0;

		for (int i = 0; i < names.size(); i++) {
			String actual = names.get(i);
			if (actual.startsWith("A")) {
				count++;
			}
		}
		System.out.println(count);

	}

	//@Test
	public void StreamFilter() 
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Pankaj");
		names.add("Vishal");
		names.add("Prashant");
		names.add("Deepak");
		names.add("Mahesh");
		//there is no life for intermediate op if there is no terminal op
		//terminal operation will execute only if inter op (filter) returns true
		//We can create stream
		//how to use filter in Stream API
		
		Long c= names.stream().filter(s->s.startsWith("P")).count();
		System.out.println(c);
		
		Long d = Stream.of("Abhijeet","Don","Ram","Shyam","Ganu").filter(s->
		{
			s.startsWith("A");
			return true;
		}
		).count();
		System.out.println(d);
		//print all the names of ArrayList
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
	}

	@Test
	public void StreamMap() 
	{
		
		//print names of length>4 with Uppercase
		Stream.of("Abhijeet","Don","Rama","Shyama","Ganu").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		
		//print names which have first letter as a with Uppercase and sorted
		List<String>names=Arrays.asList("Abhijeet","Don","Rama","Shyama","Ganu");
		names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		
		
	}
}
