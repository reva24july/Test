package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("RevathiA");
		list.add("RevathiB");
		list.add("RevathiF");
		list.add("RevathiD");
		list.add("RevathiE");
		System.out.println(list);
		list.stream().
		filter((s)->s.startsWith("R")).map((s)->s.toUpperCase())
		.sorted().forEach((s)->System.out.println(s));


	}

}
