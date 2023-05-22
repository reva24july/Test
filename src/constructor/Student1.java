package constructor;

import java.util.Scanner;

public class Student1 {
Student1(){
	System.out.println("unknown");
}
	Student1(String name){
System.out.println("The name of the student is:"+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=s.nextLine();
		if (name=="") {
			Student1 stu=new Student1();
		}
		else {
			Student1 stu1=new Student1(name);
		}

	}

}
