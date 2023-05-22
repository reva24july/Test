package practice1;

import java.util.Scanner;
import java.util.Vector;

public class Vectorclass2 {

		public double NormalizingVector(Vector<Double> vector) {
			double x=vector.get(0);
			double y=vector.get(1);
			double z=vector.get(2);
			double sum =(x*x)+(y*y)+(z*z) ;
			double magnitude=Math.sqrt(sum);
			double normvectorx=x/magnitude;
			double normvectory=y/magnitude;
			double normvectorz=z/magnitude;
			
		     return normvectorx;

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
		Vectorclass2 vc=new Vectorclass2();
		double vector1=vc.NormalizingVector(vector);
		System.out.println("normalization of vector1:"+vector1);

	}

}
