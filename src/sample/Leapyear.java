package sample;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a year");
		int i=s.nextInt();
if(i%4==0) {
	System.out.println("It is a leap year");
}
	else {
		System.out.println("it is not leap year");
	}
}
	}


