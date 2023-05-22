package assignment;

public class Speed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double distanceinmile=24;
double timeinHour=1;
double timeinMin=40;
double timeinsec=35;
double Averagespeed=(distanceinmile*1.6)/(timeinHour+(timeinMin/60)+(timeinsec/120));
System.out.println("Average speed in kmph: "+Averagespeed);
	}

}
