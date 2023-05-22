package basics;

import java.util.Scanner;

public class Biggernumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the number a:");
int a=s.nextInt();
System.out.println("enter the number b:");
int b=s.nextInt();
System.out.println("enter the number c:");
int c=s.nextInt();
if ((a>b)&&(a>c)) {
	System.out.println("a is bigger number");
}	
else if ((b>a)&&(b>c)) {
	System.out.println("b is bigger number");
}
else if ((a==b)&&(b==c)) {
		System.out.println("all are equal");
}
else {
			System.out.println("c is bigger");
	}

}

}
