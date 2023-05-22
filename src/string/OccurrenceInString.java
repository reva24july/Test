package string;
import java.util.Scanner;


public class OccurrenceInString {
public void  findingOccurrence(String s,char value) {
	int count=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)==value) {
			count++;
		}		
}
	System.out.println(count);
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	// TODO Auto-generated method stub
System.out.println("Enter a string:");
String s=sc.next();
OccurrenceInString o=new OccurrenceInString();
o.findingOccurrence(s,'i');
	}

}
