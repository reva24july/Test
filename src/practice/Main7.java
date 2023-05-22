package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1=new ArrayList<Integer>();
		ArrayList<Integer> a2=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements for list1:");
		for (int i=0;i<5;i++) {
		
			a1.add(sc.nextInt());		
		}
		System.out.println("Enter the elements for list2:");
		for(int i=0;i<5;i++) {
			a2.add(sc.nextInt());
		}
		Usermaincode7.sortMergedArrayList(a1, a2);
		}
	}


