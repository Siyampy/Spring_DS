package business;

public class Bank {
	private int amount=5000;
	private String accno="SBI123";
	public int deposit(String accno,int amount) 
	{
		if(accno.equals(this.accno))
		{
			System.out.println("In Deposit Method");
			this.amount=this.amount+amount;
			return this.amount;
		}
		else
		{
//			return 0;
			throw new AccNoNotFoundException();
		}
		
	}

}
