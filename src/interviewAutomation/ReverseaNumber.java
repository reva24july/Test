package interviewAutomation;

public class ReverseaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=2345;
int rem=0;
while(num!=0){
 rem=rem*10+num%10;
num=num/10;
	}
System.out.println(rem);
}}
