package oops;
class car{
	public void working() {
	System.out.println("The car works good");
}
}
class honda extends car{
	public void brand() {
		System.out.println("The honda brand is honda accord");
	}
}
class toyota extends car{
	public void color() {
		System.out.println("The color is White");
	}
}
public class vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		honda h=new honda();
		toyota t=new toyota();
		h.working();
		h.brand();
		t.color();

	}

}
