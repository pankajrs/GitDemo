package coreJava;

public class ChildDemoSuper extends ParentDemoSuper{
	
	String name = "QAClickAcadamy";
	
	public ChildDemoSuper()
	{
		super();
		System.out.println("Child class constructor");
	}
	
	public void getStringdata()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
	public void getData()
	{
		
		System.out.println("I am in child class");
		super.getData();
	}

	public static void main(String[] args) {
		
		ChildDemoSuper cd = new ChildDemoSuper();
		
		cd.getStringdata();
		cd.getData();
	}

}
