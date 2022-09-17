package oopConcepts;

public class Testcar {

	public Testcar() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		BMW b = new BMW();
		
		b.start();
		b.stop();
		b.run();
		b.Luxuary();
		b.travel();
		
		car c = new BMW();
		System.out.println("**********************************");
		c.start();
		c.stop();
		c.run();
		c.travel();
		try {
			int n =10;
			System.out.println("Division :" + n/10);
			
		}catch(Exception e) {
			System.out.println("Excepton Message :" + e.getMessage());
		}finally {
			System.out.println("This is Finally");
		}
		

	}

}
