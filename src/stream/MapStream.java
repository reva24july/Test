package stream;

import java.util.Comparator;
import java.util.HashSet;

public class MapStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> set=new HashSet<String>();
set.add("RevathiA");
set.add("RevathiB");
set.add("RevathiD");
set.add("RevathiD");
set.add("RevathiE");
System.out.println(set);
set.stream().
filter((s)->s.startsWith("R")).map((s)->s.toUpperCase())
.sorted(Comparator.naturalOrder()).forEach((s)->System.out.println(s));

	}

}
