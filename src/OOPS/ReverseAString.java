package OOPS;

public class ReverseAString {

	public static void main(String[] args) {
		String s = "Satik";
		String n = "";
		for(int i=0; i<=s.length()-1;i++)
		{
			n=s.charAt(i)+n;
			
		}
		System.out.println(n);

	}

}
