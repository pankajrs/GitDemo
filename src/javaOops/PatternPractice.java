package javaOops;

public class PatternPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int k=1;
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<4-i; j++)
			{
				System.out.print( k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
		}
		
		//int p=1;
		for(int q=1; q<=4; q++)
		{
		
			for(int r=1; r<=q; r++)
			{
				
				System.out.print(q);
				System.out.print(" \t");
				
			}
			System.out.println("");
		}*/
		
		int k=1;
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3-i; j++)
			{
				System.out.print(k*3);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
		}

	}

}
