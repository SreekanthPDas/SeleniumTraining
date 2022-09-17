/**
 * 
 */
package javaCore;

/**
 * @author sreek
 *
 */
public class javaBasic {

	public int ix = 3;
	public double dx = 20.23;
	
	protected int protectedInt = 120;
	
	protected void protectedMethod() {
		System.out.println("Protected method...");
	}
	
	
	public javaBasic() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int ix = 3;
		double dx = 20.23;
		
		ix = (int) dx;
		
		System.out.println("Int X " + ix);
		
		System.out.println("Double X " + dx);
		
		
		String x = "Enna ondeda uvve...";
		
		System.out.println(" " + x.charAt(3));
		System.out.println(" " + x.codePointAt(3));
		System.out.println(" " + x.compareTo("Text"));
		System.out.println(" " + x.indexOf('d'));
		System.out.println(" " + x.lastIndexOf("onde"));
		System.out.println(" " + x.repeat(3));
		System.out.println(" " + x.substring(3));
		System.out.println(" " + x.isBlank());
		
		String y = "intermediate \\'\"text\"\\' continued";
		
		System.out.println(" " + y);
		
		int randomNum = (int) (Math.random()*20);
		System.out.println(" " + randomNum);
		System.out.println(12<45 ? "Yes" : "no");
		
		int xy =3;
		switch(  xy ) {
		
		case 3:
				System.out.println("Case3");
				
		case 's':
				System.out.println("Case s");
				
		default:
				System.out.println("Default text");
		}
		
		while (xy <20) {
			if(xy==25) {
				continue;
			}
			System.out.println(xy);
			xy+=1;
			
		}
		
		do{
			if(xy==25) {
				continue;
			}
			System.out.println(xy);
			xy+=1;
		}while(xy<30);
		
		
		String [] cars = {"maruti", "volvo", "BMW", "TATA"};
		
		for(String i: cars) {
			System.out.println(i);
		}
		
		
	}

}
