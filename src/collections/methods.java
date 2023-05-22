package collections;

import java.util.ArrayList;

public class methods {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("aaaa");
		al.add("bbbbb");
		al.add(1);
		al.add(2);
		System.out.println(al);
		//*** ArrayList<String> al2=new ArrayLisy<String>();
		ArrayList al1=new ArrayList();
		al1.add('a');
		al1.add('b');
		System.out.println(al1);
	System.out.println(al.remove(1));
	System.out.println(al);
	al.addAll(al1);
	System.out.println(al);
	System.out.println(al.contains(al1));
	System.out.println(al1.size());
	
	}

}
