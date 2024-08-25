package ExceptionHandling;

public class ExceptionHandling {
	
	
    
    public static void main (String [] args) throws Exception
    {
    	System.out.println("Program started");	
    int a = 10;
    
    /*try {
     System.out.println(a/0);
    }
    
    catch(Exception e)
    {
    	e.printStackTrace();
    }*/
    
    System.out.println(a/0);
    System.out.println("Program ended");	
    }
    

}
