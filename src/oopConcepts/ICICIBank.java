package oopConcepts;

public class ICICIBank implements USbank{

	public ICICIBank() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(name);
		System.out.println(account);
		System.out.println(balance);
		System.out.println(USbank.balance);
		
		USbank us = new ICICIBank();
		
		System.out.println(us.balance);
		
		
		
		

	}

	@Override
	public void openAccount() {
		// TODO Auto-generated method stub
		System.out.println("ICICI OpenAccount");
		
	}

	@Override
	public void addBalance() {
		// TODO Auto-generated method stub
		System.out.println("ICICI addBalance");
		
	}

	@Override
	public void closeAccount() {
		// TODO Auto-generated method stub
		System.out.println("ICICI closeAccount");
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("ICICI withdraw");
		
	}
	
	public void  iMobile() {
		System.out.println("ICICI Specific Method");
		
	}

}
