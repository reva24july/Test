package absrtaction;

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle a=new Circle();
		a.setcolor();
		double aa=a.calculateArea();
		System.out.println("The area of the circle is : "+aa);
		Square b=new Square();
		b.setcolor();
		double bb=b.calculateArea();
		System.out.println("The area of the square is:"+bb);

	}

}
