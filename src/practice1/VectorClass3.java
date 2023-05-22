package practice1;

import java.util.Scanner;
import java.util.Vector;

public class VectorClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the three coordinates for vector1:");
		Vector<Double> vector1=new Vector<Double>();
		for(int i=0;i<3;i++) {
			vector1.add(sc.nextDouble());
		}
		System.out.println(vector1);
		Scanner sc1=new Scanner(System.in);

		System.out.println("Enter the three coordinates fro vector2:");
		Vector<Double> vector2=new Vector<Double>();
		for(int i=0;i<3;i++) {
			vector2.add(sc1.nextDouble());
		}
		System.out.println(vector2);
		//Vector<Double> crosspro=vector1.CrossProduct(vector2);
double CrossProduct1=((vector1.get(0)*vector2.get(1))-(vector1.get(1)*vector2.get(0)));
double CrossProduct2=((vector1.get(1)*vector2.get(2))-(vector1.get(2)*vector2.get(1)));
double CrossProduct3=((vector1.get(0)*vector2.get(2))-(vector1.get(2)*vector2.get(0)));
System.out.println("Cross product of two vecotrs:"+CrossProduct1+CrossProduct2+CrossProduct3);
	}

}
