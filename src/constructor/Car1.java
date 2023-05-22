package constructor;

public class Car1 {

	int year;
	String make;
	double speed;
 Car1(int year,String make,double speed ) {//*Constructor with passing values//
	 this.year=year;
	 this.make=make;
	 this.speed=speed;
		}

 public void getYear() {
	 System.out.println("The year of the car:"+this.year);
	}
public void getMake() {
	System.out.println("car model:"+this.make);
	}
	public void getSpeed() {
		System.out.println("The speed of the car is:"+this.speed);
	}
	public static void main(String[] args) {
// TODO Auto-generated method stub
Car1 c1=new Car1(2022,"Honda",95.6);
c1.getYear();
c1.getMake();
c1.getSpeed();
	}
}
