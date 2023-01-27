import java.util.Scanner;

public class Customer  implements Validation{
	
	public String name;
	public String Username;
	public String Password;
	public String SSn;
	public String Address;
	public String Email;
	public long phone;
	public float Balance;
	public int age;

	Scanner scn = new Scanner(System.in);
	
	public Customer(String name,String Username,String Password,String SSn,String Address,String email,long phone,int age) {
		this.name = name;
		this.Username = Username;
		this.Password = Password;
		this.SSn = SSn;
		this.Address = Address;
		this.Email = email;
		this.phone = phone;
		this.Balance =100;
		this.age=age;
		
		
		
	}
	
	public Boolean login(String Username,String Password) {
		if(this.Username.equals(Username)) {
			if(this.Password.equals(Password)) {
				return true;
			}
		}
		return false;
	}
	
	public float deposit(float amount) {
		this.Balance = Balance+amount;
		return this.Balance;
	}
	
	public float withdrawal(float amount) {
		this.Balance = Balance-amount;
		return this.Balance;
	}
	
	public float checkBalance() {
		return this.Balance;
	}
	
	public void editProfile() {
		System.out.println(" Please select the option");
		System.out.println("1. change name");
		System.out.println("2. change username");
		System.out.println("3. change address");
		System.out.println("4. change email");
		System.out.println("5. change phone");
		System.out.println("6. change age");
		
		int choice;
		
		choice = scn.nextInt();
		switch(choice) {
		
		case 1:
			System.out.println("enter new name");
			String newName = scn.next();
			this.name = newName;
			System.out.println("name updated " + this.name);
			break;
			
		case 2:
			System.out.println("enter new username");
			String newUsername = scn.next();
			this.Username = newUsername;
			System.out.println("Username updated ");
			break;
			
		case 3:
			System.out.println("enter new address");
			String newAddress = scn.next();
			this.Address = newAddress;
			System.out.println("address updated ");
			break;
			
		case 4:
			System.out.println("enter new email");
			String newEmail = scn.next();
			this.Email = newEmail;
			System.out.println("Email updated ");
			break;
			
		case 5:
			System.out.println("enter new phone no");
			long newPhone = scn.nextLong();
			this.phone = newPhone;
			System.out.println("Phone no updated");
			break;
		case 6:
			System.out.println("enter new age");
			int newAge = scn.nextInt();
			this.age = newAge;
			System.out.println("Age updated");
			break;
			
		default:
			System.out.println("you entered something wrong");
		       
		
		}
	
	}
	public void changePassword() {
		
		System.out.println("Enter current Password");
		String pass = scn.nextLine();
		if(this.Password.equals(pass)) {
			System.out.println("Enter new Password");
			String passNew1 = scn.nextLine();
			System.out.println("confirm new Password");
			String passNew2 = scn.nextLine();
			if(passNew1.equals(passNew2)) {
				this.Password = passNew1;
				System.out.println("Password changed sucessfully");
			}
			else {
				System.out.println("Passwords did not match");
			}
		}
		System.out.println("password incorrect");
	}
	
	public void validateSsn() {
		if(this.SSn.length() == 9) {
			System.out.println("SSN validated sucessfully");
		}
		else
		{
			System.out.println("please check the length of SSn");
		}
		
	}

	public void validateAge() {
		if(this.age >18) {
			System.out.println("valid age can open account");
		}
		else
		{
			System.out.println("sorry not eligible for opening a bank account");
		}
	}

}
