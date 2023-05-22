package Inter;

public class Car extends Motorvehicle implements Ivehicle{

	public static void main(String[] args) {
		Car c=new Car();
		c.checkmotor();
		c.brake();
		c.drive();
		c.turnleft();
	
	}

	@Override
	public void drive() {
		System.out.println("The car is in drive mode");
		
	}

	@Override
	public void turnleft() {
		System.out.println("The car is turning left");
		
	}

	@Override
	public void brake() {
		System.out.println("The car is in brake mode ");
		
	}

}
