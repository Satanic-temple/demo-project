package OOPS;

public class Javaprogram1 {

	public static void main(String[] args) {
		
		String s = "SALESMAN";
		char c; 
		String n = "";
		
		for(int i =0; i<= s.length()-1;i++)
		{
			c = s.charAt(i);
			n = c+n;
		}
		System.out.println("Reverse String is :"+n);
		

	}

}
