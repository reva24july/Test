package practice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		Usermaincode odd=new Usermaincode();
		int r=odd.checksum(n);
		if(r==1)
		{
		System.out.println("The sum of the odd digits are odd");
		}else {
		System.out.println("The sum ofodd digits are even");}
		}
		
		
	}

