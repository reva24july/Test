package basics;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number1:");	
int num1=sc.nextInt();
System.out.println("Enter the number2:");
int num2=sc.nextInt();
System.out.println("Enter the operator(+,-,*,/):");
char operator=sc.next().charAt(0);
int result=calculate(num1,num2,operator);
System.out.println("The result is:"+result);
	}

public static int calculate(int num1, int num2,char operator) {
		// TODO Auto-generated method stub
	int res=0;
	
	switch(operator) {
		case '+':
			res=num1+num2;
			break;
		case '-':
			res=num1-num2;
			break;
		case '*':
			res=num1*num2;
			break;
		case '/':
			res=num1/num2;
			break;
	}
			
		return res;
	}

}
