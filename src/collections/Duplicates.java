package collections;

import java.util.HashMap;
import java.util.Scanner;

public class Duplicates {
	public void findingtheOccurenceOfDuplicates(String str) {
		HashMap<Character,Integer> occurence=new HashMap<Character,Integer>();
		char charArray[]=str.toCharArray();
		for(char c:charArray) {
			if(occurence.containsKey(c)) {
			occurence.put(c, occurence.get(c)+1);
		}else {
			occurence.put(c,1);
		}
		}
		System.out.println(occurence);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enater a string:");
		String str=sc.next();
		Duplicates d=new Duplicates();
d.findingtheOccurenceOfDuplicates(str);
	}

}
