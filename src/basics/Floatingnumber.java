package basics;

import java.util.Scanner;

public class Floatingnumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
System.out.println("Enter a floating number;");
float a= s.nextFloat();
if(a==0)
{
	System.out.println("The number is zero");
}else if(a>0) {
	System.out.println("The number is positive");
}else if(a<0) {
	System.out.println("The number is negative");
}
 if (Math.abs(a)>1000000) {
	System.out.println("The number is large");
}
else if(Math.abs(a)<1){
	System.out.println("The number is small");
}
	}
}

	