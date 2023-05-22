package constructor;

import java.util.Scanner;

public class Car2 {
	int year;
	String make;
	double speed;
	
 Car2(int year,String make,double speed) {//*Constructor with passing values//
	System.out.println("year"+year); 
	System.out.println("make"+make);
	System.out.println("speed"+speed);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year=");
		int year=sc.nextInt();
		System.out.println("Enter the brand=");
		String make=sc.next();
		System.out.println("enter the speed=");
		double speed=sc.nextDouble();
		Car2 c2=new Car2(year, make, speed);
	

	}

}
