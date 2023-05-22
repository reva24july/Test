package Array;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sortarray {
	public ArrayList<BigInteger> arrayListSortDesc() {
	    
	       ArrayList<BigInteger> list1=new ArrayList<BigInteger>();
	       Scanner sc=new Scanner(System.in);
	      System.out.println("Enter the biginteger 1:");
	     String a=sc.next();
	     list1.add(new BigInteger(a));
	     System.out.println("Enter the biginteger 2:");
	    String b =sc.next();
	     list1.add(new BigInteger(b));
	     System.out.println("Enter the biginteger 3:");
	     String  c=sc.next();
	     list1.add(new BigInteger(c));
	     System.out.println("Enter the biginteger 4:");
	     String d=sc.next();
	     list1.add(new BigInteger(d));
	     System.out.println("Enter the biginteger 5:");
	     String  e=sc.next();
	     list1.add(new BigInteger(e));
 System.out.println(list1);
	      // for( BigInteger i=0;i<=5;i++) {
	    	//    i=sc.nextBigInteger();
	    	  // list1.add(new BigInteger("i"));
	    	  //list.add(new BigInteger("-346"));
	      // }
	     Collections.sort(list1);
	     System.out.println(list1);
			return list1;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
sortarray sort=new sortarray();
sort.arrayListSortDesc();
	}

}
