package OOPS;

public class StaticExample {

	int a;
	static int b;
	
	void m1()
	{
		System.out.println("this is m1 - Non static method");
	}
	
	static void m2()
	{
		System.out.println("this is m2 -  static method");
	}
	
	
	public static void main (String[] args)
	{
		b =100;
		System.out.println(b);
		m2();
		StaticExample se = new StaticExample();
		se.a=150;
		System.out.println(se.a);
		se.m1();			
	}

}
