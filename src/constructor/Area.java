package constructor;

public class Area{
double r;
double area;
 Area(double r) //*constructor with passing parameter*//
 {
	 this.r=r;
}
 Area() //*constructor without passing parameter*//
 {
	double r=1;
}
 public double getarea()
{
	double area= 3.14*r*r;
	System.out.println("The area of circle is:"+area);
	return area;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Area circle1= new Area(2.0);
Area circle2=new Area(12);
Area circle3=new  Area(24);
Area  circle4=new Area();
System.out.println("The radius of circle1 =2.0");
System.out.println("The radius of circle 2 =12");
System.out.println("The radius of circle 3 =24");
System.out.println("The radius of circle 4=1");
circle1.getarea();
circle2.getarea();
circle3.getarea();
circle4.getarea();
	}

}
