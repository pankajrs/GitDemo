package coreJava;

public class StaticVar {
	
	String name; //instance variables
	String address;
	static String city = "Pune"; //class variables
	static int i=0;
	
	StaticVar(String name, String address)
	{
		this.name= name;
		this.address= address;
		i++;
		System.out.println(i);
		
	}
	public void getAddress()
	{
		System.out.println(address+", "+city);
	}
	
	

	public static void main(String[] args) {
		
		StaticVar obj = new StaticVar("Bob","Mg Road");
		StaticVar obj1 = new StaticVar("John","FC road");
		
		obj.getAddress();
		obj1.getAddress();
		//StaticVar.getCity();
		StaticVar.i=4;
		obj.address="XYZ";

	}

}
