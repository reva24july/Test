package assignment;

public class Fan {
final int slow=1;
final int medium=2;
final int  fast=3;		
private int speed;
private boolean  on;
private double radius;
String color;
public Fan() {//default constructor***//
	speed=slow;
	on=false;
	radius=5;
	color="blue";	
}

public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	this.speed = speed;
}
public boolean isOn() {
	return on;
}
public void setOn(boolean on) {
	this.on = on;
}
public double getRadius() {
	return radius;
}
public void setRadius(double radius) {
	this.radius = radius;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}	
public void tostring() {
if(on) {
System.out.println("Speed,color and radius: "+speed  +color +radius);
}
else {
	System.out.println("color and radius: "+color +radius);
}
}
}
