package oopConcepts;

public abstract class abstractClass {

	public abstractClass() {
		System.out.println("Abstract class constructor");
		
	}

	int abs = 1000;
	
	public abstract void testMethod();
	
	public abstract void testMethod2();
	
	public void print() {
		
		System.out.println("Non Abstract method in abstract class");
	}

}
