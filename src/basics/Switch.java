package basics;
import java.util.Scanner;


public class Switch {
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
System.out.println("enter your age");
int a=sc.nextInt();
switch(a) {
case 18:
	System.out.println("you are eligible to vote");
	break;
case 17:
	System.out.println("you are not eligible to vote");
	break;
	default:
		System.out.println("Enter valid age");
}		
	 }
}
