package Encapsulation;

public class AccountDriver {

	public static void main(String[] args) {
		
		Account a1 = new Account("BOI", 987654321, "BKID4120", "Powai Naka", "Prathmesh Zunzarrao", 50000, 1234, "Student", 02162);
		
		
		a1.deposit(987654321, 1234, 457);
		//System.out.println(a1.getBalance(987654321, 1234));
		
		a1.setPin(987654321, 1234, 4567);
		
		System.out.println(a1.getAccType());
	}

}
