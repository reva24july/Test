package oops;

class NRIaccount extends Bankaccount {
	
	public void applyfixeddeposit()
	{
		super.interestrate=9.5;
		System.out.println("The interest rate of NRIaccount:"+super.interestrate );
	}

}