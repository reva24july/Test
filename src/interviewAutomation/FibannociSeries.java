package interviewAutomation;

public class FibannociSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1=0,n2=1;
		int sum=0;
		for(int i=0;i<=10;i++)
		{
			sum=n1+n2;
			System.out.println(sum);
			n1=n2;
			n2=sum;
			
		}
		
	}

}
