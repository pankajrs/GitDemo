package coreJava;

public class ConstructClassDemo {
	
	public ConstructClassDemo()
	{
		System.out.println("I am in the constructor");
		System.out.println("I am in the constructor lecture 1");
	}
	
	//Parameterized contructor
	public ConstructClassDemo(int a, int b)
	{
		System.out.println("I am in the Parameterized constructor");
	}
	
	public ConstructClassDemo(String str)
	{
		System.out.println(str);
	}
	
	public void getdata()
	{
		System.out.println("I am the method");
	}
	
	//will not return value
	//name of constructor should be the class name

	public static void main(String[] args) {
		
		ConstructClassDemo cd = new ConstructClassDemo();
		ConstructClassDemo st = new ConstructClassDemo("Hello");
		ConstructClassDemo bd = new ConstructClassDemo(4,5);
		//compiler will call implicit construtor if you have not defin
		//when ever you create an object constructor is called
		//block of code when ever an object is created

	}

}
