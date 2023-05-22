package basics;

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of a:");
		int a=s.nextInt();
		if (a%2==0) {
			System.out.println("a is even number");
		}
		// TODO Auto-generated method stub
		else {
			System.out.println("a is not even number");
		}
	}

}
