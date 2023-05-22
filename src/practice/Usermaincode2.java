package practice;

public class Usermaincode2 {
	public static int sumofsquaresofEvenDigits(int n) {
		int sum=0;
		int rem;
		while(n!=0) {
			rem=n%10;
			if(rem%2==0) {
			sum=sum+(rem*rem);
			}
			n=n/10;
		}
	

	return sum;
		
	}

}
