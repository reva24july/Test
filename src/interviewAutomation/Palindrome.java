package interviewAutomation;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=1234;
int revnum=0;

while(i!=0) {

int rem=i%10;
revnum=revnum*10+rem;

i=i/10;

	}
System.out.println(revnum);

}}
