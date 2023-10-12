package coreJava;

public class MinimumNumberArray {

	public static void main(String[] args) {
		
		int abc[][] = {{2,5,9},{4,9,6},{8,11,7}};
		int min=abc[0][0];
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				if(abc[i][j]<min)
				{
					min=abc[i][j];
				}
			}
		}
		
		System.out.println(min);
		
	}

}
