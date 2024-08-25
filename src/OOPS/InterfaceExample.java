package OOPS;

interface Sona 
{
	
void show();
void display();

}

class Litu implements Sona
{
	public void show()
	{
		System.out.println("in show");
	}
	public void display()
	{
		System.out.println("in display");
	}
}



public class InterfaceExample {

	public static void main(String[] args) {
		
		Litu b = new Litu();
		b.show();
		b.display();
		

	}

}
