package coreJava;

public class MultiDimentional {

	public static void main(String[] args) {
		
		int a[][] = new int[3][3];
		
		a[0][0] = 2;
		a[0][1] = 4;
		a[0][2] = 5;
		a[1][0] = 3;
		a[1][1] = 4;
		a[1][2] = 7;
		a[2][0] = 1;
		a[2][1] = 2;
		a[2][2] = 6;
		
		//System.out.println(a[1][0]);
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(a[i][j]);
				System.out.print("\t");
			}
			System.out.println("");
		}

	}

}
