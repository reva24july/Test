package string;

import java.util.Scanner;

public class Countvowels {
	String v;
	int i;
	public void vowelscount(String v) {
		StringBuffer s =new StringBuffer(v);
		int l=s.length();
		int i;
		int vowel=0;
	for(i=0;i<l;i++) {
		
		char a=s.charAt(i);
		if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u') {
			vowel++;
		}
	}System.out.println(vowel);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter a string:");
String v=sc.next();
Countvowels c=new Countvowels();
c.vowelscount(v);
	}

}
