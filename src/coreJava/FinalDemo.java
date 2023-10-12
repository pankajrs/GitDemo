package coreJava;

final class FinalDemo {
	
	final void getData()
	{
		System.out.println("wir");
	}
	
	//class name as final..that means you cannot extend that class

	public static void main(String[] args) {
		
		final int i=4; //constant variables
		
		//i=5;
		FinalDemo f = new FinalDemo();
		f.getData();

	}

}

/* Packages - set of classes interfaces..
 * java.lang - default package
 * java.io - file reading
 * java.util - collection interfaces
 * import package.classname
 * User define java packages
 * 
 * 1. Class A can use the Class B directly by creating object if both Class A
 * and Class B belongs to same package */

/*public, private, protected, default - 
 *Default : access method anywhere only in package 
 * 
 * public: variable/method as public : then you will have access across all
 * private: you can not access method or variable out side the class of same package
 */



