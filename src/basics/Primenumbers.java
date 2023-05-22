package basics;

import java.util.Scanner;

public class Primenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int p=sc.nextInt();
for(int i=2;i<=9;i++) {
	if(p!=i) {
if(p%i!=0) {
	System.out.println("p is a prime number");
}
else {
	System.out.println("p is not a prime number");
}
}}
	}
	}

