package collections;

import java.util.HashMap;
import java.util.Scanner;

public class StringDuplicates {

	public void findingtheOccurenceOfDuplicates(String arr[]) {
		HashMap<String,Integer> occurence=new HashMap<String,Integer>();
	
		for(String i:arr) {
			if(occurence.containsKey(i)) {
			occurence.put(i, occurence.get(i)+1);
		}else {
			occurence.put(i,1);
		}
		}
		System.out.println(occurence);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		String arr[]=str.split(" ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		StringDuplicates s=new StringDuplicates();			
s.findingtheOccurenceOfDuplicates(arr);
	}

}
