package basics;

public class trial{
String name;
int Tamil;
int English;
int Math;
int Science;
int Social;
public int Total() {
	int Total=Tamil+English+Math+Science+Social;
	return Total;
}
public float Average() {
 float Average=(Tamil+English+Math+Science+Social)/5;
 return Average;
}
public static void main(String[] agrs) {
	trial student1=new trial();
	student1.name="Revathi";
	student1.Tamil=95;
	student1.English=85;
	student1.Math=100;
	student1.Science=95;
	student1.Social=90;
	trial student2=new trial();
	student2.name="Sivaprakash";
	student2.Tamil=95;
	student2.English=95;
	student2.Math=100;
	student2.Science=95;
	student2.Social=90;
    System.out.println("Name:" +student1.name);
	System.out.println("Total mark ="+ student1.Total());
System.out.println("Average:"+ student1.Average());
System.out.println("Name:"+student2.name);
System.out.println("Total mark:" +student2.Total());
System.out.println("Average:"+ student2.Average());
}
}
