package Inter;

public class Train implements Ivehicle,IpublicTransport {

	public static void main(String[] args) {
	Train t=new Train();
	
t.getnumberofpeople();
t.drive();
t.turnleft();
t.brake();

	}

	@Override
	public void getnumberofpeople() {
		System.out.println("The  number of people in train=345");
		
	}

	@Override
	public void drive() {
		System.out.println("The train is in drive mode");
		
	}

	@Override
	public void turnleft() {
		System.out.println("The train is turning left");
	}

	@Override
	public void brake() {
		System.out.println("The car is in break mode");
		
	}

}
