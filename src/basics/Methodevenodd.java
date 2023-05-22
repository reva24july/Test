package basics;

import java.util.Scanner;

public class Methodevenodd {
	

	public void findevenodd() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println("Even number");
			
		}else {
		System.out.println("odd number");	
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Methodevenodd obj=new Methodevenodd();
obj.findevenodd();


	}

}

