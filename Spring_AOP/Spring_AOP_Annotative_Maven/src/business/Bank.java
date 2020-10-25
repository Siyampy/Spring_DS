package business;

import org.springframework.stereotype.Component;

@Component
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
			return 0;
//			throw new AccNoNotFoundException();
		}
		
	}
//	Here we should need to configure the point cut classes to provide the condition andso the 
//	the services ar not executed for the specific method.
	public int balance(String ac)
	{System.out.println("Executing in balance");
		if(ac.equals(this.accno))
		{
			return this.amount;
		}
		else {
			throw new AccNoNotFoundException();
		}
	}

}
