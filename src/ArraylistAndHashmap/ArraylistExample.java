package ArraylistAndHashmap;

import java.util.ArrayList;

public class ArraylistExample {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		System.out.println("Size of arraylist before add" + " " + al.size());
		al.add("Hari");
		al.add(119);
		al.add(234.3333);
		al.add("C");
		System.out.println("Size of arraylist after add" + " " +al.size());
System.out.println(al);
	}

}
