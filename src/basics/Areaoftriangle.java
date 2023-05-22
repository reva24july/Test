package basics;

import java.util.Scanner;

public class Areaoftriangle {
double h,b;
public double area(double h,double b) {
	double area=b*h/2;
	return area;
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the height of the triangle:");
double h=sc.nextDouble();
System.out.println("enter the base of triangle:");
double b=sc.nextDouble();
Areaoftriangle ar=new Areaoftriangle();
System.out.println("area of triangle:"+ar.area(h, b));

	}

}
