package string;

import java.util.Scanner;

public class casecheck {
	public void lastcasecheck(String v) {
		String str=new String(v);
		int l=str.length();
		char c=str.charAt(l-1);
		char d=str.charAt(l-2);
	  
		 if(c=='g'&& d=='n') {
	    			System.out.println("True");
	    	}			
		else {
			System.out.println("False");
		}}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String v=sc.next();
		casecheck cc=new casecheck();
cc.lastcasecheck(v);
}
}
