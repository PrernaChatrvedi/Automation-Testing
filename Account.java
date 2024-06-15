package Task10;

public class Account {
	public double balance;
	
	public Account(){
		this.balance=0.0;
		//System.out.println("Current bank balance is "+ balance);
	}
      public Account(double initbalance) {
		if(initbalance>=0.0) {
			balance = initbalance;
			System.out.println("account initial balance is:" + balance);
		}else
		{
			System.out.println("account initial balance can not be 0.0");
		}
	}

      public void deposit(double amount) {
    	  if(amount>0.0){
    		  balance = balance + amount;
    		  System.out.println("Current bank balance after deposit is "+ balance);
    	  }else
    	  {
    		  System.out.println("Deposit amount should be positive");
    	  }
      }
      
  public void withdraw(double amount) {
	  if(amount>0.0 && amount<balance) {
		  balance = balance - amount;
		  System.out.println("Current bank balance after withdraw is "+ balance);
	  }else 
	  {
		  System.out.println("Withdraw amount exceeded");
	  }
    	  
      }
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Below are the details of Account 1");
Account account1 = new Account();
account1.deposit(500.0);
account1.withdraw(1000);
System.out.println("Below are the details of Account 2");
Account account2 = new Account(1000.0);
account2.withdraw(200.0);
account2.deposit(500);
	}

}
