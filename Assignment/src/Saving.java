public class saving extends Account{

	@Override
	void display() {
		 super.minBalance = 100;
         System.out.println("min balance needed for saving account with account id "+super.accountId+" is"+super.minBalance);
		
	}

}

