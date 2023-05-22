package oops;


public class Bankaccount {
	public	double depositamount;
		public double withdrawamount;
		public double balance;
		public double interestrate;
		
		public void depositmoney(double depositamount) {
			System.out.println("Deposit amount:"+depositamount);
		}
		public void withdrawalmoney(double depositamount,double withdrawamount) {
			balance=(depositamount-withdrawamount);
			System.out.println("Balance amount:"+balance);
		}
		public void applyfixeddeposit() {
			interestrate=8;
				System.out.println("The interest rate for normal bank account:"+interestrate);
			
		}
		


}
