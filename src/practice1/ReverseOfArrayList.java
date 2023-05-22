package practice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReverseOfArrayList {
	public ArrayList<Integer> ReverseOrder(ArrayList<Integer> list){
		Collections.reverse(list);
		return list;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>();
        System.out.println("Enter the size of the arraylist");
        int s=sc.nextInt();
        System.out.println("Enter the integer values:");
        for(int i=0;i<=s;i++)
        {
            list.add(sc.nextInt());
        }
        ReverseOfArrayList re=new ReverseOfArrayList();
       System.out.println(re.ReverseOrder(list));
     
	}

}
