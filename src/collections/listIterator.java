package collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class listIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> iteration=new ArrayList<String>();
		iteration.add("ZZZ");
		iteration.add("BBB");
		iteration.add("CCC");
		iteration.add("DDD");
		
		System.out.println("List of users:"+iteration);
		Collections.sort(iteration);
System.out.println(iteration);
Iterator<String> i=iteration.iterator();

while(i.hasNext())
{
	System.out.println(i.next());
}
	}

}
