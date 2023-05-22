package interviewAutomation;

import java.util.HashSet;

public class StringDuplicates {
	public static void main(String[] args) {
	String s="Revathiaa";
	
	char arr[]=s.toCharArray();
HashSet<Character> set=new HashSet<Character>();
for(char c: arr) {
	set.add(c);
	
}

	System.out.println(set);

	}
			
}

