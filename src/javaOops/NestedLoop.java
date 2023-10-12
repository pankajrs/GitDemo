package javaOops;

public class NestedLoop {

	public static void main(String[] args) {
	// nested loops works-
		/*for(int i=1; i<=4; i++)  //(Outer for loop) this block will loop for 4 times
		{
			System.out.println("Outer Loop started");
			for(int j=1; j<=4; j++)  //inner loop
			{
				System.out.println("Inner Loop");
			}
			System.out.println("Outer Loop finished");
		}*/
		
		/*int k=1;
		for(int i=0; i<4; i++)
		{
			//System.out.println("Outer Loop started");
			for(int j=1; j<=4-i; j++)
			{
				System.out.print( k);
				System.out.print("\t");
				k++;
			}
			System.out.println( "");
		}*/
		
		
		/*int k=1;
		for(int i=4; i>0; i--)
		{
			for(int j=0; j<=4-i; j++)
			{
				System.out.print( k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
		}*/
		
		int k=1;
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<4-i; j++)
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
		}

	}

}
