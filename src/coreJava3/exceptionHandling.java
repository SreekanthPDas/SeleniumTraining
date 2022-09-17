package coreJava3;

public class exceptionHandling {

	public exceptionHandling() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		try {
			
			int i = 9/0;
			
			
						
		}catch(Throwable e) {
			System.out.println("Exception " + e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("After Catch ");
		
		exceptionHandling obj = new exceptionHandling();
		obj.div();

	}
	
	public void div() throws Exception{
		int i = 10/0;
	}

}
