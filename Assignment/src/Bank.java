import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer cust =new Customer("sumer","sumer123","sumer23","sin23","kolkata","sumer@mail.com",8210597901L,23);
		Scanner scn =new Scanner(System.in);
		
		
		System.out.println("******************** Welcome to My Bank *******************");
		int choice;
		String Username;
		String Password;
		int i=1;
		
		while(i==1) {
			System.out.println("enter username :");
			Username = scn.nextLine();
			System.out.println("enter pssword :");
			Password = scn.nextLine();		
			if(cust.login(Username,Password)) {
				System.out.println("login Sucessfull");
				System.out.println();

				Account acc = new Account();
				acc.display();
                    System.out.println();
				Current cur = new Current();
				cur.display();
                    System.out.println();
				Saving sv = new Saving();
				sv.display();
				System.out.println();
				int ch = 1;
				while(ch == 1) {
					
					System.out.println("Please select the option");
					System.out.println("1. Deposit");
					System.out.println("2. Withdrawal");
					System.out.println("3. Check balance");
					System.out.println("4. Edit profile");
					System.out.println("5. Change Password");
					System.out.println("6. Exit");
					
					choice = scn.nextInt();
					switch(choice) {
					     
					case 1: 
						   System.out.println("enter the amout to be deposited");
						   float amount =scn.nextFloat();
						   System.out.println("updated amount is " + cust.deposit(amount));
						   break;
					case 2: 
						   System.out.println("enter the amout to Withdraw");
						   float amountW =scn.nextFloat();
						   System.out.println("updated amount is " + cust.withdrawal(amountW));
						   break;
					case 3: 
						   
						   System.out.println("current Balance is " + cust.checkBalance());
						   break;
						   
					case 4: 
						   
						   cust.editProfile();
						   break;
						   
					case 5: 
						   
						   cust.changePassword();
						   break;
						   
					case 6: 
						   
						   i--;
						   ch--;
						   break;
						   
				    default:
				    	   System.out.println("sorry you pressed wrong button ");

					
					}
					
					
				}
				
					
				}
			
			
			else {
				
				System.out.println("login failed");
			}
		
		}

	}

}
