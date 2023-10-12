package coreJava;
//inheritance and functional overloading
//either argument count should be different or
//argument data type should be different
public class ChildClassDemo extends ParentClassDemo {
	
	public void engine()
	{
		System.out.println("New engine");
	}
	
	public void colour()
	{
		System.out.println(colour);
	}
	
	public void getData(int a)
	{
		System.out.println(a);
	}
	public void getData(String a)
	{
		System.out.println(a);
	}
	public void getData(int a, int b)
	{
		System.out.println(a);
	}
	public void audiosystem()
	{
		System.out.println("New audio child");
	}

	public static void main(String[] args) {
		
		ChildClassDemo n = new ChildClassDemo();
		//n.breaks();
		//n.colour();
		//n.Gear();
		n.audiosystem();
		//n.engine();
		//n.getData(5);
		//n.getData("Ganesh");
		//n.getData(30, 40);
		

	}

}
