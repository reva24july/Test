package oops;
 class Seniorcitizenaccount extends Bankaccount{

	public void applyfixeddeposit() {
		super.interestrate=10.5;
		System.out.println("The interest rate of Seniorcitizenaccount:"+super.interestrate );
}
}