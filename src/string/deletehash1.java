package string;

import java.util.Scanner;

public class deletehash1 {
	String v;
	public String excludehash(String v) {
		String s=new String(v);
		for(int i=0;i<s.length();i++) {
			int l=s.length();
			char a=s.charAt(i);
			//if(a=='#'&& b=='#') {
			//	System.out.println(v.substring(0,i-1)+v.substring(i+3,l));
			//}
			 if(a=='#') {
			System.out.println(v.substring(0,i-1)+v.substring(i+2,l));
			}
		}return v;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string:");
String v=sc.next();
deletehash1 de=new deletehash1();
de.excludehash(v);
	}

}
