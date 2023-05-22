package basics;

import java.util.Scanner;

public class methoddemo {
public int add1(int a,int b) //method overloading ***with two parameters//
{
	int add1= a+b;
	return add1;
}
public int add2(int a,int b,int c)//method overloading***with three parameters//
{
	int  add2=a+b+c;
	return add2;
	
}
	public static void main(String[] args) {
	methoddemo addition =new methoddemo();	// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the values of a,b,c");
int v1=s.nextInt();
int v2=s.nextInt();
int v3=s.nextInt();
System.out.println(addition.add1(v1,v2));
System.out.println(addition.add2(v1, v2, v3));

	}

}
