package basics;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find a factorial:");	
int num=sc.nextInt();
factorial f=new factorial();
int result=f.findingfactorial(num);
System.out.println("Factorial:"+result);
	}

	public int findingfactorial(int num) {
		// TODO Auto-generated method stub
		int fact=1;
		for(int i=2;i<=num;i++) {
			fact=fact*i;
			
		}
		return fact;
	}

}
