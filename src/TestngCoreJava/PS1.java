package TestngCoreJava;

import java.awt.geom.Path2D;

import org.testng.annotations.Test;

public class PS1 extends PS{

	@Test
	public void testRun() 
	{
		PS2 p2 =new PS2(3);  //Parameterised constructor
		
		doThis();
		System.out.println(p2.increment());
		System.out.println(p2.decrement());
		System.out.println(p2.multiplyThree());
	}

}
