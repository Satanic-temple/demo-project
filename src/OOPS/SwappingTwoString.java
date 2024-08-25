package OOPS;

public class SwappingTwoString {

	public static void main(String[] args) {
		
		String S1 = "SpiderMan";
		String S2 = "IronMan";	
		
		//Combine both String and keep in S1
		
		S1 = S1+S2;
		// S1 =SpiderManIronMan
		// S2 should be SpiderMan
		
		S2 = S1.substring(0, S1.length()-S2.length());
		// S1 =SpiderManIronMan
		//S1 should be IronMan
		S1=S1.substring(S2.length());
		
		System.out.println("S1 is: "+S1);
		System.out.println("S2 is: "+S2);
		
	}

}
