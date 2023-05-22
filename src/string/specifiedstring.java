package string;

import java.util.Scanner;

public class specifiedstring {
	String v;
	
public void lastcasecheck(String v) {
	String str=new String(v);
	int c=str.length();
	if (c>2) {
	System.out.println(str.endsWith("ng"));
	}
	else {
		System.out.println("Enter a String which has more characters");
	}

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String v=sc.next();
		specifiedstring ss=new specifiedstring();
		ss.lastcasecheck(v);
	}

}
