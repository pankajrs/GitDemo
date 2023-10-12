package basics;

public class CoreJavaBrushup03 {

	public static void main(String[] args) {
		
		String s1 = "Hello Pune";                       //1
		String s2 = new String("Pune City");            //2
		
		String s3 = new String("Rahul Shetty Academy");
		String[] splittedString = s3.split("Shetty");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim());

		for(int i=s3.length()-1; i>=0; i--) {
			System.out.println(s3.charAt(i));
		}
	}

}
