package practice;

public class Usermaincode {
	public int checksum(int n) {
		int sum=0;
		int rem;
		int r;
		while(n!=0) {
			rem=n%10;
			if(rem/2!=0) {
				sum=sum+rem;
			}n=n/10;
	}
	if(sum/2==0) {
		r= -1;
	}else {
		r= 1;
	}return r;
	}
	}

