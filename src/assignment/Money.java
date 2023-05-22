package assignment;

import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount like 11.58:");
		double m=sc.nextDouble();
int amount=(int)(m*100);
//finding dollars
int dollar=amount/100;
amount=amount%100;
//finding quarters
int quarters=amount/25;
amount=amount%25;
//finding dime
int dime=amount/10;
amount=amount%10;
//finding nickel
int nickel=amount/5;
amount=amount%5;
int penny=amount;
System.out.println("dollar:"+dollar);
System.out.println("quarters:"+quarters);
System.out.println("dime:"+dime);
System.out.println("nickel:"+nickel);
System.out.println("pennies:"+penny);


	}

}
