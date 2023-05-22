package oops;

import java.util.Scanner;

public class PermenantEmployee {
	private float pfpercentage;
	private float salary;
	float NetSalary;

public boolean validateinput(float salary, float pfpercentage) {
		if((pfpercentage<0 || salary<=0)) {
		return false;
		}
		else {
			return true;
		}
	}
	
public void findNetSalary(float salary ,float pfpercentage) {
	
	float pfamount=(salary*pfpercentage)/100;
	System.out.println("pf Amount:"+pfamount);
	 float NetSalary=salary-pfamount;
	 System.out.println("Net salary=" +NetSalary);

}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Employee e=new Employee();
		 PermenantEmployee P=new PermenantEmployee();
		 String name=e.getName();
		 float salary=e.getSalary();
		 System.out.println("Enter the pf percentage:");
		 float pfpercentage=s.nextFloat();
	
	   boolean input=P.validateinput(salary, pfpercentage);
		if( input==true)
		{
			System.out.println("Employee Name:"+ name);
			P.findNetSalary(salary, pfpercentage);
            
		}
		else {
			System.out.println("Error");
		
		}
		
}

}
