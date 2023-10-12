package basics;

public class CoreJavaBrushup01 {

	public static void main(String[] args) {
		
		/*int myNumb = 5;
		String website = "Rahul Shetty Acadamy";
		char letter = 'r';
		double decimal = 8.78;
		boolean myCard = true;
		
		System.out.println(myNumb +" is the value stored in the myNumb");
		System.out.println(website); 
		
		//Arrays-
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 4;
		arr[3] = 5;
		arr[4] = 6;
		
		int[] arr2 = {1,2,3,4,5,8,9};
		
		System.out.println(arr[2]);
		System.out.println(arr2[4]);
		
		//for loop
		for(int i=0; i<= arr2.length; i++)
		{
			System.out.println(arr2[i]);
		} */
		
		String[] name = {"Pankaj", "Mahesh", "Vishal"};
		
		for(int i=0; i< name.length; i++) 
		{
			System.out.println(name[i]);
		} 
		
		for(String s: name) 
		{
			System.out.println(s);
		}
		
	}

}
