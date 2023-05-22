package basics;

import java.util.Scanner;

public class Rectangle {

public double perimeter(double breadth ,double length) {
		double perimeter=2*(breadth+length);
		return(perimeter);
		}
	
public void getvalues() {
	Scanner s= new Scanner(System.in);
	System.out.println("enter the value of breadth:");
	double b=s.nextDouble();
	System.out.println("enter the value of length:");
	double l=s.nextDouble();
	double rectangleperimeter=perimeter(b,l);
	System.out.println("area of the rectangle  is:"+rectangleperimeter);
}
	public static void main(String[] args) {
		Rectangle area=new Rectangle();
		area.getvalues();

	
	}

}
