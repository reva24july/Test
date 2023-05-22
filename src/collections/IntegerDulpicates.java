package collections;

import java.util.HashMap;
import java.util.Scanner;

public class IntegerDulpicates {

	public void findingtheOccurenceOfDuplicates(int arr[]) {
		HashMap<Integer,Integer> occurence=new HashMap<Integer,Integer>();
	
		for(int i:arr) {
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
		System.out.println("Enter 10 numbers:");
int arr[]=new int[10];
		for(int i=0;i<10;i++) {
				 arr[i]=sc.nextInt();
		}
		IntegerDulpicates d=new IntegerDulpicates();
d.findingtheOccurenceOfDuplicates(arr);
	}

}
