package OOPS;

interface A
{
	int a = 10;
	void m1();	
}

interface B
{
	int b = 20;
	void m2();	
}

public class MultipleInheritanceExample implements A,B {
	public void m1() {
		System.out.println(a);
	}
	
	public void m2() {
		System.out.println(b);
	}


public static void main(String[]args) {
	
	MultipleInheritanceExample mi = new MultipleInheritanceExample();
	mi.m1();
	mi.m2();
	
	
}


}

