package oops;
import java.util.Scanner;
public class Employee {
	private String name;
	private float salary;
	private float netsalary;
	Scanner s=new Scanner(System.in);
	
	public String getName() {
		System.out.println("Enter the name  of Employee:");
		String name=s.nextLine();
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		System.out.println("Enter the salary of the employee:");
		float salary=s.nextFloat();
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}



}
