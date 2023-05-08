package Encapsulation;

public class Account {

		private String bank ;
		
		private long accno;
		private String IFSC;
		private String branch;
		private String custmName;
		private double balance;
		private int pin;
		private String accType;
		private long phono;
		
		public Account() {
			// TODO Auto-generated constructor stub
		}
		
		public Account(String bank ,long accno, String IFSC, String branch,String custmName,double balance, int pin, String accType,long phono)
		{
			this.bank = bank;
			this.accno = accno;
			this.IFSC = IFSC;
			this.branch = branch;
			this.custmName = custmName;
			this.balance = balance;
			this.pin = pin;
			this.accType = accType;
			this.phono = phono;
			
			System.out.println("Account Created Successfully");
		}

		public String getBank() {
			return bank;
		}


		public long getAccno() {
			return accno;
		}


		public String getIFSC() {
			return IFSC;
		}

		public String getBranch() {
			return branch;
		}


		public String getCustmName() {
			return custmName;
		}

		public double getBalance(long accno, int pin) {
			if(accno == this.accno && pin == this.pin)
			{
				return balance;
			}
			else
			{
				System.out.println("Invalid Crendentials");
				return 0.0;
			}
		}

		public void setPin(long accno, int oldPin, int newPin) {
			if(accno == this.accno && oldPin == this.pin)
			{
				pin = newPin;
				System.out.println("Pin Changed Successfully");
			}
			else
			{
				System.out.println("Invalid Crendentials");
			}
		}

	

		public String getAccType() {
			return accType;
		}

		public long getPhono() {
			return phono;
		}		
		
		public void withdrawl(double amount, long accno, int pin)
		{
			if(accno == this.accno && [in == this.pin])
			{
				if(amount > 0 && (balance - amount) >= 2000)
				{
					balance -= amount;
					System.out.println("Amount Debited");
					System.out.println("Current Balance : " + balance);
				}
				else
				{
					System.out.println("Insufficient Balance");
				}
			}
			else
			{
				System.out.println("Invalid Crendentials");
			}
		}
		
		public void deposit(long accno, int pin, double amount)
		{
			if(accno == this.accno && pin == this.pin)
			{
				if(amount > 0)
				{
					balance = balance + amount;
					System.out.println("Amount Created");
					System.out.println(balance);
				}
				else
				{
					System.out.println("Invalid Amount");
				}
			}
			else
			{
				System.out.println("Invalid Credentials");
			}
		}
		
}
