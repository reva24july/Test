package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {21,23,43,12,31,67,93,24,14};
ArrayList<Integer> list=new ArrayList<Integer>();
for(int i:arr) {
	list.add(i);
}
Collections.sort(list);
System.out.println(list);
Collections.reverse(list);
System.out.println("Reverse order:"+list);

	}

}
