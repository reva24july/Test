package basics;

import java.util.Scanner;

public class trial4 {
	
public void loop(int a) {
	for(int i=1;i<=a;i++) {
		System.out.println(i);
	}
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	trial4 looping=new trial4();
	System.out.println("enter the value of a:");
	int v=s.nextInt();
	looping.loop(v);

	}

}
