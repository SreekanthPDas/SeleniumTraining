package oopConcepts;

public class testInterface {

	public testInterface() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		ICICIBank ic = new ICICIBank();
		
		ic.openAccount();
		ic.addBalance();
		ic.withdraw();
		ic.closeAccount();
		System.out.println(ic.name);
		System.out.println(ic.account+10000);
		ic.iMobile();
		USbank us = new ICICIBank();
		
		us.addBalance();
		

	}

}
