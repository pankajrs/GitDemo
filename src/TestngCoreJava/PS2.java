package TestngCoreJava;

public class PS2 extends PS3{

	int a = 3;

	public PS2(int a) 
	{
		super(a);  //parent class constructor is invoke
		this.a=a;
	}

	public int increment() 
	{
		a = a + 1;
		return a;
	}
	
	public int decrement() 
	{
		a = a - 1;
		return a;
	}

}
