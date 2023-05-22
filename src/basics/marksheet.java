package basics;

public class marksheet{
String name="Revathi";
int Tamil=90;
int English=65;
int Math=85;
int Science=90;
int Social=95;
public int Total() {
	int Total=Tamil+English+Math+Science+Social;
	return Total;
}
public float Average() {
 float Average=(Tamil+English+Math+Science+Social)/5;
 return Average;
}
public static void main(String[] agrs) {
	marksheet student1=new marksheet();
	System.out.println("Name:" +student1.name);
	System.out.println("Total mark ="+ student1.Total());
System.out.println("Average:"+ student1.Average());
}
}
