package string;

import java.util.Scanner;

public class deletehash {
	String v;
	public String excludehash(String v) {
		StringBuffer sb=new StringBuffer(v);
		for(int i=0; i<sb.length(); i++) {
		char ch=sb.charAt(i);
		if(ch =='#') {	
		 sb.deleteCharAt(i);
		 sb.deleteCharAt(i);
		 sb.deleteCharAt(i-1);
		 System.out.println(sb);
			
		}
		}
		return v;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String v=sc.next();
		deletehash d=new deletehash();
		d.excludehash(v);
		
		// TODO Auto-generated method stub

	}

}
