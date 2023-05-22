package practice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList1 {
	 public int findingMaximumValue(ArrayList<Integer> arr1){
		//int maxvalue=Collections.max(arr1);
		int max=arr1.get(0);
		for(int i=1;i<arr1.size();i++) {
		if(max<arr1.get(i))	{
		max=arr1.get(i);
		}
		}
		return max;
		

	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        ArrayList<Integer> arr1=new ArrayList<Integer>();
	        System.out.println("Enter the size of the arraylist");
	        int s=sc.nextInt();
	        System.out.println("Enter the integer values:");
	        for(int i=0;i<=s;i++)
	        {
	            arr1.add(sc.nextInt());
	        }
	        ArrayList1  list=new ArrayList1();
	       int result= list.findingMaximumValue(arr1);
	       System.out.println("Maximum Value:"+result);
	       
	}

}
