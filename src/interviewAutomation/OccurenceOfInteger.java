package interviewAutomation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class OccurenceOfInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1001,1002,1003,1005,1004,1002,1004,1009,1003,1004};
	  ArrayList<Integer> list=new ArrayList<Integer>();
	 for(int j: arr) {
		 list.add(j);
	 }
	 Collections.sort(list);
		System.out.println(list);
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i:list)
		if(map.containsKey(i)) {
		map.put(i,map.get(i)+1);
			
		}
		else
		{
			map.put(i, 1);
		}
		System.out.println(map);
		}

	

}
