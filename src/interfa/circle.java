package interfa;

public class circle implements shape,Shape2{
double r;
	@Override
	public double Area() {
		r=4;
		return(3.14*r*r);
		
	}

	@Override
	public double circumference() {
		// TODO Auto-generated method stub
		return (2*3.14*r);
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return (r*r*r);
	}
	

}
