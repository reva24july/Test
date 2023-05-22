package basics;

import java.util.Scanner;

public class methoddemo1 {

	public int total(int a,int b,int c,int d,int e) {
	
int total=a+b+c+d+e;
return(total);
	}
	public float average(int total) {
		float average=total/5;
		return(average);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
methoddemo1 report=new methoddemo1();
Scanner s= new Scanner(System.in);
System.out.println("enter the marks for five subjects:Tamil,English,Math,Science,S.science");
int v1= s.nextInt();
int v2=s.nextInt();
int v3=s.nextInt();
int v4=s.nextInt();
int v5=s.nextInt();
int ave=report.total(v1,v2,v3,v4,v5);
System.out.println("Total marks:"+report.total(v1,v2,v3,v4,v5));
System.out.println("average:"+report.average(ave));
s.close();
	}
}
