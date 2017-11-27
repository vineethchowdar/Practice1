package accounts;

public class TestAccount {

	public static void main(String[] args) {
			Account a1=new Account();  
			a1.insert(12345,"vineeth",28000);  
			a1.display();  
			a1.deposit(2000);  
			a1.checkBalance();  
			a1.withdraw(30000);  
			a1.checkBalance();  
			}

	}

