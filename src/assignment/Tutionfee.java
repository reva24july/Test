package assignment;


public class Tutionfee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double tutionfee=10000;
double tutionperyear=0;
for(int i=0;i<=10;i++) {
	 tutionperyear = tutionfee+(tutionfee*0.05);
tutionfee=tutionperyear;
}
System.out.println(tutionperyear);
	}
}
