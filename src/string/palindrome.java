package string;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new  Scanner(System.in);
System.out.println("Enter a string to check palindrome:");
String str=sc.next();
for(int i=0;i<str.length();i++) {
	for(int j=(str.length()-1);j>0;j--) {
		
		if(str.charAt(i)==str.charAt(j)) {
			System.out.println("The string is palindrome");
		}
		else {
			System.out.println("The string is not palindrome");
		}
	}
}
	}

}
