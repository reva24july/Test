package oops;
public class Hierarchicalinstnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bankaccount b=new Bankaccount();
b.applyfixeddeposit();
b.depositmoney(50000);
b.withdrawalmoney(50000,20000);
		
NRIaccount n=new NRIaccount();
n.applyfixeddeposit();
n.depositmoney(10000);
n.withdrawalmoney(10000,5000);

Seniorcitizenaccount s=new Seniorcitizenaccount();
s.applyfixeddeposit();
s.depositmoney(20000);
s.withdrawalmoney(20000,3000);

	}

}
