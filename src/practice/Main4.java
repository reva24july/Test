package practice;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a string:");
	String s=sc.nextLine();
		
int n=Usermaincode4.checkcharecters(s);
if(n==1)
{
	System.out.println("The string is valid");
}
else
{
System.out.println("The string is not valid");
}	
}

}
