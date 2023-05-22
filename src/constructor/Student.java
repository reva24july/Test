package constructor;

public class Student {
String name;
Student(){ //8constructor without passing values//
	name="unknown";
}
 Student(String n){ //*parameterized constructor//
	 name=n;
	 	}
 void display() {
	System.out.println(name);
	
 }
	public static void main(String[] args) {
		Student stu=new Student();
		Student stu1=new Student("Revathi");
		stu.display();
		stu1.display();
	}

}
 