package basics;

import java.util.Scanner;

public class reverseint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int a=sc.nextInt();
		int rema=0;
		while(a!=0) {
			rema=(rema*10)+(a%10);//***1) 1234%10=4...>rema=4then a=1234/10=123  2)123%10=3...>rema=43..then a=12...it goes like this
			a=a/10;
					}
		System.out.println(rema);


	}

}
