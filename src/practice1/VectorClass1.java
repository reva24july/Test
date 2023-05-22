package practice1;

import java.util.Scanner;
import java.util.Vector;

public class VectorClass1 {
public double GetVectorLength(Vector<Double> vector) {
	double x=vector.get(0);
	double y=vector.get(1);
	double z=vector.get(2);
	double sum =(x*x)+(y*y)+(z*z) ;
	double magnitude=Math.sqrt(sum);
     return magnitude;

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);

System.out.println("Enter the three coordinates:");
Vector<Double> vector=new Vector<Double>();
for(int i=0;i<3;i++) {
	vector.add(sc.nextDouble());
}
System.out.println(vector);
VectorClass1 vc=new VectorClass1();
double mag=vc.GetVectorLength(vector);
System.out.println("Magnitude of vector:"+mag);
	}

}
