package basics;

import java.util.Scanner;

public class trial2 {
	int a,b,c,d;
	
public void input() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a value of a");
	int a= sc.nextInt();
	System.out.println("Enter a vaue of b");
	int b=sc.nextInt();	
     c= a+b;
     d=a-b;
		}
		public static void main(String[] args){
	trial2 operator= new trial2();
	operator.input();
	System.out.println("addition:"+operator.c);
	System.out.println("subtraction:"+operator.d);

	}
}

