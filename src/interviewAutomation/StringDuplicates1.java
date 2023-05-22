package interviewAutomation;

import java.util.HashSet;

public class StringDuplicates1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Rev athi aa athi";
		String str=s.toLowerCase();
		String arr[]=str.split(" ");
	HashSet<String> set=new HashSet<String>();
	for(String c: arr) {
		set.add(c);
		
	}

		System.out.println(set);

		}

	}


