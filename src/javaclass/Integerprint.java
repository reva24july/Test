package javaclass;

import java.util.Scanner;

public class Integerprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the 10 integers:");
int a=0;
for(int i=0;i<10;i++) {
   int n=sc.nextInt();
	a=a+n; 
  
}
System.out.println(a);
int aver= a/10;
System.out.println(aver);
	}

}
