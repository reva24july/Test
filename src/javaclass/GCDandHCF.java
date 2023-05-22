package javaclass;

import java.util.Scanner;

public class GCDandHCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find GCDand HCF");
		int n1=sc.nextInt();
		System.out.println("Enter a number to find GCDand HCF");
		int n2=sc.nextInt();
		for(int i=2;i<=5;i++) {
if(n1%i==0 && n2%i==0) {
	System.out.println("Greatest common factor:"+i);
	
}

	}

}}
