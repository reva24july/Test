package basics;

import java.util.Scanner;

public class trial3 {

public int add(int a,int b) {
	int add=a+b;
	return add;
	}
public int sub(int a,int b) {
	int sub=a-b;
	return sub;}
public int mul(int a,int b) {
		int mul=a*b;
		return mul;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value of a:");
		int a=sc.nextInt();
		System.out.println("Enter the value of b:");
		int b=sc.nextInt();
		trial3 operator=new trial3();
		System.out.println("addition value:"+operator.add(a,b));
		System.out.println("sub value:"+operator.sub(a,b));
		System.out.println("multiplication value" +operator.mul(a,b));
		}
	}
