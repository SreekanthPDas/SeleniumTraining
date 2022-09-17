package oopConcepts;

public class extendAbstarctClass extends abstractClass{

	public extendAbstarctClass() {
		
		System.out.println("");
		
	}
	
	public static void main(String args[]) {
		
		extendAbstarctClass x = new extendAbstarctClass();
		
		x.testMethod();
		x.testMethod2();
		System.out.println(x.abs);
	}

	@Override
	public void testMethod() {
		System.out.println();
		
	}

	@Override
	public void testMethod2() {
		// TODO Auto-generated method stub
		
	}

}
