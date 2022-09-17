package javaCore;

public class staticVSnonstatic {
	
	static int age = 30;
	String name = "Sree";

	public staticVSnonstatic() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Age: "+ age);

		System.out.println("Name :");
		
		display();
		staticVSnonstatic.display();
		
		staticVSnonstatic ss = new staticVSnonstatic();
		
		System.out.println("Call Stauc viwth Object " + ss.age);
	}
	
	static void display () {
		
		System.out.println("Staic display");
	}
	
	void sum() {
		
		System.out.println("Summmm");
	}

}
